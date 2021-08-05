package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerListConfigurationsResponse extends StObject {
  
  /** The configurations. */
  var configurations: js.UndefOr[js.Array[Configuration]] = js.undefined
}
object CustomerListConfigurationsResponse {
  
  inline def apply(): CustomerListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerListConfigurationsResponse]
  }
  
  extension [Self <: CustomerListConfigurationsResponse](x: Self) {
    
    inline def setConfigurations(value: js.Array[Configuration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
