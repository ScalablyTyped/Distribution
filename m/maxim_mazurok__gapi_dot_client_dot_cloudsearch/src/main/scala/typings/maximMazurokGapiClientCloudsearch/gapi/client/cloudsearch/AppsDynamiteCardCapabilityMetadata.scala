package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteCardCapabilityMetadata extends StObject {
  
  /** NEXT TAG : 2 */
  var requiredCapabilities: js.UndefOr[js.Array[String]] = js.undefined
}
object AppsDynamiteCardCapabilityMetadata {
  
  inline def apply(): AppsDynamiteCardCapabilityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteCardCapabilityMetadata]
  }
  
  extension [Self <: AppsDynamiteCardCapabilityMetadata](x: Self) {
    
    inline def setRequiredCapabilities(value: js.Array[String]): Self = StObject.set(x, "requiredCapabilities", value.asInstanceOf[js.Any])
    
    inline def setRequiredCapabilitiesUndefined: Self = StObject.set(x, "requiredCapabilities", js.undefined)
    
    inline def setRequiredCapabilitiesVarargs(value: String*): Self = StObject.set(x, "requiredCapabilities", js.Array(value*))
  }
}
