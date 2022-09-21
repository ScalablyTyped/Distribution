package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateAttachmentRequest extends StObject {
  
  /**
    * Required. The attachment to be created.
    */
  var attachment: js.UndefOr[SchemaAttachment] = js.undefined
}
object SchemaCreateAttachmentRequest {
  
  inline def apply(): SchemaCreateAttachmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAttachmentRequest]
  }
  
  extension [Self <: SchemaCreateAttachmentRequest](x: Self) {
    
    inline def setAttachment(value: SchemaAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
  }
}
