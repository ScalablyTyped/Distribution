package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIsArrayLikeObject extends js.Object {
  def apply(): /* is never */ scala.Boolean = js.native
  def apply(value: java.lang.String): /* is never */ scala.Boolean = js.native
  def apply(value: js.Function): /* is never */ scala.Boolean = js.native
  // tslint:disable-next-line:ban-types (type guard doesn't seem to work correctly without the Function type)
  def apply(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ scala.Boolean = js.native
  def apply(value: scala.Boolean): /* is never */ scala.Boolean = js.native
  def apply(value: scala.Double): /* is never */ scala.Boolean = js.native
  // tslint:disable-next-line:ban-types (type guard doesn't seem to work correctly without the Function type)
  def apply[T /* <: js.Object */](value: T): scala.Boolean = js.native
}

