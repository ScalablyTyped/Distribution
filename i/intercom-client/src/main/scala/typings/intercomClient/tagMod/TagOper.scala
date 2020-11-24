package typings.intercomClient.tagMod

import typings.intercomClient.anon.Id
import typings.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intercomClient.tagMod.TagCompanies
  - typings.intercomClient.tagMod.TagUsers
*/
trait TagOper extends js.Object
object TagOper {
  
  @scala.inline
  def TagCompanies(name: String, users: js.Array[Id]): TagOper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOper]
  }
  
  @scala.inline
  def TagUsers(name: String, users: js.Array[UserIdentifier]): TagOper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagOper]
  }
}
