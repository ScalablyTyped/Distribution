package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAttachmentsResponse extends StObject {
  
  /**
    * The list of attachments associated with the given case.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. This should be set in the `page_token` field of subsequent `cases.attachments.list` requests. If unspecified, there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAttachmentsResponse {
  
  inline def apply(): SchemaListAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttachmentsResponse]
  }
  
  extension [Self <: SchemaListAttachmentsResponse](x: Self) {
    
    inline def setAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
