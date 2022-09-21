package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretVersion extends StObject {
  
  /**
    * Relative path of the file under the mount path where the secret value for this version will be fetched and made available. For example, setting the mount_path as '/etc/secrets' and
    * path as `secret_foo` would mount the secret value file at `/etc/secrets/secret_foo`.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** Version of the secret (version number or the string 'latest'). It is preferable to use `latest` version with secret volumes as secret value changes are reflected immediately. */
  var version: js.UndefOr[String] = js.undefined
}
object SecretVersion {
  
  inline def apply(): SecretVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersion]
  }
  
  extension [Self <: SecretVersion](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
