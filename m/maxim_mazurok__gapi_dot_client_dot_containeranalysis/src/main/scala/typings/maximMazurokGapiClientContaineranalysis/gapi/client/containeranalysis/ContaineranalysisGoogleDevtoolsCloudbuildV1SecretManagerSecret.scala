package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret extends StObject {
  
  /** Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. */
  var env: js.UndefOr[String] = js.undefined
  
  /** Resource name of the SecretVersion. In format: projects/ *‍/secrets/ *‍/versions/ * */
  var versionName: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret](x: Self) {
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
