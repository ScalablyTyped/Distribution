package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1IssueAssignment extends StObject {
  
  /**
    * Immutable. Display name of the assigned issue. This field is set at time of analyis and immutable since then.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the assigned issue.
    */
  var issue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Score indicating the likelihood of the issue assignment. currently bounded on [0,1].
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1IssueAssignment {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1IssueAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1IssueAssignment]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1IssueAssignment](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueNull: Self = StObject.set(x, "issue", null)
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
