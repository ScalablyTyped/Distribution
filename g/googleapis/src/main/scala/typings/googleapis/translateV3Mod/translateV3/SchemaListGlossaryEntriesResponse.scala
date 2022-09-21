package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGlossaryEntriesResponse extends StObject {
  
  /**
    * Optional. The Glossary Entries
    */
  var glossaryEntries: js.UndefOr[js.Array[SchemaGlossaryEntry]] = js.undefined
  
  /**
    * Optional. A token to retrieve a page of results. Pass this value in the [ListGLossaryEntriesRequest.page_token] field in the subsequent calls.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGlossaryEntriesResponse {
  
  inline def apply(): SchemaListGlossaryEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGlossaryEntriesResponse]
  }
  
  extension [Self <: SchemaListGlossaryEntriesResponse](x: Self) {
    
    inline def setGlossaryEntries(value: js.Array[SchemaGlossaryEntry]): Self = StObject.set(x, "glossaryEntries", value.asInstanceOf[js.Any])
    
    inline def setGlossaryEntriesUndefined: Self = StObject.set(x, "glossaryEntries", js.undefined)
    
    inline def setGlossaryEntriesVarargs(value: SchemaGlossaryEntry*): Self = StObject.set(x, "glossaryEntries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
