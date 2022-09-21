package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListParticipantsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of participants. There is a maximum number of items returned based on the page_size field in the request.
    */
  var participants: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Participant]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListParticipantsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListParticipantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListParticipantsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListParticipantsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setParticipants(value: js.Array[SchemaGoogleCloudDialogflowV2Participant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: SchemaGoogleCloudDialogflowV2Participant*): Self = StObject.set(x, "participants", js.Array(value*))
  }
}
