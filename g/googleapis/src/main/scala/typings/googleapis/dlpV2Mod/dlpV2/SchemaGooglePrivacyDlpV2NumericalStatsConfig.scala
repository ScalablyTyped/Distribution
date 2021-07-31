package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compute numerical stats over an individual column, including min, max, and
  * quantiles.
  */
trait SchemaGooglePrivacyDlpV2NumericalStatsConfig extends StObject {
  
  /**
    * Field to compute numerical stats on. Supported types are integer, float,
    * date, datetime, timestamp, time.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
}
object SchemaGooglePrivacyDlpV2NumericalStatsConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2NumericalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2NumericalStatsConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2NumericalStatsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
