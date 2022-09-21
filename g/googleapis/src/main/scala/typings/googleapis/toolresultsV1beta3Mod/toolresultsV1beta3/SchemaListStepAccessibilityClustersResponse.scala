package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListStepAccessibilityClustersResponse extends StObject {
  
  /**
    * A sequence of accessibility suggestions, grouped into clusters. Within the sequence, clusters that belong to the same SuggestionCategory should be adjacent. Within each category, clusters should be ordered by their SuggestionPriority (ERRORs first). The categories should be ordered by their highest priority cluster.
    */
  var clusters: js.UndefOr[js.Array[SchemaSuggestionClusterProto]] = js.undefined
  
  /**
    * A full resource name of the step. For example, projects/my-project/histories/bh.1234567890abcdef/executions/ 1234567890123456789/steps/bs.1234567890abcdef Always presents.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaListStepAccessibilityClustersResponse {
  
  inline def apply(): SchemaListStepAccessibilityClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStepAccessibilityClustersResponse]
  }
  
  extension [Self <: SchemaListStepAccessibilityClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[SchemaSuggestionClusterProto]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: SchemaSuggestionClusterProto*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
