package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadYumArtifactResponse extends StObject {
  
  /** The Apt artifacts updated. */
  var yumArtifacts: js.UndefOr[js.Array[YumArtifact]] = js.undefined
}
object UploadYumArtifactResponse {
  
  inline def apply(): UploadYumArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadYumArtifactResponse]
  }
  
  extension [Self <: UploadYumArtifactResponse](x: Self) {
    
    inline def setYumArtifacts(value: js.Array[YumArtifact]): Self = StObject.set(x, "yumArtifacts", value.asInstanceOf[js.Any])
    
    inline def setYumArtifactsUndefined: Self = StObject.set(x, "yumArtifacts", js.undefined)
    
    inline def setYumArtifactsVarargs(value: YumArtifact*): Self = StObject.set(x, "yumArtifacts", js.Array(value*))
  }
}
