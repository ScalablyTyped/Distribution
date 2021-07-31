package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bucket is represented as a range, along with replacement values.
  */
trait SchemaGooglePrivacyDlpV2Bucket extends StObject {
  
  /**
    * Upper bound of the range, exclusive; type must match min.
    */
  var max: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * Replacement value for this bucket. If not provided the default behavior
    * will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
}
object SchemaGooglePrivacyDlpV2Bucket {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Bucket]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2BucketMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setReplacementValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "replacementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementValueUndefined: Self = StObject.set(x, "replacementValue", js.undefined)
  }
}
