package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult extends StObject {
  
  /**
    * The recent search query.
    */
  var recentSearch: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult](x: Self) {
    
    inline def setRecentSearch(value: String): Self = StObject.set(x, "recentSearch", value.asInstanceOf[js.Any])
    
    inline def setRecentSearchNull: Self = StObject.set(x, "recentSearch", null)
    
    inline def setRecentSearchUndefined: Self = StObject.set(x, "recentSearch", js.undefined)
  }
}
