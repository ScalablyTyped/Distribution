package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of how many vulnz occurrences there are per severity type. counts
  * by groups, or if we should have different summary messages like this.
  */
@js.native
trait SchemaGetVulnzOccurrencesSummaryResponse extends StObject {
  
  /**
    * A map of how many occurrences were found for each severity.
    */
  var counts: js.UndefOr[js.Array[SchemaSeverityCount]] = js.native
}
object SchemaGetVulnzOccurrencesSummaryResponse {
  
  @scala.inline
  def apply(): SchemaGetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetVulnzOccurrencesSummaryResponse]
  }
  
  @scala.inline
  implicit class SchemaGetVulnzOccurrencesSummaryResponseMutableBuilder[Self <: SchemaGetVulnzOccurrencesSummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounts(value: js.Array[SchemaSeverityCount]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: SchemaSeverityCount*): Self = StObject.set(x, "counts", js.Array(value :_*))
  }
}
