package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of how many vulnz occurrences there are per severity type. counts
  * by groups, or if we should have different summary messages like this.
  */
trait SchemaGetVulnzOccurrencesSummaryResponse extends StObject {
  
  /**
    * A map of how many occurrences were found for each severity.
    */
  var counts: js.UndefOr[js.Array[SchemaSeverityCount]] = js.undefined
}
object SchemaGetVulnzOccurrencesSummaryResponse {
  
  inline def apply(): SchemaGetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetVulnzOccurrencesSummaryResponse]
  }
  
  extension [Self <: SchemaGetVulnzOccurrencesSummaryResponse](x: Self) {
    
    inline def setCounts(value: js.Array[SchemaSeverityCount]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCountsVarargs(value: SchemaSeverityCount*): Self = StObject.set(x, "counts", js.Array(value :_*))
  }
}
