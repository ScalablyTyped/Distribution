package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine service account, identical to the Compute Engine resource.
  */
trait SchemaServiceAccount extends StObject {
  
  /**
    * The service account email address, for example:
    * 123845678986@project.gserviceaccount.com
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The list of OAuth2 scopes to obtain for the service account, for example:
    * https://www.googleapis.com/auth/devstorage.full_control
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaServiceAccount {
  
  @scala.inline
  def apply(): SchemaServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccount]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountMutableBuilder[Self <: SchemaServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
