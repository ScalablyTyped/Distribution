package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
@js.native
trait SchemaCredential extends js.Object {
  
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[SchemaBasicAuth] = js.native
  
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
  
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.native
}
object SchemaCredential {
  
  @scala.inline
  def apply(): SchemaCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCredential]
  }
  
  @scala.inline
  implicit class SchemaCredentialOps[Self <: SchemaCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasicAuth(value: SchemaBasicAuth): Self = this.set("basicAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicAuth: Self = this.set("basicAuth", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: SchemaServiceAccount): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setUseProjectDefault(value: Boolean): Self = this.set("useProjectDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseProjectDefault: Self = this.set("useProjectDefault", js.undefined)
  }
}
