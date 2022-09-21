package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult extends StObject {
  
  /**
    * The recent search query.
    */
  var recentSearch: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult](x: Self) {
    
    inline def setRecentSearch(value: String): Self = StObject.set(x, "recentSearch", value.asInstanceOf[js.Any])
    
    inline def setRecentSearchNull: Self = StObject.set(x, "recentSearch", null)
    
    inline def setRecentSearchUndefined: Self = StObject.set(x, "recentSearch", js.undefined)
  }
}
