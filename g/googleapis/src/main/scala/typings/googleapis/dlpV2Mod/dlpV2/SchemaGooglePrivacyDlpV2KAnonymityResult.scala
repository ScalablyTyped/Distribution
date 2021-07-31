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
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KAnonymityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquivalenceClassHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = StObject.set(x, "equivalenceClassHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassHistogramBucketsUndefined: Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.undefined)
    
    @scala.inline
    def setEquivalenceClassHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket*): Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.Array(value :_*))
  }
}
