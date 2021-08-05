package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response including listed notes.
  */
trait SchemaListNotesResponse extends StObject {
  
  /**
    * The next pagination token in the list response. It should be used as
    * page_token for the following request. An empty value means no more
    * result.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The occurrences requested
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.undefined
}
object SchemaListNotesResponse {
  
  inline def apply(): SchemaListNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotesResponse]
  }
  
  extension [Self <: SchemaListNotesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNotes(value: js.Array[SchemaNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: SchemaNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
