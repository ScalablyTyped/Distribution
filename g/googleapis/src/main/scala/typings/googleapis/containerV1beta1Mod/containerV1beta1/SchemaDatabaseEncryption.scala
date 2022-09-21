package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabaseEncryption extends StObject {
  
  /**
    * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
    */
  var keyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Denotes the state of etcd encryption.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabaseEncryption {
  
  inline def apply(): SchemaDatabaseEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseEncryption]
  }
  
  extension [Self <: SchemaDatabaseEncryption](x: Self) {
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameNull: Self = StObject.set(x, "keyName", null)
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
