package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response including listed occurrences for a note.
  */
trait SchemaListNoteOccurrencesResponse extends StObject {
  
  /**
    * Token to receive the next page of notes.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The occurrences attached to the specified note.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.undefined
}
object SchemaListNoteOccurrencesResponse {
  
  inline def apply(): SchemaListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNoteOccurrencesResponse]
  }
  
  extension [Self <: SchemaListNoteOccurrencesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOccurrences(value: js.Array[SchemaOccurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    inline def setOccurrencesVarargs(value: SchemaOccurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
