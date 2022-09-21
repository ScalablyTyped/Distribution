package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserLandingPagesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserLandingPagesListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Landing page collection
    */
  var landingPages: js.UndefOr[js.Array[SchemaLandingPage]] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvertiserLandingPagesListResponse {
  
  inline def apply(): SchemaAdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserLandingPagesListResponse]
  }
  
  extension [Self <: SchemaAdvertiserLandingPagesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLandingPages(value: js.Array[SchemaLandingPage]): Self = StObject.set(x, "landingPages", value.asInstanceOf[js.Any])
    
    inline def setLandingPagesUndefined: Self = StObject.set(x, "landingPages", js.undefined)
    
    inline def setLandingPagesVarargs(value: SchemaLandingPage*): Self = StObject.set(x, "landingPages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
