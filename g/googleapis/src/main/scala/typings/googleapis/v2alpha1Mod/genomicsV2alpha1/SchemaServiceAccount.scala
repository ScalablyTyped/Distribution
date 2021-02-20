package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about a Google Cloud service account.
  */
@js.native
trait SchemaServiceAccount extends StObject {
  
  /**
    * Email address of the service account. If not specified, the default
    * Compute Engine service account for the project will be used.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * List of scopes to be enabled for this service account on the VM, in
    * addition to the Cloud Genomics API scope.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
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
