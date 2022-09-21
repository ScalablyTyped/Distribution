package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentEntityNormalizedValue extends StObject {
  
  /**
    * Postal address. See also: https://github.com/googleapis/googleapis/blob/master/google/type/postal_address.proto
    */
  var addressValue: js.UndefOr[SchemaGoogleTypePostalAddress] = js.undefined
  
  /**
    * Boolean value. Can be used for entities with binary values, or for checkboxes.
    */
  var booleanValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Date value. Includes year, month, day. See also: https://github.com/googleapis/googleapis/blob/master/google/type/date.proto
    */
  var dateValue: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
  
  /**
    * DateTime value. Includes date, time, and timezone. See also: https://github.com/googleapis/googleapis/blob/master/google/type/datetime.proto
    */
  var datetimeValue: js.UndefOr[SchemaGoogleTypeDateTime] = js.undefined
  
  /**
    * Float value.
    */
  var floatValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Integer value.
    */
  var integerValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Money value. See also: https://github.com/googleapis/googleapis/blob/master/google/type/money.proto
    */
  var moneyValue: js.UndefOr[SchemaGoogleTypeMoney] = js.undefined
  
  /**
    * Optional. An optional field to store a normalized string. For some entity types, one of respective `structured_value` fields may also be populated. Also not all the types of `structured_value` will be normalized. For example, some processors may not generate float or int normalized text by default. Below are sample formats mapped to structured values. - Money/Currency type (`money_value`) is in the ISO 4217 text format. - Date type (`date_value`) is in the ISO 8601 text format. - Datetime type (`datetime_value`) is in the ISO 8601 text format.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentEntityNormalizedValue {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentEntityNormalizedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentEntityNormalizedValue]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentEntityNormalizedValue](x: Self) {
    
    inline def setAddressValue(value: SchemaGoogleTypePostalAddress): Self = StObject.set(x, "addressValue", value.asInstanceOf[js.Any])
    
    inline def setAddressValueUndefined: Self = StObject.set(x, "addressValue", js.undefined)
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueNull: Self = StObject.set(x, "booleanValue", null)
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDateValue(value: SchemaGoogleTypeDate): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setDatetimeValue(value: SchemaGoogleTypeDateTime): Self = StObject.set(x, "datetimeValue", value.asInstanceOf[js.Any])
    
    inline def setDatetimeValueUndefined: Self = StObject.set(x, "datetimeValue", js.undefined)
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setFloatValueNull: Self = StObject.set(x, "floatValue", null)
    
    inline def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    inline def setIntegerValue(value: Double): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMoneyValue(value: SchemaGoogleTypeMoney): Self = StObject.set(x, "moneyValue", value.asInstanceOf[js.Any])
    
    inline def setMoneyValueUndefined: Self = StObject.set(x, "moneyValue", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
