package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the numerical stats computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2NumericalStatsResult extends js.Object {
  
  /**
    * Maximum value appearing in the column.
    */
  var maxValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  
  /**
    * Minimum value appearing in the column.
    */
  var minValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}
object SchemaGooglePrivacyDlpV2NumericalStatsResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2NumericalStatsResultOps[Self <: SchemaGooglePrivacyDlpV2NumericalStatsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxValue(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: SchemaGooglePrivacyDlpV2Value): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setQuantileValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = this.set("quantileValues", js.Array(value :_*))
    
    @scala.inline
    def setQuantileValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = this.set("quantileValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantileValues: Self = this.set("quantileValues", js.undefined)
  }
}
