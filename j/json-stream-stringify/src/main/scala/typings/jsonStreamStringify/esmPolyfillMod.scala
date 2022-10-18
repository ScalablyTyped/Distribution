package typings.jsonStreamStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object esmPolyfillMod {
  
  @JSImport("json-stream-stringify/esm/polyfill", "JsonStreamStringify")
  @js.native
  open class JsonStreamStringify protected ()
    extends typings.jsonStreamStringify.mod.JsonStreamStringify {
    def this(value: Any) = this()
    def this(value: Any, replacer: js.Array[Any]) = this()
    def this(value: Any, replacer: js.Function) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: String) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Double) = this()
    def this(value: Any, replacer: js.Function, spaces: String) = this()
    def this(value: Any, replacer: js.Function, spaces: Double) = this()
    def this(value: Any, replacer: Unit, spaces: String) = this()
    def this(value: Any, replacer: Unit, spaces: Double) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Array[Any], spaces: Unit, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: js.Function, spaces: Unit, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: String, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: Double, cycle: Boolean) = this()
    def this(value: Any, replacer: Unit, spaces: Unit, cycle: Boolean) = this()
  }
  
  @JSImport("json-stream-stringify/esm/polyfill", "Types")
  @js.native
  object Types extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.jsonStreamStringify.mod.Types & Double] = js.native
    
    /* 0 */ val Array: typings.jsonStreamStringify.mod.Types.Array & Double = js.native
    
    /* 1 */ val Object: typings.jsonStreamStringify.mod.Types.Object & Double = js.native
    
    /* 4 */ val Primitive: typings.jsonStreamStringify.mod.Types.Primitive & Double = js.native
    
    /* 5 */ val Promise: typings.jsonStreamStringify.mod.Types.Promise & Double = js.native
    
    /* 3 */ val ReadableObject: typings.jsonStreamStringify.mod.Types.ReadableObject & Double = js.native
    
    /* 2 */ val ReadableString: typings.jsonStreamStringify.mod.Types.ReadableString & Double = js.native
  }
}
