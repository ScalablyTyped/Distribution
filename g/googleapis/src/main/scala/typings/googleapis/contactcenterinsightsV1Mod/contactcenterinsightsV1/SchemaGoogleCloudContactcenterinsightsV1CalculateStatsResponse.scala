package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse extends StObject {
  
  /**
    * The average duration of all conversations. The average is calculated using only conversations that have a time duration.
    */
  var averageDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The average number of turns per conversation.
    */
  var averageTurnCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of conversations.
    */
  var conversationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A time series representing the count of conversations created over time that match that requested filter criteria.
    */
  var conversationCountTimeSeries: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries] = js.undefined
  
  /**
    * A map associating each custom highlighter resource name with its respective number of matches in the set of conversations.
    */
  var customHighlighterMatches: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * A map associating each issue resource name with its respective number of matches in the set of conversations. Key has the format: `projects//locations//issueModels//issues/` Deprecated, use `issue_matches_stats` field instead.
    */
  var issueMatches: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * A map associating each issue resource name with its respective number of matches in the set of conversations. Key has the format: `projects//locations//issueModels//issues/`
    */
  var issueMatchesStats: js.UndefOr[
    StringDictionary[SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats] | Null
  ] = js.undefined
  
  /**
    * A map associating each smart highlighter display name with its respective number of matches in the set of conversations.
    */
  var smartHighlighterMatches: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponse](x: Self) {
    
    inline def setAverageDuration(value: String): Self = StObject.set(x, "averageDuration", value.asInstanceOf[js.Any])
    
    inline def setAverageDurationNull: Self = StObject.set(x, "averageDuration", null)
    
    inline def setAverageDurationUndefined: Self = StObject.set(x, "averageDuration", js.undefined)
    
    inline def setAverageTurnCount(value: Double): Self = StObject.set(x, "averageTurnCount", value.asInstanceOf[js.Any])
    
    inline def setAverageTurnCountNull: Self = StObject.set(x, "averageTurnCount", null)
    
    inline def setAverageTurnCountUndefined: Self = StObject.set(x, "averageTurnCount", js.undefined)
    
    inline def setConversationCount(value: Double): Self = StObject.set(x, "conversationCount", value.asInstanceOf[js.Any])
    
    inline def setConversationCountNull: Self = StObject.set(x, "conversationCount", null)
    
    inline def setConversationCountTimeSeries(value: SchemaGoogleCloudContactcenterinsightsV1CalculateStatsResponseTimeSeries): Self = StObject.set(x, "conversationCountTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setConversationCountTimeSeriesUndefined: Self = StObject.set(x, "conversationCountTimeSeries", js.undefined)
    
    inline def setConversationCountUndefined: Self = StObject.set(x, "conversationCount", js.undefined)
    
    inline def setCustomHighlighterMatches(value: StringDictionary[Double]): Self = StObject.set(x, "customHighlighterMatches", value.asInstanceOf[js.Any])
    
    inline def setCustomHighlighterMatchesNull: Self = StObject.set(x, "customHighlighterMatches", null)
    
    inline def setCustomHighlighterMatchesUndefined: Self = StObject.set(x, "customHighlighterMatches", js.undefined)
    
    inline def setIssueMatches(value: StringDictionary[Double]): Self = StObject.set(x, "issueMatches", value.asInstanceOf[js.Any])
    
    inline def setIssueMatchesNull: Self = StObject.set(x, "issueMatches", null)
    
    inline def setIssueMatchesStats(value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1IssueModelLabelStatsIssueStats]): Self = StObject.set(x, "issueMatchesStats", value.asInstanceOf[js.Any])
    
    inline def setIssueMatchesStatsNull: Self = StObject.set(x, "issueMatchesStats", null)
    
    inline def setIssueMatchesStatsUndefined: Self = StObject.set(x, "issueMatchesStats", js.undefined)
    
    inline def setIssueMatchesUndefined: Self = StObject.set(x, "issueMatches", js.undefined)
    
    inline def setSmartHighlighterMatches(value: StringDictionary[Double]): Self = StObject.set(x, "smartHighlighterMatches", value.asInstanceOf[js.Any])
    
    inline def setSmartHighlighterMatchesNull: Self = StObject.set(x, "smartHighlighterMatches", null)
    
    inline def setSmartHighlighterMatchesUndefined: Self = StObject.set(x, "smartHighlighterMatches", js.undefined)
  }
}
