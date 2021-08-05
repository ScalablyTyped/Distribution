package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /** The string identifier of the ImageVersion, in the form: "composer-x.y.z-airflow-a.b(.c)" */
  var imageVersionId: js.UndefOr[String] = js.undefined
  
  /** Whether this is the default ImageVersion used by Composer during environment creation if no input ImageVersion is specified. */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /** supported python versions */
  var supportedPythonVersions: js.UndefOr[js.Array[String]] = js.undefined
}
object ImageVersion {
  
  inline def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  
  extension [Self <: ImageVersion](x: Self) {
    
    inline def setImageVersionId(value: String): Self = StObject.set(x, "imageVersionId", value.asInstanceOf[js.Any])
    
    inline def setImageVersionIdUndefined: Self = StObject.set(x, "imageVersionId", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setSupportedPythonVersions(value: js.Array[String]): Self = StObject.set(x, "supportedPythonVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedPythonVersionsUndefined: Self = StObject.set(x, "supportedPythonVersions", js.undefined)
    
    inline def setSupportedPythonVersionsVarargs(value: String*): Self = StObject.set(x, "supportedPythonVersions", js.Array(value :_*))
  }
}
