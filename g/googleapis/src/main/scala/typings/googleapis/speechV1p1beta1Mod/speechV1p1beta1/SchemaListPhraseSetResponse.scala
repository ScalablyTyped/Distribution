package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPhraseSetResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phrase set.
    */
  var phraseSets: js.UndefOr[js.Array[SchemaPhraseSet]] = js.undefined
}
object SchemaListPhraseSetResponse {
  
  inline def apply(): SchemaListPhraseSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPhraseSetResponse]
  }
  
  extension [Self <: SchemaListPhraseSetResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhraseSets(value: js.Array[SchemaPhraseSet]): Self = StObject.set(x, "phraseSets", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetsUndefined: Self = StObject.set(x, "phraseSets", js.undefined)
    
    inline def setPhraseSetsVarargs(value: SchemaPhraseSet*): Self = StObject.set(x, "phraseSets", js.Array(value*))
  }
}
