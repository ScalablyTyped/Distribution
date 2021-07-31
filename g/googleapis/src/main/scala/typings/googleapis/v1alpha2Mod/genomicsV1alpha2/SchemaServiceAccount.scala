package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Cloud Service Account.
  */
trait SchemaServiceAccount extends StObject {
  
  /**
    * Email address of the service account. Defaults to `default`, which uses
    * the compute service account associated with the project.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * List of scopes to be enabled for this service account on the VM. The
    * following scopes are automatically included:  *
    * https://www.googleapis.com/auth/compute *
    * https://www.googleapis.com/auth/devstorage.full_control *
    * https://www.googleapis.com/auth/genomics *
    * https://www.googleapis.com/auth/logging.write *
    * https://www.googleapis.com/auth/monitoring.write
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
