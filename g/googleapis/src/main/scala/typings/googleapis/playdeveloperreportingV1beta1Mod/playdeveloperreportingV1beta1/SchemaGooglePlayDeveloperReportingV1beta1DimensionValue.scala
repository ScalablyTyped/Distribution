package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePlayDeveloperReportingV1beta1DimensionValue extends StObject {
  
  /**
    * Name of the dimension.
    */
  var dimension: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actual value, represented as an int64.
    */
  var int64Value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actual value, represented as a string.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Human-friendly label for the value, always in English. For example, 'Spain' for the 'ES' country code. Whereas the dimension value is stable, this value label is subject to change. Do not assume that the (value, value_label) relationship is stable. For example, the ISO country code 'MK' changed its name recently to 'North Macedonia'.
    */
  var valueLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePlayDeveloperReportingV1beta1DimensionValue {
  
  inline def apply(): SchemaGooglePlayDeveloperReportingV1beta1DimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayDeveloperReportingV1beta1DimensionValue]
  }
  
  extension [Self <: SchemaGooglePlayDeveloperReportingV1beta1DimensionValue](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionNull: Self = StObject.set(x, "dimension", null)
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    inline def setInt64ValueNull: Self = StObject.set(x, "int64Value", null)
    
    inline def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setValueLabel(value: String): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
    
    inline def setValueLabelNull: Self = StObject.set(x, "valueLabel", null)
    
    inline def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
  }
}
