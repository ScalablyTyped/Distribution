package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.anon.MessageMetadatauseridnumb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRecipientMetadata extends StObject {
  
  /** The email address of the recipient that the metadata is associated with. */
  var rcpt: String
  
  /**
    * The recipient's unique metadata. If a key exists in both the per-recipient
    * metadata and the global metadata, the per-recipient metadata will be used.
    */
  var values: MessageMetadatauseridnumb
}
object MessageRecipientMetadata {
  
  inline def apply(rcpt: String, values: MessageMetadatauseridnumb): MessageRecipientMetadata = {
    val __obj = js.Dynamic.literal(rcpt = rcpt.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRecipientMetadata]
  }
  
  extension [Self <: MessageRecipientMetadata](x: Self) {
    
    inline def setRcpt(value: String): Self = StObject.set(x, "rcpt", value.asInstanceOf[js.Any])
    
    inline def setValues(value: MessageMetadatauseridnumb): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
