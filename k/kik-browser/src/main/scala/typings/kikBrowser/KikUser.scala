package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikUser extends js.Object {
  var firstName: String = js.native
  var fullName: String = js.native
  var lastName: String = js.native
  var pic: String = js.native
  var thumbnail: String = js.native
  var username: String = js.native
}

object KikUser {
  @scala.inline
  def apply(
    firstName: String,
    fullName: String,
    lastName: String,
    pic: String,
    thumbnail: String,
    username: String
  ): KikUser = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikUser]
  }
  @scala.inline
  implicit class KikUserOps[Self <: KikUser] (val x: Self) extends AnyVal {
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
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPic(value: String): Self = this.set("pic", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

