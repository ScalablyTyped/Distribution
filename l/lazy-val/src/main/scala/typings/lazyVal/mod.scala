package typings.lazyVal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lazy-val", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Lazy[T] protected () extends js.Object {
    def this(creator: js.Function0[js.Promise[T]]) = this()
    var _value: js.Any = js.native
    var creator: js.Any = js.native
    val hasValue: Boolean = js.native
    var value: js.Promise[T] = js.native
  }
  
}

