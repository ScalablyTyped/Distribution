package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoginProfile extends StObject {
  
  /**
    * Required. A unique user ID.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[SchemaPosixAccount]] = js.undefined
  
  /**
    * The registered security key credentials for a user.
    */
  var securityKeys: js.UndefOr[js.Array[SchemaSecurityKey]] = js.undefined
  
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[SchemaSshPublicKey] | Null] = js.undefined
}
object SchemaLoginProfile {
  
  inline def apply(): SchemaLoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoginProfile]
  }
  
  extension [Self <: SchemaLoginProfile](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosixAccounts(value: js.Array[SchemaPosixAccount]): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
    
    inline def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
    
    inline def setPosixAccountsVarargs(value: SchemaPosixAccount*): Self = StObject.set(x, "posixAccounts", js.Array(value*))
    
    inline def setSecurityKeys(value: js.Array[SchemaSecurityKey]): Self = StObject.set(x, "securityKeys", value.asInstanceOf[js.Any])
    
    inline def setSecurityKeysUndefined: Self = StObject.set(x, "securityKeys", js.undefined)
    
    inline def setSecurityKeysVarargs(value: SchemaSecurityKey*): Self = StObject.set(x, "securityKeys", js.Array(value*))
    
    inline def setSshPublicKeys(value: StringDictionary[SchemaSshPublicKey]): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeysNull: Self = StObject.set(x, "sshPublicKeys", null)
    
    inline def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
  }
}
