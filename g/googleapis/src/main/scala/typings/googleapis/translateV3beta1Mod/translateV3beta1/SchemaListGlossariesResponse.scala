package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGlossariesResponse extends StObject {
  
  /**
    * The list of glossaries for a project.
    */
  var glossaries: js.UndefOr[js.Array[SchemaGlossary]] = js.undefined
  
  /**
    * A token to retrieve a page of results. Pass this value in the [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGlossariesResponse {
  
  inline def apply(): SchemaListGlossariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGlossariesResponse]
  }
  
  extension [Self <: SchemaListGlossariesResponse](x: Self) {
    
    inline def setGlossaries(value: js.Array[SchemaGlossary]): Self = StObject.set(x, "glossaries", value.asInstanceOf[js.Any])
    
    inline def setGlossariesUndefined: Self = StObject.set(x, "glossaries", js.undefined)
    
    inline def setGlossariesVarargs(value: SchemaGlossary*): Self = StObject.set(x, "glossaries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
