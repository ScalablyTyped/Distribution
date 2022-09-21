package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomFieldFilter extends StObject {
  
  /**
    * Required. The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomFieldFilter {
  
  inline def apply(): SchemaCustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFieldFilter]
  }
  
  extension [Self <: SchemaCustomFieldFilter](x: Self) {
    
    inline def setQueries(value: js.Array[String]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesNull: Self = StObject.set(x, "queries", null)
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: String*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
