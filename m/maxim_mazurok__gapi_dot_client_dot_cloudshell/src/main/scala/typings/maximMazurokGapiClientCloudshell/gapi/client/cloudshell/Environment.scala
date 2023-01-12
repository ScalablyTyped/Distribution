package typings.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /** Required. Immutable. Full path to the Docker image used to run this environment, e.g. "gcr.io/dev-con/cloud-devshell:latest". */
  var dockerImage: js.UndefOr[String] = js.undefined
  
  /** Output only. The environment's identifier, unique among the user's environments. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. Full name of this resource, in the format `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is the email address of the user to whom this environment
    * belongs, and `{environment_id}` is the identifier of this environment. For example, `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Public keys associated with the environment. Clients can connect to this environment via SSH only if they possess a private key corresponding to at least one of these
    * public keys. Keys can be added to or removed from the environment using the AddPublicKey and RemovePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Host to which clients can connect to initiate SSH sessions with the environment. */
  var sshHost: js.UndefOr[String] = js.undefined
  
  /** Output only. Port to which clients can connect to initiate SSH sessions with the environment. */
  var sshPort: js.UndefOr[Double] = js.undefined
  
  /** Output only. Username that clients should use when initiating SSH sessions with the environment. */
  var sshUsername: js.UndefOr[String] = js.undefined
  
  /** Output only. Current execution state of this environment. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Host to which clients can connect to initiate HTTPS or WSS connections with the environment. */
  var webHost: js.UndefOr[String] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    inline def setDockerImage(value: String): Self = StObject.set(x, "dockerImage", value.asInstanceOf[js.Any])
    
    inline def setDockerImageUndefined: Self = StObject.set(x, "dockerImage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicKeys(value: js.Array[String]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: String*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setSshHost(value: String): Self = StObject.set(x, "sshHost", value.asInstanceOf[js.Any])
    
    inline def setSshHostUndefined: Self = StObject.set(x, "sshHost", js.undefined)
    
    inline def setSshPort(value: Double): Self = StObject.set(x, "sshPort", value.asInstanceOf[js.Any])
    
    inline def setSshPortUndefined: Self = StObject.set(x, "sshPort", js.undefined)
    
    inline def setSshUsername(value: String): Self = StObject.set(x, "sshUsername", value.asInstanceOf[js.Any])
    
    inline def setSshUsernameUndefined: Self = StObject.set(x, "sshUsername", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWebHost(value: String): Self = StObject.set(x, "webHost", value.asInstanceOf[js.Any])
    
    inline def setWebHostUndefined: Self = StObject.set(x, "webHost", js.undefined)
  }
}
