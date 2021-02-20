package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes authentication configuration that uses a Google account.
  */
@js.native
trait SchemaGoogleAccount extends StObject {
  
  /**
    * Input only. Required. The password of the Google account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Required. The user name of the Google account.
    */
  var username: js.UndefOr[String] = js.native
}
object SchemaGoogleAccount {
  
  @scala.inline
  def apply(): SchemaGoogleAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAccount]
  }
  
  @scala.inline
  implicit class SchemaGoogleAccountMutableBuilder[Self <: SchemaGoogleAccount] (val x: Self) extends AnyVal {
    
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
