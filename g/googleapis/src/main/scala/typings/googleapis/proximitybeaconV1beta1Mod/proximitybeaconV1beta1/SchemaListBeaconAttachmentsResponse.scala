package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to `ListBeaconAttachments` that contains the requested
  * attachments.
  */
trait SchemaListBeaconAttachmentsResponse extends StObject {
  
  /**
    * The attachments that corresponded to the request params.
    */
  var attachments: js.UndefOr[js.Array[SchemaBeaconAttachment]] = js.undefined
}
object SchemaListBeaconAttachmentsResponse {
  
  inline def apply(): SchemaListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBeaconAttachmentsResponse]
  }
  
  extension [Self <: SchemaListBeaconAttachmentsResponse](x: Self) {
    
    inline def setAttachments(value: js.Array[SchemaBeaconAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: SchemaBeaconAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
