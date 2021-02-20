package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scan authentication configuration.
  */
@js.native
trait SchemaAuthentication extends StObject {
  
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[SchemaCustomAccount] = js.native
  
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[SchemaGoogleAccount] = js.native
}
object SchemaAuthentication {
  
  @scala.inline
  def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  
  @scala.inline
  implicit class SchemaAuthenticationMutableBuilder[Self <: SchemaAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAccount(value: SchemaCustomAccount): Self = StObject.set(x, "customAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAccountUndefined: Self = StObject.set(x, "customAccount", js.undefined)
    
    @scala.inline
    def setGoogleAccount(value: SchemaGoogleAccount): Self = StObject.set(x, "googleAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAccountUndefined: Self = StObject.set(x, "googleAccount", js.undefined)
  }
}
