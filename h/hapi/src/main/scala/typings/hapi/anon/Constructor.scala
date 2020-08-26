package typings.hapi.anon

import typings.catbox.mod.ClientOptions
import typings.catbox.mod.EnginePrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor[T /* <: ClientOptions */] extends js.Object {
  var constructor: EnginePrototype[_] = js.native
  var options: js.UndefOr[T] = js.native
}

object Constructor {
  @scala.inline
  def apply[/* <: typings.catbox.mod.ClientOptions */ T](constructor: EnginePrototype[_]): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
  @scala.inline
  implicit class ConstructorOps[Self <: Constructor[_], /* <: typings.catbox.mod.ClientOptions */ T] (val x: Self with Constructor[T]) extends AnyVal {
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
    def setConstructor(value: EnginePrototype[_]): Self = this.set("constructor", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: T): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

