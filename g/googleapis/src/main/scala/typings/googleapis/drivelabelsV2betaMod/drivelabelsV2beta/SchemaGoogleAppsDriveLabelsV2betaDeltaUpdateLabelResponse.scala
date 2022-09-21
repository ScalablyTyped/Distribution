package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse extends StObject {
  
  /**
    * The reply of the updates. This maps 1:1 with the updates, although responses to some requests may be empty.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse]] = js.undefined
  
  /**
    * The label after updates were applied. This is only set if [BatchUpdateLabelResponse2.include_label_in_response] is `true` and there were no errors.
    */
  var updatedLabel: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaGoogleAppsDriveLabelsV2betaDeltaUpdateLabelResponseResponse*): Self = StObject.set(x, "responses", js.Array(value*))
    
    inline def setUpdatedLabel(value: SchemaGoogleAppsDriveLabelsV2betaLabel): Self = StObject.set(x, "updatedLabel", value.asInstanceOf[js.Any])
    
    inline def setUpdatedLabelUndefined: Self = StObject.set(x, "updatedLabel", js.undefined)
  }
}
