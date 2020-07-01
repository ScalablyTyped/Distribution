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
  def apply(
    operation: SchemaOperation = null,
    requestProjectSettings: js.UndefOr[Boolean] = js.undefined,
    serviceConfigId: String = null,
    skipActivationCheck: js.UndefOr[Boolean] = js.undefined
  ): SchemaCheckRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (!js.isUndefined(requestProjectSettings)) __obj.updateDynamic("requestProjectSettings")(requestProjectSettings.get.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    if (!js.isUndefined(skipActivationCheck)) __obj.updateDynamic("skipActivationCheck")(skipActivationCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckRequest]
  }
}

