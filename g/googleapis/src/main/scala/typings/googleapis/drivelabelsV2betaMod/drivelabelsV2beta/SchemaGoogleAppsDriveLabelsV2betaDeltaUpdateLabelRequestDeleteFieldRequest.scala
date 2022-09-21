package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest extends StObject {
  
  /**
    * Required. ID of the Field to delete.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelRequestDeleteFieldRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
