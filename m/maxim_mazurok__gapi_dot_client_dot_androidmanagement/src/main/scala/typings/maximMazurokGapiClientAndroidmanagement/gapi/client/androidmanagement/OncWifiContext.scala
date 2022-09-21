package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OncWifiContext extends StObject {
  
  /** The GUID of non-compliant Wi-Fi configuration. */
  var wifiGuid: js.UndefOr[String] = js.undefined
}
object OncWifiContext {
  
  inline def apply(): OncWifiContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OncWifiContext]
  }
  
  extension [Self <: OncWifiContext](x: Self) {
    
    inline def setWifiGuid(value: String): Self = StObject.set(x, "wifiGuid", value.asInstanceOf[js.Any])
    
    inline def setWifiGuidUndefined: Self = StObject.set(x, "wifiGuid", js.undefined)
  }
}
