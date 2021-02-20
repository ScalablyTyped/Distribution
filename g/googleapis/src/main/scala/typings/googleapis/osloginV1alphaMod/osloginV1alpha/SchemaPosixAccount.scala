package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The POSIX account information associated with a Google account.
  */
@js.native
trait SchemaPosixAccount extends StObject {
  
  /**
    * Output only. A POSIX account identifier.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The GECOS (user information) entry for this account.
    */
  var gecos: js.UndefOr[String] = js.native
  
  /**
    * The default group ID.
    */
  var gid: js.UndefOr[String] = js.native
  
  /**
    * The path to the home directory for this account.
    */
  var homeDirectory: js.UndefOr[String] = js.native
  
  /**
    * The operating system type where this account applies.
    */
  var operatingSystemType: js.UndefOr[String] = js.native
  
  /**
    * Only one POSIX account can be marked as primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * The path to the logic shell for this account.
    */
  var shell: js.UndefOr[String] = js.native
  
  /**
    * System identifier for which account the username or uid applies to. By
    * default, the empty value is used.
    */
  var systemId: js.UndefOr[String] = js.native
  
  /**
    * The user ID.
    */
  var uid: js.UndefOr[String] = js.native
  
  /**
    * The username of the POSIX account.
    */
  var username: js.UndefOr[String] = js.native
}
object SchemaPosixAccount {
  
  @scala.inline
  def apply(): SchemaPosixAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosixAccount]
  }
  
  @scala.inline
  implicit class SchemaPosixAccountMutableBuilder[Self <: SchemaPosixAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGecosUndefined: Self = StObject.set(x, "gecos", js.undefined)
    
    @scala.inline
    def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    @scala.inline
    def setHomeDirectory(value: String): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
    
    @scala.inline
    def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
