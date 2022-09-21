package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSitesResponse extends StObject {
  
  /**
    * Continuation token used to page through sites. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sites returned in this list response.
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
