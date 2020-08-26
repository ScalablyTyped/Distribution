package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatarurl extends js.Object {
  var avatar_url: js.UndefOr[String] = js.native
  var displayname: js.UndefOr[String] = js.native
}

object Avatarurl {
  @scala.inline
  def apply(): Avatarurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatarurl]
  }
  @scala.inline
  implicit class AvatarurlOps[Self <: Avatarurl] (val x: Self) extends AnyVal {
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar_url: Self = this.set("avatar_url", js.undefined)
    @scala.inline
    def setDisplayname(value: String): Self = this.set("displayname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayname: Self = this.set("displayname", js.undefined)
  }
  
}

