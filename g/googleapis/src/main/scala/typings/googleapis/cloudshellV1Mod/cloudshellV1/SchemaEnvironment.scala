package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Shell environment, which is defined as the combination of a Docker
  * image specifying what is installed on the environment and a home directory
  * containing the user&#39;s data that will remain across sessions. Each user
  * has a single environment with the ID &quot;default&quot;.
  */
trait SchemaEnvironment extends StObject {
  
  /**
    * Required. Full path to the Docker image used to run this environment,
    * e.g. &quot;gcr.io/dev-con/cloud-devshell:latest&quot;.
    */
  var dockerImage: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The environment&#39;s identifier, which is always
    * &quot;default&quot;.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is
    * the email address of the user to whom this environment belongs, and
    * `{environment_id}` is the identifier of this environment. For example,
    * `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Public keys associated with the environment. Clients can
    * connect to this environment via SSH only if they possess a private key
    * corresponding to at least one of these public keys. Keys can be added to
    * or removed from the environment using the CreatePublicKey and
    * DeletePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[SchemaPublicKey]] = js.undefined
  
  /**
    * Output only. Host to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshHost: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Port to which clients can connect to initiate SSH sessions
    * with the environment.
    */
  var sshPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Username that clients should use when initiating SSH
    * sessions with the environment.
    */
  var sshUsername: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Current execution state of this environment.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setDockerImage(value: String): Self = StObject.set(x, "dockerImage", value.asInstanceOf[js.Any])
    
    inline def setDockerImageUndefined: Self = StObject.set(x, "dockerImage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicKeys(value: js.Array[SchemaPublicKey]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: SchemaPublicKey*): Self = StObject.set(x, "publicKeys", js.Array(value :_*))
    
    inline def setSshHost(value: String): Self = StObject.set(x, "sshHost", value.asInstanceOf[js.Any])
    
    inline def setSshHostUndefined: Self = StObject.set(x, "sshHost", js.undefined)
    
    inline def setSshPort(value: Double): Self = StObject.set(x, "sshPort", value.asInstanceOf[js.Any])
    
    inline def setSshPortUndefined: Self = StObject.set(x, "sshPort", js.undefined)
    
    inline def setSshUsername(value: String): Self = StObject.set(x, "sshUsername", value.asInstanceOf[js.Any])
    
    inline def setSshUsernameUndefined: Self = StObject.set(x, "sshUsername", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
