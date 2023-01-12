package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretVolume extends StObject {
  
  /**
    * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets`
    * directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount path: /etc/secrets
    */
  var mountPath: js.UndefOr[String] = js.undefined
  
  /**
    * Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it is assumed that the secret is in the same
    * project as the function.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Name of the secret in secret manager (not the full resource name). */
  var secret: js.UndefOr[String] = js.undefined
  
  /** List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point. */
  var versions: js.UndefOr[js.Array[SecretVersion]] = js.undefined
}
object SecretVolume {
  
  inline def apply(): SecretVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVolume]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretVolume] (val x: Self) extends AnyVal {
    
    inline def setMountPath(value: String): Self = StObject.set(x, "mountPath", value.asInstanceOf[js.Any])
    
    inline def setMountPathUndefined: Self = StObject.set(x, "mountPath", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setVersions(value: js.Array[SecretVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SecretVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
