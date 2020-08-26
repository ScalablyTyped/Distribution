package typings.intercomClient.userMod

import typings.intercomClient.intercomClientStrings.avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var image_url: String | Null = js.native
  var `type`: avatar = js.native
}

object Avatar {
  @scala.inline
  def apply(`type`: avatar): Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
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
    def setType(value: avatar): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_urlNull: Self = this.set("image_url", null)
  }
  
}

