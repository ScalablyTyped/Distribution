package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Bucket extends StObject {
  
  /**
    * Upper bound of the range, exclusive; type must match min.
    */
  var max: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if used.
    */
  var min: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
  
  /**
    * Required. Replacement value for this bucket.
    */
  var replacementValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
}
object SchemaGooglePrivacyDlpV2Bucket {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Bucket]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Bucket](x: Self) {
    
    inline def setMax(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setReplacementValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "replacementValue", value.asInstanceOf[js.Any])
    
    inline def setReplacementValueUndefined: Self = StObject.set(x, "replacementValue", js.undefined)
  }
}
