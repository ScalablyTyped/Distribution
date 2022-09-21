package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosixAccount extends StObject {
  
  /**
    * Output only. A POSIX account identifier.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GECOS (user information) entry for this account.
    */
  var gecos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default group ID.
    */
  var gid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path to the home directory for this account.
    */
  var homeDirectory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The canonical resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operating system type where this account applies.
    */
  var operatingSystemType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only one POSIX account can be marked as primary.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The path to the logic shell for this account.
    */
  var shell: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System identifier for which account the username or uid applies to. By default, the empty value is used.
    */
  var systemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user ID.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username of the POSIX account.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosixAccount {
  
  inline def apply(): SchemaPosixAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixAccount]
  }
  
  extension [Self <: SchemaPosixAccount](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
    
    inline def setGecosNull: Self = StObject.set(x, "gecos", null)
    
    inline def setGecosUndefined: Self = StObject.set(x, "gecos", js.undefined)
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidNull: Self = StObject.set(x, "gid", null)
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setHomeDirectory(value: String): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
    
    inline def setHomeDirectoryNull: Self = StObject.set(x, "homeDirectory", null)
    
    inline def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemTypeNull: Self = StObject.set(x, "operatingSystemType", null)
    
    inline def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellNull: Self = StObject.set(x, "shell", null)
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdNull: Self = StObject.set(x, "systemId", null)
    
    inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
