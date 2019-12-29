package typings.jsonDashStreamDashStringify

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-stream-stringify", JSImport.Namespace)
@js.native
object jsonDashStreamDashStringifyMod extends js.Object {
  @js.native
  trait JsonStreamStringify extends Readable {
    def path(): js.Tuple2[String, Double] = js.native
  }
  
  @js.native
  class default protected () extends JsonStreamStringify {
    def this(value: js.Any) = this()
    def this(value: js.Any, replacer: js.Array[_]) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _]) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: String) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: Double) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _], spaces: String) = this()
    def this(value: js.Any, replacer: js.Function2[/* key */ js.Any, /* value */ js.Any, _], spaces: Double) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: String, cycle: Boolean) = this()
    def this(value: js.Any, replacer: js.Array[_], spaces: Double, cycle: Boolean) = this()
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
  
}

