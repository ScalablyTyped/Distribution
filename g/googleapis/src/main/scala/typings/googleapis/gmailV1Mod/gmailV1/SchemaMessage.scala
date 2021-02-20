package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An email message.
  */
@js.native
trait SchemaMessage extends StObject {
  
  /**
    * The ID of the last history record that modified this message.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * The immutable ID of the message.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The internal message creation timestamp (epoch ms), which determines
    * ordering in the inbox. For normal SMTP-received email, this represents
    * the time the message was originally accepted by Google, which is more
    * reliable than the Date header. However, for API-migrated mail, it can be
    * configured by client to be based on the Date header.
    */
  var internalDate: js.UndefOr[String] = js.native
  
  /**
    * List of IDs of labels applied to this message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The parsed email structure in the message parts.
    */
  var payload: js.UndefOr[SchemaMessagePart] = js.native
  
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded
    * string. Returned in messages.get and drafts.get responses when the
    * format=RAW parameter is supplied.
    */
  var raw: js.UndefOr[String] = js.native
  
  /**
    * Estimated size in bytes of the message.
    */
  var sizeEstimate: js.UndefOr[Double] = js.native
  
  /**
    * A short part of the message text.
    */
  var snippet: js.UndefOr[String] = js.native
  
  /**
    * The ID of the thread the message belongs to. To add a message or draft to
    * a thread, the following criteria must be met:  - The requested threadId
    * must be specified on the Message or Draft.Message you supply with your
    * request.  - The References and In-Reply-To headers must be set in
    * compliance with the RFC 2822 standard.  - The Subject headers must match.
    */
  var threadId: js.UndefOr[String] = js.native
}
object SchemaMessage {
  
  @scala.inline
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  
  @scala.inline
  implicit class SchemaMessageMutableBuilder[Self <: SchemaMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalDate(value: String): Self = StObject.set(x, "internalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalDateUndefined: Self = StObject.set(x, "internalDate", js.undefined)
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: SchemaMessagePart): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setSizeEstimate(value: Double): Self = StObject.set(x, "sizeEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeEstimateUndefined: Self = StObject.set(x, "sizeEstimate", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
