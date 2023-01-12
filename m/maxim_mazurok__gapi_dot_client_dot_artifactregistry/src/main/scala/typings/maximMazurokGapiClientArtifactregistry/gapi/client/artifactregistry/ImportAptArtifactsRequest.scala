package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAptArtifactsRequest extends StObject {
  
  /** Google Cloud Storage location where input content is located. */
  var gcsSource: js.UndefOr[ImportAptArtifactsGcsSource] = js.undefined
}
object ImportAptArtifactsRequest {
  
  inline def apply(): ImportAptArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAptArtifactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportAptArtifactsRequest] (val x: Self) extends AnyVal {
    
    inline def setGcsSource(value: ImportAptArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
