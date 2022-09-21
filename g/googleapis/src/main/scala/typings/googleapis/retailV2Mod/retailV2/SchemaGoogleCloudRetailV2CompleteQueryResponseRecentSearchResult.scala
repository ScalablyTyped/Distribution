package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2CompleteQueryResponseRecentSearchResult extends StObject {
  
  /**
    * The recent search query.
    */
  var recentSearch: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2CompleteQueryResponseRecentSearchResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2CompleteQueryResponseRecentSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2CompleteQueryResponseRecentSearchResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2CompleteQueryResponseRecentSearchResult](x: Self) {
    
    inline def setRecentSearch(value: String): Self = StObject.set(x, "recentSearch", value.asInstanceOf[js.Any])
    
    inline def setRecentSearchNull: Self = StObject.set(x, "recentSearch", null)
    
    inline def setRecentSearchUndefined: Self = StObject.set(x, "recentSearch", js.undefined)
  }
}
