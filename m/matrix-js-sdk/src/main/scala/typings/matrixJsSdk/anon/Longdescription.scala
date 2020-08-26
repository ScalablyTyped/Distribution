package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Longdescription extends js.Object {
  // <optional> Name of the group
  var avatar_url: String = js.native
  // <optional> A short description of the room
  var long_description: String = js.native
  var name: String = js.native
  // <optional> MXC avatar URL
  var short_description: String = js.native
}

object Longdescription {
  @scala.inline
  def apply(avatar_url: String, long_description: String, name: String, short_description: String): Longdescription = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], long_description = long_description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longdescription]
  }
  @scala.inline
  implicit class LongdescriptionOps[Self <: Longdescription] (val x: Self) extends AnyVal {
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
    def setLong_description(value: String): Self = this.set("long_description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_description(value: String): Self = this.set("short_description", value.asInstanceOf[js.Any])
  }
  
}

