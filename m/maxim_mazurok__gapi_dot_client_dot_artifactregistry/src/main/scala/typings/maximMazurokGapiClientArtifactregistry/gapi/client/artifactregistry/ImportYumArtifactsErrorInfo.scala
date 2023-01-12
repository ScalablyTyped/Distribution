package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportYumArtifactsErrorInfo extends StObject {
  
  /** The detailed error status. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** Google Cloud Storage location requested. */
  var gcsSource: js.UndefOr[ImportYumArtifactsGcsSource] = js.undefined
}
object ImportYumArtifactsErrorInfo {
  
  inline def apply(): ImportYumArtifactsErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportYumArtifactsErrorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportYumArtifactsErrorInfo] (val x: Self) extends AnyVal {
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGcsSource(value: ImportYumArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
