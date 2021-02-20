package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes authentication configuration that uses a custom account.
  */
@js.native
trait SchemaCustomAccount extends StObject {
  
  /**
    * Required. The login form URL of the website.
    */
  var loginUrl: js.UndefOr[String] = js.native
  
  /**
    * Input only. Required. The password of the custom account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Required. The user name of the custom account.
    */
  var username: js.UndefOr[String] = js.native
}
object SchemaCustomAccount {
  
  @scala.inline
  def apply(): SchemaCustomAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAccount]
  }
  
  @scala.inline
  implicit class SchemaCustomAccountMutableBuilder[Self <: SchemaCustomAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
