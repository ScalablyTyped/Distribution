package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the k-anonymity computation.
  */
trait SchemaGooglePrivacyDlpV2KAnonymityResult extends StObject {
  
  /**
    * Histogram of k-anonymity equivalence classes.
    */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2KAnonymityResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KAnonymityResult](x: Self) {
    
    inline def setEquivalenceClassHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = StObject.set(x, "equivalenceClassHistogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassHistogramBucketsUndefined: Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.undefined)
    
    inline def setEquivalenceClassHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket*): Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.Array(value :_*))
  }
}
