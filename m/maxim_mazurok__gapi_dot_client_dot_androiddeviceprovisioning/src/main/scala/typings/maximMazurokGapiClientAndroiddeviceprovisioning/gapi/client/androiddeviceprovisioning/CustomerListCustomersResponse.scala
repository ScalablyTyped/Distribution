package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerListCustomersResponse extends StObject {
  
  /** The customer accounts the calling user is a member of. */
  var customers: js.UndefOr[js.Array[Company]] = js.undefined
  
  /** A token used to access the next page of results. Omitted if no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CustomerListCustomersResponse {
  
  inline def apply(): CustomerListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerListCustomersResponse]
  }
  
  extension [Self <: CustomerListCustomersResponse](x: Self) {
    
    inline def setCustomers(value: js.Array[Company]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: Company*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
