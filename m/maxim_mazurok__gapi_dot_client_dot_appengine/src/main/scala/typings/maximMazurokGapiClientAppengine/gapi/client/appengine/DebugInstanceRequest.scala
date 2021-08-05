package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugInstanceRequest extends StObject {
  
  /**
    * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME] [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
    * {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and Removing SSH Keys
    * (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
    */
  var sshKey: js.UndefOr[String] = js.undefined
}
object DebugInstanceRequest {
  
  inline def apply(): DebugInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugInstanceRequest]
  }
  
  extension [Self <: DebugInstanceRequest](x: Self) {
    
    inline def setSshKey(value: String): Self = StObject.set(x, "sshKey", value.asInstanceOf[js.Any])
    
    inline def setSshKeyUndefined: Self = StObject.set(x, "sshKey", js.undefined)
  }
}
