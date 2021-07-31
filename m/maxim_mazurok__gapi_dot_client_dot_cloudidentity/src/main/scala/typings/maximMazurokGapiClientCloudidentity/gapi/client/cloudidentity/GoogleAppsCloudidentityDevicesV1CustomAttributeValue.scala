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
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1CustomAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CustomAttributeValue]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1CustomAttributeValueMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1CustomAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
