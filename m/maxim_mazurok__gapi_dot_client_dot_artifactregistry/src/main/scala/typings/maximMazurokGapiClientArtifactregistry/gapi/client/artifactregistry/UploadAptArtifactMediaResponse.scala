package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadAptArtifactMediaResponse extends StObject {
  
  /** Operation to be returned to the user. */
  var operation: js.UndefOr[Operation] = js.undefined
}
object UploadAptArtifactMediaResponse {
  
  inline def apply(): UploadAptArtifactMediaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAptArtifactMediaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadAptArtifactMediaResponse] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
