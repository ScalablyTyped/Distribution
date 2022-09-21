package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaListAvailableLocalesResponse extends StObject {
  
  /**
    * Locales for which ideas are available for the given Creator.
    */
  var availableLocales: js.UndefOr[js.Array[SchemaGoogleSearchIdeahubV1betaAvailableLocale]] = js.undefined
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaListAvailableLocalesResponse {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaListAvailableLocalesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaListAvailableLocalesResponse]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaListAvailableLocalesResponse](x: Self) {
    
    inline def setAvailableLocales(value: js.Array[SchemaGoogleSearchIdeahubV1betaAvailableLocale]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setAvailableLocalesUndefined: Self = StObject.set(x, "availableLocales", js.undefined)
    
    inline def setAvailableLocalesVarargs(value: SchemaGoogleSearchIdeahubV1betaAvailableLocale*): Self = StObject.set(x, "availableLocales", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
