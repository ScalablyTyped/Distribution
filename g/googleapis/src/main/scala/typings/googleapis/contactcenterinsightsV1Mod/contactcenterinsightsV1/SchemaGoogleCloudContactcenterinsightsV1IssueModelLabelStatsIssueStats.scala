package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats extends StObject {
  
  /**
    * Display name of the issue.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Issue resource. Format: projects/{project\}/locations/{location\}/issueModels/{issue_model\}/issues/{issue\}
    */
  var issue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of conversations attached to the issue at this point in time.
    */
  var labeledConversationsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIssue(value: String): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueNull: Self = StObject.set(x, "issue", null)
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setLabeledConversationsCount(value: String): Self = StObject.set(x, "labeledConversationsCount", value.asInstanceOf[js.Any])
    
    inline def setLabeledConversationsCountNull: Self = StObject.set(x, "labeledConversationsCount", null)
    
    inline def setLabeledConversationsCountUndefined: Self = StObject.set(x, "labeledConversationsCount", js.undefined)
  }
}
