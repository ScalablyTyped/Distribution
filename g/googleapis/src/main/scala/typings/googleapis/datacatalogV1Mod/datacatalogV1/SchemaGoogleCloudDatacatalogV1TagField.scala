package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1TagField extends StObject {
  
  /**
    * The value of a tag field with a boolean type.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The display name of this field.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of a tag field with a double type.
    */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The value of a tag field with an enum type. This value must be one of the allowed values listed in this enum.
    */
  var enumValue: js.UndefOr[SchemaGoogleCloudDatacatalogV1TagFieldEnumValue] = js.undefined
  
  /**
    * Output only. The order of this field with respect to other fields in this tag. Can be set by Tag. For example, a higher value can indicate a more important field. The value can be negative. Multiple fields can have the same order, and field orders within a tag don't have to be sequential.
    */
  var order: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The value of a tag field with a rich text type. The maximum length is 10 MiB as this value holds HTML descriptions including encoded images. The maximum length of the text without images is 100 KiB.
    */
  var richtextValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of a tag field with a string type. The maximum length is 2000 UTF-8 characters.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of a tag field with a timestamp type.
    */
  var timestampValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1TagField {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1TagField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1TagField]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1TagField](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setEnumValue(value: SchemaGoogleCloudDatacatalogV1TagFieldEnumValue): Self = StObject.set(x, "enumValue", value.asInstanceOf[js.Any])
    
    inline def setEnumValueUndefined: Self = StObject.set(x, "enumValue", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRichtextValue(value: String): Self = StObject.set(x, "richtextValue", value.asInstanceOf[js.Any])
    
    inline def setRichtextValueNull: Self = StObject.set(x, "richtextValue", null)
    
    inline def setRichtextValueUndefined: Self = StObject.set(x, "richtextValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    inline def setTimestampValueNull: Self = StObject.set(x, "timestampValue", null)
    
    inline def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
