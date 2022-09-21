package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phrase matchers that match the request.
    */
  var phraseMatchers: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ListPhraseMatchersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhraseMatchers(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]): Self = StObject.set(x, "phraseMatchers", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatchersUndefined: Self = StObject.set(x, "phraseMatchers", js.undefined)
    
    inline def setPhraseMatchersVarargs(value: SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher*): Self = StObject.set(x, "phraseMatchers", js.Array(value*))
  }
}
