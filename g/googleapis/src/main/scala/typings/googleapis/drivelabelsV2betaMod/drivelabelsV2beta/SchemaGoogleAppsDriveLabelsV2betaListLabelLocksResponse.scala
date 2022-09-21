package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse extends StObject {
  
  /**
    * LabelLocks.
    */
  var labelLocks: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelLock]] = js.undefined
  
  /**
    * The token of the next page in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaListLabelLocksResponse](x: Self) {
    
    inline def setLabelLocks(value: js.Array[SchemaGoogleAppsDriveLabelsV2betaLabelLock]): Self = StObject.set(x, "labelLocks", value.asInstanceOf[js.Any])
    
    inline def setLabelLocksUndefined: Self = StObject.set(x, "labelLocks", js.undefined)
    
    inline def setLabelLocksVarargs(value: SchemaGoogleAppsDriveLabelsV2betaLabelLock*): Self = StObject.set(x, "labelLocks", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
