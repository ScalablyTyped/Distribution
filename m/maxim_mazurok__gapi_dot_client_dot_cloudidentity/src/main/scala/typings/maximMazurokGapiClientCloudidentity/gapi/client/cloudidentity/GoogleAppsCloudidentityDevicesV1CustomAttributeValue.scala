package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1CustomAttributeValue extends StObject {
  
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** Represents a double value. */
  var numberValue: js.UndefOr[Double] = js.undefined
  
  /** Represents a string value. */
  var stringValue: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1CustomAttributeValue {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1CustomAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CustomAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1CustomAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
