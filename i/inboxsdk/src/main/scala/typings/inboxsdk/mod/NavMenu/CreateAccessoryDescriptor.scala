package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.inboxsdkStrings.CREATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessoryDescriptor extends js.Object {
  var `type`: CREATE = js.native
  def onClick(): Unit = js.native
}

object CreateAccessoryDescriptor {
  @scala.inline
  def apply(onClick: () => Unit, `type`: CREATE): CreateAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessoryDescriptor]
  }
  @scala.inline
  implicit class CreateAccessoryDescriptorOps[Self <: CreateAccessoryDescriptor] (val x: Self) extends AnyVal {
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
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: CREATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

