package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the errors to be returned in
  * google.api.servicecontrol.v1.CheckResponse.check_errors.
  */
@js.native
trait SchemaCheckError extends js.Object {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Free-form text providing details on the error cause of the error.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * Contains public information about the check error. If available,
    * `status.code` will be non zero and client can propagate it out as public
    * error.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * Subject to whom this error applies. See the specific code enum for more
    * details on this field. For example:     - “project:&lt;project-id or
    * project-number&gt;”     - “folder:&lt;folder-id&gt;”     -
    * “organization:&lt;organization-id&gt;”
    */
  var subject: js.UndefOr[String] = js.native
}
object SchemaCheckError {
  
  @scala.inline
  def apply(): SchemaCheckError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckError]
  }
  
  @scala.inline
  implicit class SchemaCheckErrorOps[Self <: SchemaCheckError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
