package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportYumArtifactsResponse extends StObject {
  
  /** Detailed error info for packages that were not imported. */
  var errors: js.UndefOr[js.Array[ImportYumArtifactsErrorInfo]] = js.undefined
  
  /** The yum artifacts imported. */
  var yumArtifacts: js.UndefOr[js.Array[YumArtifact]] = js.undefined
}
object ImportYumArtifactsResponse {
  
  inline def apply(): ImportYumArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportYumArtifactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportYumArtifactsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ImportYumArtifactsErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ImportYumArtifactsErrorInfo*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setYumArtifacts(value: js.Array[YumArtifact]): Self = StObject.set(x, "yumArtifacts", value.asInstanceOf[js.Any])
    
    inline def setYumArtifactsUndefined: Self = StObject.set(x, "yumArtifacts", js.undefined)
    
    inline def setYumArtifactsVarargs(value: YumArtifact*): Self = StObject.set(x, "yumArtifacts", js.Array(value*))
  }
}
