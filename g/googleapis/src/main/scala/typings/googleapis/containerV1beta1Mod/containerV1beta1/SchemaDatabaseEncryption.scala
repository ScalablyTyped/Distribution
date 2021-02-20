package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of etcd encryption.
  */
@js.native
trait SchemaDatabaseEncryption extends StObject {
  
  /**
    * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex.
    * projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
    */
  var keyName: js.UndefOr[String] = js.native
  
  /**
    * Denotes the state of etcd encryption.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaDatabaseEncryption {
  
  @scala.inline
  def apply(): SchemaDatabaseEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseEncryption]
  }
  
  @scala.inline
  implicit class SchemaDatabaseEncryptionMutableBuilder[Self <: SchemaDatabaseEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
