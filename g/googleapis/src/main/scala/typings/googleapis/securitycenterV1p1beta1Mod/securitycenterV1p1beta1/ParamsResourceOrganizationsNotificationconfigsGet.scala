package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsNotificationconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the notification config to get. Its format is "organizations/[organization_id]/notificationConfigs/[config_id]".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsNotificationconfigsGet {
  
  inline def apply(): ParamsResourceOrganizationsNotificationconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsNotificationconfigsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsNotificationconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
