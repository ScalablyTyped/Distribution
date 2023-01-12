package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadAptArtifactResponse extends StObject {
  
  /** The Apt artifacts updated. */
  var aptArtifacts: js.UndefOr[js.Array[AptArtifact]] = js.undefined
}
object UploadAptArtifactResponse {
  
  inline def apply(): UploadAptArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAptArtifactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadAptArtifactResponse] (val x: Self) extends AnyVal {
    
    inline def setAptArtifacts(value: js.Array[AptArtifact]): Self = StObject.set(x, "aptArtifacts", value.asInstanceOf[js.Any])
    
    inline def setAptArtifactsUndefined: Self = StObject.set(x, "aptArtifacts", js.undefined)
    
    inline def setAptArtifactsVarargs(value: AptArtifact*): Self = StObject.set(x, "aptArtifacts", js.Array(value*))
  }
}
