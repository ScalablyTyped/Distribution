package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the k-anonymity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityResult extends js.Object {
  
  /**
    * Histogram of k-anonymity equivalence classes.
    */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.native
}
object SchemaGooglePrivacyDlpV2KAnonymityResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityResultOps[Self <: SchemaGooglePrivacyDlpV2KAnonymityResult] (val x: Self) extends AnyVal {
    
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
    def setEquivalenceClassHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket*): Self = this.set("equivalenceClassHistogramBuckets", js.Array(value :_*))
    
    @scala.inline
    def setEquivalenceClassHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = this.set("equivalenceClassHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquivalenceClassHistogramBuckets: Self = this.set("equivalenceClassHistogramBuckets", js.undefined)
  }
}
