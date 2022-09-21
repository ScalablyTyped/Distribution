package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessage extends StObject {
  
  /**
    * The ID of the last history record that modified this message.
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The immutable ID of the message.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The internal message creation timestamp (epoch ms), which determines ordering in the inbox. For normal SMTP-received email, this represents the time the message was originally accepted by Google, which is more reliable than the `Date` header. However, for API-migrated mail, it can be configured by client to be based on the `Date` header.
    */
  var internalDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of IDs of labels applied to this message.
    */
  var labelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The parsed email structure in the message parts.
    */
  var payload: js.UndefOr[SchemaMessagePart] = js.undefined
  
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded string. Returned in `messages.get` and `drafts.get` responses when the `format=RAW` parameter is supplied.
    */
  var raw: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Estimated size in bytes of the message.
    */
  var sizeEstimate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A short part of the message text.
    */
  var snippet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the thread the message belongs to. To add a message or draft to a thread, the following criteria must be met: 1. The requested `threadId` must be specified on the `Message` or `Draft.Message` you supply with your request. 2. The `References` and `In-Reply-To` headers must be set in compliance with the [RFC 2822](https://tools.ietf.org/html/rfc2822) standard. 3. The `Subject` headers must match.
    */
  var threadId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMessage {
  
  inline def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  extension [Self <: SchemaMessage](x: Self) {
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalDate(value: String): Self = StObject.set(x, "internalDate", value.asInstanceOf[js.Any])
    
    inline def setInternalDateNull: Self = StObject.set(x, "internalDate", null)
    
    inline def setInternalDateUndefined: Self = StObject.set(x, "internalDate", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setPayload(value: SchemaMessagePart): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNull: Self = StObject.set(x, "raw", null)
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSizeEstimate(value: Double): Self = StObject.set(x, "sizeEstimate", value.asInstanceOf[js.Any])
    
    inline def setSizeEstimateNull: Self = StObject.set(x, "sizeEstimate", null)
    
    inline def setSizeEstimateUndefined: Self = StObject.set(x, "sizeEstimate", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetNull: Self = StObject.set(x, "snippet", null)
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdNull: Self = StObject.set(x, "threadId", null)
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
