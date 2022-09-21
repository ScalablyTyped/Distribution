package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1AnalysisResult extends StObject {
  
  /**
    * Call-specific metadata created by the analysis.
    */
  var callAnalysisMetadata: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata] = js.undefined
  
  /**
    * The time at which the analysis ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1AnalysisResult {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1AnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1AnalysisResult]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1AnalysisResult](x: Self) {
    
    inline def setCallAnalysisMetadata(value: SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata): Self = StObject.set(x, "callAnalysisMetadata", value.asInstanceOf[js.Any])
    
    inline def setCallAnalysisMetadataUndefined: Self = StObject.set(x, "callAnalysisMetadata", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
  }
}
