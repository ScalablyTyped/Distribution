package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsNotificationconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the notification config to delete. Its format is "organizations/[organization_id]/notificationConfigs/[config_id]".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsNotificationconfigsDelete {
  
  inline def apply(): ParamsResourceOrganizationsNotificationconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsNotificationconfigsDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsNotificationconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
