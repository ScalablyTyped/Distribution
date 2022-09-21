package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewItemIssueItemIssueSeverity extends StObject {
  
  /** Severity of an issue aggregated for destination. */
  var aggregatedSeverity: js.UndefOr[String] = js.undefined
  
  /** Item issue severity for every destination. */
  var severityPerDestination: js.UndefOr[js.Array[ProductViewItemIssueIssueSeverityPerDestination]] = js.undefined
}
object ProductViewItemIssueItemIssueSeverity {
  
  inline def apply(): ProductViewItemIssueItemIssueSeverity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewItemIssueItemIssueSeverity]
  }
  
  extension [Self <: ProductViewItemIssueItemIssueSeverity](x: Self) {
    
    inline def setAggregatedSeverity(value: String): Self = StObject.set(x, "aggregatedSeverity", value.asInstanceOf[js.Any])
    
    inline def setAggregatedSeverityUndefined: Self = StObject.set(x, "aggregatedSeverity", js.undefined)
    
    inline def setSeverityPerDestination(value: js.Array[ProductViewItemIssueIssueSeverityPerDestination]): Self = StObject.set(x, "severityPerDestination", value.asInstanceOf[js.Any])
    
    inline def setSeverityPerDestinationUndefined: Self = StObject.set(x, "severityPerDestination", js.undefined)
    
    inline def setSeverityPerDestinationVarargs(value: ProductViewItemIssueIssueSeverityPerDestination*): Self = StObject.set(x, "severityPerDestination", js.Array(value*))
  }
}
