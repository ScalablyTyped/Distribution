package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute numerical stats over an individual column, including number of
  * distinct values and value count distribution.
  */
trait SchemaGooglePrivacyDlpV2CategoricalStatsConfig extends StObject {
  
  /**
    * Field to compute categorical stats on. All column types are supported
    * except for arrays and structs. However, it may be more informative to use
    * NumericalStats when the field type is supported, depending on the data.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
}
object SchemaGooglePrivacyDlpV2CategoricalStatsConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CategoricalStatsConfig](x: Self) {
    
    inline def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
