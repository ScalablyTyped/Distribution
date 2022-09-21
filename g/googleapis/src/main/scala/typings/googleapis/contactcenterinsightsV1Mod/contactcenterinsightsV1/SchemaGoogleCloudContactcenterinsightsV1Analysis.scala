package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1Analysis extends StObject {
  
  /**
    * Output only. The result of the analysis, which is populated when the analysis finishes.
    */
  var analysisResult: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1AnalysisResult] = js.undefined
  
  /**
    * Output only. The time at which the analysis was created, which occurs when the long-running operation completes.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the analysis. Format: projects/{project\}/locations/{location\}/conversations/{conversation\}/analyses/{analysis\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the analysis was requested.
    */
  var requestTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1Analysis {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1Analysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1Analysis]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1Analysis](x: Self) {
    
    inline def setAnalysisResult(value: SchemaGoogleCloudContactcenterinsightsV1AnalysisResult): Self = StObject.set(x, "analysisResult", value.asInstanceOf[js.Any])
    
    inline def setAnalysisResultUndefined: Self = StObject.set(x, "analysisResult", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeNull: Self = StObject.set(x, "requestTime", null)
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
