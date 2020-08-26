package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceClientCreate[T /* <: js.Object */, U /* <: js.Object */] extends js.Object {
  def create(details: U): js.Promise[T] = js.native
}

object ResourceClientCreate {
  @scala.inline
  def apply[/* <: js.Object */ T, /* <: js.Object */ U](create: U => js.Promise[T]): ResourceClientCreate[T, U] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ResourceClientCreate[T, U]]
  }
  @scala.inline
  implicit class ResourceClientCreateOps[Self <: ResourceClientCreate[_, _], /* <: js.Object */ T, /* <: js.Object */ U] (val x: Self with (ResourceClientCreate[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: U => js.Promise[T]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

