package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All result fields mentioned below are updated while the job is processing.
  */
trait SchemaGooglePrivacyDlpV2Result extends StObject {
  
  /**
    * Statistics of how many instances of each info type were found during
    * inspect job.
    */
  var infoTypeStats: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]] = js.undefined
  
  /**
    * Total size in bytes that were processed.
    */
  var processedBytes: js.UndefOr[String] = js.undefined
  
  /**
    * Estimate of the number of bytes to process.
    */
  var totalEstimatedBytes: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2Result {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Result]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypeStats(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]): Self = StObject.set(x, "infoTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeStatsUndefined: Self = StObject.set(x, "infoTypeStats", js.undefined)
    
    @scala.inline
    def setInfoTypeStatsVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeStats*): Self = StObject.set(x, "infoTypeStats", js.Array(value :_*))
    
    @scala.inline
    def setProcessedBytes(value: String): Self = StObject.set(x, "processedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedBytesUndefined: Self = StObject.set(x, "processedBytes", js.undefined)
    
    @scala.inline
    def setTotalEstimatedBytes(value: String): Self = StObject.set(x, "totalEstimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalEstimatedBytesUndefined: Self = StObject.set(x, "totalEstimatedBytes", js.undefined)
  }
}
