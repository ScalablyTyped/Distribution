package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomerDevicesChromeosIssuecommand
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. ID of the Google Workspace account.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. ID of Chrome OS Device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDirectoryChromeosdevicesIssueCommandRequest] = js.undefined
}
object ParamsResourceCustomerDevicesChromeosIssuecommand {
  
  inline def apply(): ParamsResourceCustomerDevicesChromeosIssuecommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomerDevicesChromeosIssuecommand]
  }
  
  extension [Self <: ParamsResourceCustomerDevicesChromeosIssuecommand](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setRequestBody(value: SchemaDirectoryChromeosdevicesIssueCommandRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
