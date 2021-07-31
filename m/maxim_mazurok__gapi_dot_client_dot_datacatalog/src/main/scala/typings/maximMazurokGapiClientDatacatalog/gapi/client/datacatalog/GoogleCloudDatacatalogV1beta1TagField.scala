package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1TagField extends StObject {
  
  /** Holds the value for a tag field with boolean type. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The display name of this field. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Holds the value for a tag field with double type. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /** Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum. */
  var enumValue: js.UndefOr[GoogleCloudDatacatalogV1beta1TagFieldEnumValue] = js.undefined
  
  /**
    * Output only. The order of this field with respect to other fields in this tag. It can be set in Tag. For example, a higher value can indicate a more important field. The value can
    * be negative. Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /** Holds the value for a tag field with string type. */
  var stringValue: js.UndefOr[String] = js.undefined
  
  /** Holds the value for a tag field with timestamp type. */
  var timestampValue: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1TagField {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagField]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagFieldMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1TagField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setEnumValue(value: GoogleCloudDatacatalogV1beta1TagFieldEnumValue): Self = StObject.set(x, "enumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumValueUndefined: Self = StObject.set(x, "enumValue", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
