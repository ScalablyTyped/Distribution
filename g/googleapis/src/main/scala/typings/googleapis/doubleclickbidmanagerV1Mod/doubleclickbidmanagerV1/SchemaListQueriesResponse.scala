package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List queries response.
  */
trait SchemaListQueriesResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listQueriesResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Retrieved queries.
    */
  var queries: js.UndefOr[js.Array[SchemaQuery]] = js.undefined
}
object SchemaListQueriesResponse {
  
  inline def apply(): SchemaListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQueriesResponse]
  }
  
  extension [Self <: SchemaListQueriesResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setQueries(value: js.Array[SchemaQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: SchemaQuery*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
