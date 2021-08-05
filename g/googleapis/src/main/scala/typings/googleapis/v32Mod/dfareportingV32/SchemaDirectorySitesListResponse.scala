package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site List Response
  */
trait SchemaDirectorySitesListResponse extends StObject {
  
  /**
    * Directory site collection.
    */
  var directorySites: js.UndefOr[js.Array[SchemaDirectorySite]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaDirectorySitesListResponse {
  
  inline def apply(): SchemaDirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySitesListResponse]
  }
  
  extension [Self <: SchemaDirectorySitesListResponse](x: Self) {
    
    inline def setDirectorySites(value: js.Array[SchemaDirectorySite]): Self = StObject.set(x, "directorySites", value.asInstanceOf[js.Any])
    
    inline def setDirectorySitesUndefined: Self = StObject.set(x, "directorySites", js.undefined)
    
    inline def setDirectorySitesVarargs(value: SchemaDirectorySite*): Self = StObject.set(x, "directorySites", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
