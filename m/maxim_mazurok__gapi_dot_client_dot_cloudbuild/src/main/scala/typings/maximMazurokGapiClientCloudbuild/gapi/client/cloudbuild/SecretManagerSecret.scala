package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretManagerSecret extends StObject {
  
  /** Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. */
  var env: js.UndefOr[String] = js.undefined
  
  /** Resource name of the SecretVersion. In format: projects/ *‍/secrets/ *‍/versions/ * */
  var versionName: js.UndefOr[String] = js.undefined
}
object SecretManagerSecret {
  
  inline def apply(): SecretManagerSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretManagerSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretManagerSecret] (val x: Self) extends AnyVal {
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
