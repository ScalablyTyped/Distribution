package typings.intercomClient.tagMod

import typings.intercomClient.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCompanies extends TagOper {
  var name: String
  var users: js.Array[AnonId]
}

object TagCompanies {
  @scala.inline
  def apply(name: String, users: js.Array[AnonId]): TagCompanies = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagCompanies]
  }
}

