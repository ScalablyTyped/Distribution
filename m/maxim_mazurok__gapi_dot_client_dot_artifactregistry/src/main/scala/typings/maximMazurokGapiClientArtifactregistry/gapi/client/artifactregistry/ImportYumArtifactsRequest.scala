package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportYumArtifactsRequest extends StObject {
  
  /** Google Cloud Storage location where input content is located. */
  var gcsSource: js.UndefOr[ImportYumArtifactsGcsSource] = js.undefined
}
object ImportYumArtifactsRequest {
  
  inline def apply(): ImportYumArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportYumArtifactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportYumArtifactsRequest] (val x: Self) extends AnyVal {
    
    inline def setGcsSource(value: ImportYumArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
