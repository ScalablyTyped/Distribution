package typings.intercomClient.tagMod

import typings.intercomClient.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCompanies extends TagOper {
  var name: String
  var users: js.Array[Id]
}

object TagCompanies {
  @scala.inline
  def apply(name: String, users: js.Array[Id]): TagCompanies = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCompanies]
  }
}

