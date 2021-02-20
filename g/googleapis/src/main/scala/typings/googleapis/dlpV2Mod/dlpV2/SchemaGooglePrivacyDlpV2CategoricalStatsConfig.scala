package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute numerical stats over an individual column, including number of
  * distinct values and value count distribution.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsConfig extends StObject {
  
  /**
    * Field to compute categorical stats on. All column types are supported
    * except for arrays and structs. However, it may be more informative to use
    * NumericalStats when the field type is supported, depending on the data.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}
object SchemaGooglePrivacyDlpV2CategoricalStatsConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CategoricalStatsConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CategoricalStatsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
