package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Project List Response
  */
trait SchemaProjectsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#projectsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Project collection.
    */
  var projects: js.UndefOr[js.Array[SchemaProject]] = js.undefined
}
object SchemaProjectsListResponse {
  
  inline def apply(): SchemaProjectsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsListResponse]
  }
  
  extension [Self <: SchemaProjectsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProjects(value: js.Array[SchemaProject]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: SchemaProject*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
