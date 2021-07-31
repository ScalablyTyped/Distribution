package typings.jsonStreamStringify

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-stream-stringify", JSImport.Namespace)
  @js.native
  class ^ protected () extends JsonStreamStringify {
    def this(value: js.Any) = this()
    def this(value: js.Any, replacer: js.Array[js.Any]) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]) = this()
    def this(value: js.Any, replacer: js.Array[js.Any], spaces: String) = this()
    def this(value: js.Any, replacer: js.Array[js.Any], spaces: Double) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any],
      spaces: String
    ) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any],
      spaces: Double
    ) = this()
    def this(value: js.Any, replacer: Unit, spaces: String) = this()
    def this(value: js.Any, replacer: Unit, spaces: Double) = this()
    def this(value: js.Any, replacer: js.Array[js.Any], spaces: String, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[js.Any], spaces: Double, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[js.Any], spaces: Unit, cycle: Boolean) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any],
      spaces: String,
      cycle: Boolean
    ) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any],
      spaces: Double,
      cycle: Boolean
    ) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any],
      spaces: Unit,
      cycle: Boolean
    ) = this()
    def this(value: js.Any, replacer: Unit, spaces: String, cycle: Boolean) = this()
    def this(value: js.Any, replacer: Unit, spaces: Double, cycle: Boolean) = this()
    def this(value: js.Any, replacer: Unit, spaces: Unit, cycle: Boolean) = this()
  }
  
  @js.native
  trait JsonStreamStringify extends Readable {
    
    def path(): js.Tuple2[String, Double] = js.native
    
    var stack: js.Array[String] = js.native
  }
}
