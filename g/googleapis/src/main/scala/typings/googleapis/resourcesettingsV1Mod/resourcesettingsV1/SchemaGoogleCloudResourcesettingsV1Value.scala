package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1Value extends StObject {
  
  /**
    * Defines this value as being a boolean value.
    */
  var booleanValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Defines this value as being a Duration.
    */
  var durationValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines this value as being a Enum.
    */
  var enumValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1ValueEnumValue] = js.undefined
  
  /**
    * Defines this value as being a StringMap.
    */
  var stringMapValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1ValueStringMap] = js.undefined
  
  /**
    * Defines this value as being a StringSet.
    */
  var stringSetValue: js.UndefOr[SchemaGoogleCloudResourcesettingsV1ValueStringSet] = js.undefined
  
  /**
    * Defines this value as being a string value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1Value {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1Value]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1Value](x: Self) {
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueNull: Self = StObject.set(x, "booleanValue", null)
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDurationValue(value: String): Self = StObject.set(x, "durationValue", value.asInstanceOf[js.Any])
    
    inline def setDurationValueNull: Self = StObject.set(x, "durationValue", null)
    
    inline def setDurationValueUndefined: Self = StObject.set(x, "durationValue", js.undefined)
    
    inline def setEnumValue(value: SchemaGoogleCloudResourcesettingsV1ValueEnumValue): Self = StObject.set(x, "enumValue", value.asInstanceOf[js.Any])
    
    inline def setEnumValueUndefined: Self = StObject.set(x, "enumValue", js.undefined)
    
    inline def setStringMapValue(value: SchemaGoogleCloudResourcesettingsV1ValueStringMap): Self = StObject.set(x, "stringMapValue", value.asInstanceOf[js.Any])
    
    inline def setStringMapValueUndefined: Self = StObject.set(x, "stringMapValue", js.undefined)
    
    inline def setStringSetValue(value: SchemaGoogleCloudResourcesettingsV1ValueStringSet): Self = StObject.set(x, "stringSetValue", value.asInstanceOf[js.Any])
    
    inline def setStringSetValueUndefined: Self = StObject.set(x, "stringSetValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
