package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDefinition extends StObject {
  
  /** [Required] A query that BigQuery executes when the view is referenced. */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  /** Describes user-defined function resources used in the query. */
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
}
object ViewDefinition {
  
  inline def apply(): ViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewDefinition]
  }
  
  extension [Self <: ViewDefinition](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    inline def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    inline def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value :_*))
  }
}
