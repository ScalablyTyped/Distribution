package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for StartEnvironment.
  */
@js.native
trait SchemaStartEnvironmentRequest extends js.Object {
  
  /**
    * The initial access token passed to the environment. If this is present
    * and valid, the environment will be pre-authenticated with gcloud so that
    * the user can run gcloud commands in Cloud Shell without having to log in.
    * This code can be updated later by calling AuthorizeEnvironment.
    */
  var accessToken: js.UndefOr[String] = js.native
}
object SchemaStartEnvironmentRequest {
  
  @scala.inline
  def apply(): SchemaStartEnvironmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentRequest]
  }
  
  @scala.inline
  implicit class SchemaStartEnvironmentRequestOps[Self <: SchemaStartEnvironmentRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
  }
}
