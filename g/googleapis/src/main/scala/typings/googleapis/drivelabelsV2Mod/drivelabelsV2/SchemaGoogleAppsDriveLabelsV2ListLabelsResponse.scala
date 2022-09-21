package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2ListLabelsResponse extends StObject {
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2Label]] = js.undefined
  
  /**
    * The token of the next page in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2ListLabelsResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2ListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2ListLabelsResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2ListLabelsResponse](x: Self) {
    
    inline def setLabels(value: js.Array[SchemaGoogleAppsDriveLabelsV2Label]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaGoogleAppsDriveLabelsV2Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
