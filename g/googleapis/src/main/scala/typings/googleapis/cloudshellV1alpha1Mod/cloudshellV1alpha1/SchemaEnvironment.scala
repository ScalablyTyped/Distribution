package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironment extends StObject {
  
  /**
    * Required. Full path to the Docker image used to run this environment, e.g. "gcr.io/dev-con/cloud-devshell:latest".
    */
  var dockerImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The environment's identifier, unique among the user's environments.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Full name of this resource, in the format `users/{owner_email\}/environments/{environment_id\}`. `{owner_email\}` is the email address of the user to whom this environment belongs, and `{environment_id\}` is the identifier of this environment. For example, `users/someone@example.com/environments/default`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Public keys associated with the environment. Clients can connect to this environment via SSH only if they possess a private key corresponding to at least one of these public keys. Keys can be added to or removed from the environment using the CreatePublicKey and DeletePublicKey methods.
    */
  var publicKeys: js.UndefOr[js.Array[SchemaPublicKey]] = js.undefined
  
  /**
    * Indicates the size of the backing VM running the environment. If set to something other than DEFAULT, it will be reverted to the default VM size after vm_size_expire_time.
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Host to which clients can connect to initiate SSH sessions with the environment.
    */
  var sshHost: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Port to which clients can connect to initiate SSH sessions with the environment.
    */
  var sshPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Username that clients should use when initiating SSH sessions with the environment.
    */
  var sshUsername: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current execution state of this environment.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the Environment will expire back to the default VM size.
    */
  var vmSizeExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Host to which clients can connect to initiate HTTPS or WSS connections with the environment.
    */
  var webHost: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Ports to which clients can connect to initiate HTTPS or WSS connections with the environment.
    */
  var webPorts: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setDockerImage(value: String): Self = StObject.set(x, "dockerImage", value.asInstanceOf[js.Any])
    
    inline def setDockerImageNull: Self = StObject.set(x, "dockerImage", null)
    
    inline def setDockerImageUndefined: Self = StObject.set(x, "dockerImage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublicKeys(value: js.Array[SchemaPublicKey]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: SchemaPublicKey*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSshHost(value: String): Self = StObject.set(x, "sshHost", value.asInstanceOf[js.Any])
    
    inline def setSshHostNull: Self = StObject.set(x, "sshHost", null)
    
    inline def setSshHostUndefined: Self = StObject.set(x, "sshHost", js.undefined)
    
    inline def setSshPort(value: Double): Self = StObject.set(x, "sshPort", value.asInstanceOf[js.Any])
    
    inline def setSshPortNull: Self = StObject.set(x, "sshPort", null)
    
    inline def setSshPortUndefined: Self = StObject.set(x, "sshPort", js.undefined)
    
    inline def setSshUsername(value: String): Self = StObject.set(x, "sshUsername", value.asInstanceOf[js.Any])
    
    inline def setSshUsernameNull: Self = StObject.set(x, "sshUsername", null)
    
    inline def setSshUsernameUndefined: Self = StObject.set(x, "sshUsername", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVmSizeExpireTime(value: String): Self = StObject.set(x, "vmSizeExpireTime", value.asInstanceOf[js.Any])
    
    inline def setVmSizeExpireTimeNull: Self = StObject.set(x, "vmSizeExpireTime", null)
    
    inline def setVmSizeExpireTimeUndefined: Self = StObject.set(x, "vmSizeExpireTime", js.undefined)
    
    inline def setWebHost(value: String): Self = StObject.set(x, "webHost", value.asInstanceOf[js.Any])
    
    inline def setWebHostNull: Self = StObject.set(x, "webHost", null)
    
    inline def setWebHostUndefined: Self = StObject.set(x, "webHost", js.undefined)
    
    inline def setWebPorts(value: js.Array[Double]): Self = StObject.set(x, "webPorts", value.asInstanceOf[js.Any])
    
    inline def setWebPortsNull: Self = StObject.set(x, "webPorts", null)
    
    inline def setWebPortsUndefined: Self = StObject.set(x, "webPorts", js.undefined)
    
    inline def setWebPortsVarargs(value: Double*): Self = StObject.set(x, "webPorts", js.Array(value*))
  }
}
