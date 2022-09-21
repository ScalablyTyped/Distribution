package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2FieldIntegerOptions extends StObject {
  
  /**
    * Output only. The maximum valid value for the integer field.
    */
  var maxValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The minimum valid value for the integer field.
    */
  var minValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2FieldIntegerOptions {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2FieldIntegerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2FieldIntegerOptions]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2FieldIntegerOptions](x: Self) {
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
