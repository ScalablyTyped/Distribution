package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  def create(details: U): js.Promise[T]
}

object ResourceClientCreate {
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](create: js.Function1[U, js.Promise[T]]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
}

