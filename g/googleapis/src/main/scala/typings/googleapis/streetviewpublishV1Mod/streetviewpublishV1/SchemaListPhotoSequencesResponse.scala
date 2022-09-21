package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPhotoSequencesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of photo sequences via Operation interface. The maximum number of items returned is based on the pageSize field in the request. Each item in the list can have three possible states, * `Operation.done` = false, if the processing of PhotoSequence is not finished yet. * `Operation.done` = true and `Operation.error` is populated, if there was an error in processing. * `Operation.done` = true and `Operation.response` contains a PhotoSequence message, In each sequence, only Id is populated.
    */
  var photoSequences: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
}
object SchemaListPhotoSequencesResponse {
  
  inline def apply(): SchemaListPhotoSequencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPhotoSequencesResponse]
  }
  
  extension [Self <: SchemaListPhotoSequencesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhotoSequences(value: js.Array[SchemaOperation]): Self = StObject.set(x, "photoSequences", value.asInstanceOf[js.Any])
    
    inline def setPhotoSequencesUndefined: Self = StObject.set(x, "photoSequences", js.undefined)
    
    inline def setPhotoSequencesVarargs(value: SchemaOperation*): Self = StObject.set(x, "photoSequences", js.Array(value*))
  }
}
