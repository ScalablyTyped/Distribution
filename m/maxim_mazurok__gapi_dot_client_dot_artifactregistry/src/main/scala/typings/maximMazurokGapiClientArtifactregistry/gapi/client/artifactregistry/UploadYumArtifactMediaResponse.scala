package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadYumArtifactMediaResponse extends StObject {
  
  /** Operation to be returned to the user. */
  var operation: js.UndefOr[Operation] = js.undefined
}
object UploadYumArtifactMediaResponse {
  
  inline def apply(): UploadYumArtifactMediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadYumArtifactMediaResponse]
  }
  
  extension [Self <: UploadYumArtifactMediaResponse](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
