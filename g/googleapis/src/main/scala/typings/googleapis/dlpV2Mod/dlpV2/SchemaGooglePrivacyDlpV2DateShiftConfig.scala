package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shifts dates by random number of days, with option to be consistent for the
  * same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting
  * to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DateShiftConfig extends js.Object {
  
  /**
    * Points to the field that contains the context, for example, an entity id.
    * If set, must also set method. If set, shift will be consistent for the
    * given context.
    */
  var context: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  
  /**
    * Causes the shift to be computed based on this key and the context. This
    * results in the same shift for the same context and crypto_key.
    */
  var cryptoKey: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoKey] = js.native
  
  /**
    * For example, -5 means shift date to at most 5 days back in the past.
    * [Required]
    */
  var lowerBoundDays: js.UndefOr[Double] = js.native
  
  /**
    * Range of shift in days. Actual shift will be selected at random within
    * this range (inclusive ends). Negative means shift to earlier in time.
    * Must not be more than 365250 days (1000 years) each direction.  For
    * example, 3 means shift date to at most 3 days into the future. [Required]
    */
  var upperBoundDays: js.UndefOr[Double] = js.native
}
object SchemaGooglePrivacyDlpV2DateShiftConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DateShiftConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DateShiftConfigOps[Self <: SchemaGooglePrivacyDlpV2DateShiftConfig] (val x: Self) extends AnyVal {
    
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
    def setContext(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCryptoKey(value: SchemaGooglePrivacyDlpV2CryptoKey): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
    
    @scala.inline
    def setLowerBoundDays(value: Double): Self = this.set("lowerBoundDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerBoundDays: Self = this.set("lowerBoundDays", js.undefined)
    
    @scala.inline
    def setUpperBoundDays(value: Double): Self = this.set("upperBoundDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperBoundDays: Self = this.set("upperBoundDays", js.undefined)
  }
}
