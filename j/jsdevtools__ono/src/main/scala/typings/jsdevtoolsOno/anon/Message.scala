package typings.jsdevtoolsOno.anon

import typings.jsdevtoolsOno.typesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message[E /* <: ErrorLike */, P /* <: js.Object */] extends js.Object {
  var message: String = js.native
  var originalError: js.UndefOr[E] = js.native
  var props: js.UndefOr[P] = js.native
}

object Message {
  @scala.inline
  def apply[/* <: typings.jsdevtoolsOno.typesMod.ErrorLike */ E, /* <: js.Object */ P](message: String): Message[E, P] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message[E, P]]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message[_, _], /* <: typings.jsdevtoolsOno.typesMod.ErrorLike */ E, /* <: js.Object */ P] (val x: Self with (Message[E, P])) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalError(value: E): Self = this.set("originalError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalError: Self = this.set("originalError", js.undefined)
    @scala.inline
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
  
}

