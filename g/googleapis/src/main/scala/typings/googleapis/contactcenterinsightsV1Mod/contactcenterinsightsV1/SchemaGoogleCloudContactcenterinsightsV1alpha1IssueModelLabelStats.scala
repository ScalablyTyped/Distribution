package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats extends StObject {
  
  /**
    * Number of conversations the issue model has analyzed at this point in time.
    */
  var analyzedConversationsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Statistics on each issue. Key is the issue's resource name.
    */
  var issueStats: js.UndefOr[
    StringDictionary[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStatsIssueStats] | Null
  ] = js.undefined
  
  /**
    * Number of analyzed conversations for which no issue was applicable at this point in time.
    */
  var unclassifiedConversationsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats](x: Self) {
    
    inline def setAnalyzedConversationsCount(value: String): Self = StObject.set(x, "analyzedConversationsCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedConversationsCountNull: Self = StObject.set(x, "analyzedConversationsCount", null)
    
    inline def setAnalyzedConversationsCountUndefined: Self = StObject.set(x, "analyzedConversationsCount", js.undefined)
    
    inline def setIssueStats(
      value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStatsIssueStats]
    ): Self = StObject.set(x, "issueStats", value.asInstanceOf[js.Any])
    
    inline def setIssueStatsNull: Self = StObject.set(x, "issueStats", null)
    
    inline def setIssueStatsUndefined: Self = StObject.set(x, "issueStats", js.undefined)
    
    inline def setUnclassifiedConversationsCount(value: String): Self = StObject.set(x, "unclassifiedConversationsCount", value.asInstanceOf[js.Any])
    
    inline def setUnclassifiedConversationsCountNull: Self = StObject.set(x, "unclassifiedConversationsCount", null)
    
    inline def setUnclassifiedConversationsCountUndefined: Self = StObject.set(x, "unclassifiedConversationsCount", js.undefined)
  }
}
