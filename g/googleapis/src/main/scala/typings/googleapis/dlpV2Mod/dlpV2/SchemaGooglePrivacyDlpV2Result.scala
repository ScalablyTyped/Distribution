package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All result fields mentioned below are updated while the job is processing.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Result extends js.Object {
  
  /**
    * Statistics of how many instances of each info type were found during
    * inspect job.
    */
  var infoTypeStats: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]] = js.native
  
  /**
    * Total size in bytes that were processed.
    */
  var processedBytes: js.UndefOr[String] = js.native
  
  /**
    * Estimate of the number of bytes to process.
    */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2Result {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Result]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ResultOps[Self <: SchemaGooglePrivacyDlpV2Result] (val x: Self) extends AnyVal {
    
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
    def setInfoTypeStatsVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeStats*): Self = this.set("infoTypeStats", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypeStats(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]): Self = this.set("infoTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypeStats: Self = this.set("infoTypeStats", js.undefined)
    
    @scala.inline
    def setProcessedBytes(value: String): Self = this.set("processedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessedBytes: Self = this.set("processedBytes", js.undefined)
    
    @scala.inline
    def setTotalEstimatedBytes(value: String): Self = this.set("totalEstimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalEstimatedBytes: Self = this.set("totalEstimatedBytes", js.undefined)
  }
}
