package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for a request to delete attachments.
  */
trait SchemaDeleteAttachmentsResponse extends StObject {
  
  /**
    * The number of attachments that were deleted.
    */
  var numDeleted: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteAttachmentsResponse {
  
  inline def apply(): SchemaDeleteAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAttachmentsResponse]
  }
  
  extension [Self <: SchemaDeleteAttachmentsResponse](x: Self) {
    
    inline def setNumDeleted(value: Double): Self = StObject.set(x, "numDeleted", value.asInstanceOf[js.Any])
    
    inline def setNumDeletedUndefined: Self = StObject.set(x, "numDeleted", js.undefined)
  }
}
