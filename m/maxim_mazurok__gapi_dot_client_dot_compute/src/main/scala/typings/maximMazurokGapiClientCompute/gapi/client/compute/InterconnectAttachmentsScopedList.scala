package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectAttachmentsScopedList extends StObject {
  
  /** A list of interconnect attachments contained in this scope. */
  var interconnectAttachments: js.UndefOr[js.Array[InterconnectAttachment]] = js.undefined
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object InterconnectAttachmentsScopedList {
  
  inline def apply(): InterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectAttachmentsScopedList]
  }
  
  extension [Self <: InterconnectAttachmentsScopedList](x: Self) {
    
    inline def setInterconnectAttachments(value: js.Array[InterconnectAttachment]): Self = StObject.set(x, "interconnectAttachments", value.asInstanceOf[js.Any])
    
    inline def setInterconnectAttachmentsUndefined: Self = StObject.set(x, "interconnectAttachments", js.undefined)
    
    inline def setInterconnectAttachmentsVarargs(value: InterconnectAttachment*): Self = StObject.set(x, "interconnectAttachments", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
