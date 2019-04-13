package typings
package intercomDashClientLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCompanies extends TagOper {
  var name: java.lang.String
  var users: js.Array[intercomDashClientLib.Anon_IdString]
}

object TagCompanies {
  @scala.inline
  def apply(name: java.lang.String, users: js.Array[intercomDashClientLib.Anon_IdString]): TagCompanies = {
    val __obj = js.Dynamic.literal(name = name, users = users)
  
    __obj.asInstanceOf[TagCompanies]
  }
}

