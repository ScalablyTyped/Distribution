package typings.googleapis.osloginV1Mod.osloginV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSshpublickeysDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user\}/sshPublicKeys/{fingerprint\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSshpublickeysDelete {
  
  inline def apply(): ParamsResourceUsersSshpublickeysDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSshpublickeysDelete]
  }
  
  extension [Self <: ParamsResourceUsersSshpublickeysDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
