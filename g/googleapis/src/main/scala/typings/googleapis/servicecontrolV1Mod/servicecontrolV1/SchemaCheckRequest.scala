package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the Check method.
  */
@js.native
trait SchemaCheckRequest extends js.Object {
  /**
    * The operation to be checked.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * Requests the project settings to be returned as part of the check
    * response.
    */
  var requestProjectSettings: js.UndefOr[Boolean] = js.native
  /**
    * Specifies which version of service configuration should be used to
    * process the request.  If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    * WARNING: Setting this flag to &quot;true&quot; will disable quota
    * enforcement.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.native
}

object SchemaCheckRequest {
  @scala.inline
  def apply(): SchemaCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckRequest]
  }
  @scala.inline
  implicit class SchemaCheckRequestOps[Self <: SchemaCheckRequest] (val x: Self) extends AnyVal {
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
    def setOperation(value: SchemaOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setRequestProjectSettings(value: Boolean): Self = this.set("requestProjectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestProjectSettings: Self = this.set("requestProjectSettings", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
    @scala.inline
    def setSkipActivationCheck(value: Boolean): Self = this.set("skipActivationCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipActivationCheck: Self = this.set("skipActivationCheck", js.undefined)
  }
  
}

