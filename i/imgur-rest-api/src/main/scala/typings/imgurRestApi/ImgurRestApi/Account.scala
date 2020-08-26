package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var bio: String = js.native
  var created: Double = js.native
  var id: Double = js.native
  var pro_expiration: js.Any = js.native
  var reputation: Double = js.native
  var url: String = js.native
}

object Account {
  @scala.inline
  def apply(bio: String, created: Double, id: Double, pro_expiration: js.Any, reputation: Double, url: String): Account = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pro_expiration = pro_expiration.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPro_expiration(value: js.Any): Self = this.set("pro_expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def setReputation(value: Double): Self = this.set("reputation", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

