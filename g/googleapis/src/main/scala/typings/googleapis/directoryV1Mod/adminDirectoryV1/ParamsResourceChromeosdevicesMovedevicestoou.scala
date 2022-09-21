package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChromeosdevicesMovedevicestoou
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. ID of the Google Workspace account
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Full path of the target organizational unit or its ID
    */
  var orgUnitPath: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChromeOsMoveDevicesToOu] = js.undefined
}
object ParamsResourceChromeosdevicesMovedevicestoou {
  
  inline def apply(): ParamsResourceChromeosdevicesMovedevicestoou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChromeosdevicesMovedevicestoou]
  }
  
  extension [Self <: ParamsResourceChromeosdevicesMovedevicestoou](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setRequestBody(value: SchemaChromeOsMoveDevicesToOu): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
