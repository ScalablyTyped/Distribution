package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List queries response.
  */
@js.native
trait SchemaListQueriesResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listQueriesResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Retrieved queries.
    */
  var queries: js.UndefOr[js.Array[SchemaQuery]] = js.native
}
object SchemaListQueriesResponse {
  
  @scala.inline
  def apply(): SchemaListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQueriesResponse]
  }
  
  @scala.inline
  implicit class SchemaListQueriesResponseMutableBuilder[Self <: SchemaListQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Array[SchemaQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: SchemaQuery*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
