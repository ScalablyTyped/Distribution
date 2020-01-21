package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var bio: String
  var created: Double
  var id: Double
  var pro_expiration: js.Any
  var reputation: Double
  var url: String
}

object Account {
  @scala.inline
  def apply(bio: String, created: Double, id: Double, pro_expiration: js.Any, reputation: Double, url: String): Account = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pro_expiration = pro_expiration.asInstanceOf[js.Any], reputation = reputation.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Account]
  }
}

