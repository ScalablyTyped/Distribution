package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSitesResponse extends StObject {
  
  /**
    * The pagination token, if more results exist beyond the ones in this response. Include this token in your next call to `ListSites`. Page tokens are short-lived and should not be stored.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Site objects associated with the specified Firebase project.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
}
object SchemaListSitesResponse {
  
  inline def apply(): SchemaListSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSitesResponse]
  }
  
  extension [Self <: SchemaListSitesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
    
    inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
    
    inline def setSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "sites", js.Array(value*))
  }
}
