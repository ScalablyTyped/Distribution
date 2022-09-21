package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse extends StObject {
  
  /**
    * The latest label statistics for the queried issue model. Includes results on both training data and data labeled after deployment.
    */
  var currentStats: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStats] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CalculateIssueModelStatsResponse](x: Self) {
    
    inline def setCurrentStats(value: SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStats): Self = StObject.set(x, "currentStats", value.asInstanceOf[js.Any])
    
    inline def setCurrentStatsUndefined: Self = StObject.set(x, "currentStats", js.undefined)
  }
}
