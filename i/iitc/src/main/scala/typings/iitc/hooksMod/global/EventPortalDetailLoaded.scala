package typings.iitc.hooksMod.global

import typings.iitc.iitcBooleans.`false`
import typings.iitc.iitcBooleans.`true`
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.iitc.anon.Details
  - typings.iitc.anon.Guid
*/
trait EventPortalDetailLoaded extends js.Object
object EventPortalDetailLoaded {
  
  @scala.inline
  def Details(details: PortalDataDetail, ent: PortalDetailEnt, guid: String, success: `true`): EventPortalDetailLoaded = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalDetailLoaded]
  }
  
  @scala.inline
  def Guid(guid: String, success: `false`): EventPortalDetailLoaded = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalDetailLoaded]
  }
}
