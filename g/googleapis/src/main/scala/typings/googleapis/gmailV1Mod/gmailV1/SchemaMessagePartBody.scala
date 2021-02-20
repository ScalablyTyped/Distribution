package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The body of a single MIME message part.
  */
@js.native
trait SchemaMessagePartBody extends StObject {
  
  /**
    * When present, contains the ID of an external attachment that can be
    * retrieved in a separate messages.attachments.get request. When not
    * present, the entire content of the message part body is contained in the
    * data field.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * The body data of a MIME message part as a base64url encoded string. May
    * be empty for MIME container types that have no message body or when the
    * body data is sent as a separate attachment. An attachment ID is present
    * if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Number of bytes for the message part data (encoding notwithstanding).
    */
  var size: js.UndefOr[Double] = js.native
}
object SchemaMessagePartBody {
  
  @scala.inline
  def apply(): SchemaMessagePartBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePartBody]
  }
  
  @scala.inline
  implicit class SchemaMessagePartBodyMutableBuilder[Self <: SchemaMessagePartBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
