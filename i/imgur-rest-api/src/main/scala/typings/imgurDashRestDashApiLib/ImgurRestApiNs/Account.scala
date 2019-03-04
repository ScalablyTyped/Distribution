package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var bio: java.lang.String
  var created: scala.Double
  var id: scala.Double
  var pro_expiration: js.Any
  var reputation: scala.Double
  var url: java.lang.String
}

object Account {
  @scala.inline
  def apply(
    bio: java.lang.String,
    created: scala.Double,
    id: scala.Double,
    pro_expiration: js.Any,
    reputation: scala.Double,
    url: java.lang.String
  ): Account = {
    val __obj = js.Dynamic.literal(bio = bio, created = created, id = id, pro_expiration = pro_expiration, reputation = reputation, url = url)
  
    __obj.asInstanceOf[Account]
  }
}

