package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaWriteControl extends StObject {
  
  /**
    * The revision_id of the label that the write request will be applied to. If this is not the latest revision of the label, the request will not be processed and will return a 400 Bad Request error.
    */
  var requiredRevisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaWriteControl {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaWriteControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaWriteControl]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaWriteControl](x: Self) {
    
    inline def setRequiredRevisionId(value: String): Self = StObject.set(x, "requiredRevisionId", value.asInstanceOf[js.Any])
    
    inline def setRequiredRevisionIdNull: Self = StObject.set(x, "requiredRevisionId", null)
    
    inline def setRequiredRevisionIdUndefined: Self = StObject.set(x, "requiredRevisionId", js.undefined)
  }
}
