package typings.intercomDashClient.tagMod

import typings.intercomDashClient.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCompanies extends TagOper {
  var name: String
  var users: js.Array[Anon_Id]
}

object TagCompanies {
  @scala.inline
  def apply(name: String, users: js.Array[Anon_Id]): TagCompanies = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagCompanies]
  }
}

