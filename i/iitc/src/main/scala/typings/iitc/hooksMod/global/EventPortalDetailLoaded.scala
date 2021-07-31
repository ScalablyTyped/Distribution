package typings.iitc.hooksMod.global

import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.iitc.anon.Details
  - typings.iitc.anon.Guid
*/
trait EventPortalDetailLoaded extends StObject
object EventPortalDetailLoaded {
  
  @scala.inline
  def Details(details: PortalDataDetail, ent: PortalDetailEnt, guid: String): typings.iitc.anon.Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[typings.iitc.anon.Details]
  }
  
  @scala.inline
  def Guid(guid: String): typings.iitc.anon.Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[typings.iitc.anon.Guid]
  }
}
