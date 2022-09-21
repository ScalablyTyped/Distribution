package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse extends StObject {
  
  /**
    * Labels.
    */
  var labels: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaLabel]] = js.undefined
  
  /**
    * The token of the next page in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaListLabelsResponse](x: Self) {
    
    inline def setLabels(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaGoogleAppsDriveLabelsV2betaLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
