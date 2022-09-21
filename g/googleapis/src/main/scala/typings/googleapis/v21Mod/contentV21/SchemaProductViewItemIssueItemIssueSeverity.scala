package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductViewItemIssueItemIssueSeverity extends StObject {
  
  /**
    * Severity of an issue aggregated for destination.
    */
  var aggregatedSeverity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item issue severity for every destination.
    */
  var severityPerDestination: js.UndefOr[js.Array[SchemaProductViewItemIssueIssueSeverityPerDestination]] = js.undefined
}
object SchemaProductViewItemIssueItemIssueSeverity {
  
  inline def apply(): SchemaProductViewItemIssueItemIssueSeverity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductViewItemIssueItemIssueSeverity]
  }
  
  extension [Self <: SchemaProductViewItemIssueItemIssueSeverity](x: Self) {
    
    inline def setAggregatedSeverity(value: String): Self = StObject.set(x, "aggregatedSeverity", value.asInstanceOf[js.Any])
    
    inline def setAggregatedSeverityNull: Self = StObject.set(x, "aggregatedSeverity", null)
    
    inline def setAggregatedSeverityUndefined: Self = StObject.set(x, "aggregatedSeverity", js.undefined)
    
    inline def setSeverityPerDestination(value: js.Array[SchemaProductViewItemIssueIssueSeverityPerDestination]): Self = StObject.set(x, "severityPerDestination", value.asInstanceOf[js.Any])
    
    inline def setSeverityPerDestinationUndefined: Self = StObject.set(x, "severityPerDestination", js.undefined)
    
    inline def setSeverityPerDestinationVarargs(value: SchemaProductViewItemIssueIssueSeverityPerDestination*): Self = StObject.set(x, "severityPerDestination", js.Array(value*))
  }
}
