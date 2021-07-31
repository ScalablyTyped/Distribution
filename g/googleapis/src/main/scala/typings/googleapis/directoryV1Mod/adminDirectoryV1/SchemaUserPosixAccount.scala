package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a POSIX account entry. Description of the field family:
  * go/fbs-posix.
  */
trait SchemaUserPosixAccount extends StObject {
  
  /**
    * A POSIX account field identifier.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GECOS (user information) for this account.
    */
  var gecos: js.UndefOr[String] = js.undefined
  
  /**
    * The default group ID.
    */
  var gid: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the home directory for this account.
    */
  var homeDirectory: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system type for this account.
    */
  var operatingSystemType: js.UndefOr[String] = js.undefined
  
  /**
    * If this is user&#39;s primary account within the SystemId.
    */
  var primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path to the login shell for this account.
    */
  var shell: js.UndefOr[String] = js.undefined
  
  /**
    * System identifier for which account Username or Uid apply to.
    */
  var systemId: js.UndefOr[String] = js.undefined
  
  /**
    * The POSIX compliant user ID.
    */
  var uid: js.UndefOr[String] = js.undefined
  
  /**
    * The username of the account.
    */
  var username: js.UndefOr[String] = js.undefined
}
object SchemaUserPosixAccount {
  
  @scala.inline
  def apply(): SchemaUserPosixAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPosixAccount]
  }
  
  @scala.inline
  implicit class SchemaUserPosixAccountMutableBuilder[Self <: SchemaUserPosixAccount] (val x: Self) extends AnyVal {
    
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
