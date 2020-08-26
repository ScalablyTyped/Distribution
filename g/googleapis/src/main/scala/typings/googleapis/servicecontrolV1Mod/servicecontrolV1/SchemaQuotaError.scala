package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents error information for QuotaOperation.
  */
@js.native
trait SchemaQuotaError extends js.Object {
  /**
    * Error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Free-form text that provides details on the cause of the error.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Subject to whom this error applies. See the specific enum for more
    * details on this field. For example, &quot;clientip:&lt;ip address of
    * client&gt;&quot; or &quot;project:&lt;Google developer project
    * id&gt;&quot;.
    */
  var subject: js.UndefOr[String] = js.native
}

object SchemaQuotaError {
  @scala.inline
  def apply(): SchemaQuotaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaError]
  }
  @scala.inline
  implicit class SchemaQuotaErrorOps[Self <: SchemaQuotaError] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

