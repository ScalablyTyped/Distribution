package typings.intercomDashClient.tagMod

import typings.intercomDashClient.Anon_IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCompanies extends TagOper {
  var name: String
  var users: js.Array[Anon_IdString]
}

object TagCompanies {
  @scala.inline
  def apply(name: String, users: js.Array[Anon_IdString]): TagCompanies = {
    val __obj = js.Dynamic.literal(name = name, users = users)
  
    __obj.asInstanceOf[TagCompanies]
  }
}

