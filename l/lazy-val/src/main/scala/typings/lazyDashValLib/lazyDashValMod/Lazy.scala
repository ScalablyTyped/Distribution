package typings
package lazyDashValLib.lazyDashValMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lazy-val", "Lazy")
@js.native
class Lazy[T] protected () extends js.Object {
  def this(creator: js.Function0[js.Promise[T]]) = this()
  var _value: js.Any = js.native
  var creator: js.Any = js.native
  val hasValue: scala.Boolean = js.native
  var value: js.Promise[T] = js.native
}

