package typings.jsonStreamStringify

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-stream-stringify", JSImport.Namespace)
  @js.native
  class ^ protected () extends JsonStreamStringify {
    def this(value: js.Any) = this()
    def this(value: js.Any, replacer: js.Array[_]) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _]) = this()
    def this(value: js.Any, replacer: js.UndefOr[scala.Nothing], spaces: String) = this()
    def this(value: js.Any, replacer: js.UndefOr[scala.Nothing], spaces: Double) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: String) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: Double) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _], spaces: String) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _], spaces: Double) = this()
    def this(
      value: js.Any,
      replacer: js.UndefOr[scala.Nothing],
      spaces: js.UndefOr[scala.Nothing],
      cycle: Boolean
    ) = this()
    def this(value: js.Any, replacer: js.UndefOr[scala.Nothing], spaces: String, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.UndefOr[scala.Nothing], spaces: Double, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: js.UndefOr[scala.Nothing], cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: String, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: Double, cycle: Boolean) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _],
      spaces: js.UndefOr[scala.Nothing],
      cycle: Boolean
    ) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _],
      spaces: String,
      cycle: Boolean
    ) = this()
    def this(
      value: js.Any,
      replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _],
      spaces: Double,
      cycle: Boolean
    ) = this()
  }
  
  @js.native
  trait JsonStreamStringify extends Readable {
    
    def path(): js.Tuple2[String, Double] = js.native
    
    var stack: js.Array[String] = js.native
  }
}
