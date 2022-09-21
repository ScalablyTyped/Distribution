package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV2Getcmeksettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource for which to retrieve CMEK settings. "projects/[PROJECT_ID]/cmekSettings" "organizations/[ORGANIZATION_ID]/cmekSettings" "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings" "folders/[FOLDER_ID]/cmekSettings" For example:"organizations/12345/cmekSettings"Note: CMEK for the Log Router can be configured for Google Cloud projects, folders, organizations and billing accounts. Once configured for an organization, it applies to all projects and folders in the Google Cloud organization.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceV2Getcmeksettings {
  
  inline def apply(): ParamsResourceV2Getcmeksettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV2Getcmeksettings]
  }
  
  extension [Self <: ParamsResourceV2Getcmeksettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
