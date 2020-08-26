package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displayname extends js.Object {
  var avatar_url: js.UndefOr[String | Null] = js.native
  var display_name: js.UndefOr[String | Null] = js.native
  var user_id: String = js.native
}

object Displayname {
  @scala.inline
  def apply(user_id: String): Displayname = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  @scala.inline
  implicit class DisplaynameOps[Self <: Displayname] (val x: Self) extends AnyVal {
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
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar_url: Self = this.set("avatar_url", js.undefined)
    @scala.inline
    def setAvatar_urlNull: Self = this.set("avatar_url", null)
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    @scala.inline
    def setDisplay_nameNull: Self = this.set("display_name", null)
  }
  
}

