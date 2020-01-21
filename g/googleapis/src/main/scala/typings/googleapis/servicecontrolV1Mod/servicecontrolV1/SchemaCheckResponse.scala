package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the Check method.
  */
@js.native
trait SchemaCheckResponse extends js.Object {
  /**
    * Indicate the decision of the check.  If no check errors are present, the
    * service should process the operation. Otherwise the service should use
    * the list of errors to determine the appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[SchemaCheckError]] = js.native
  /**
    * Feedback data returned from the server during processing a Check request.
    */
  var checkInfo: js.UndefOr[SchemaCheckInfo] = js.native
  /**
    * The same operation_id value used in the CheckRequest. Used for logging
    * and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota information for the check request associated with this response.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaCheckResponse {
  @scala.inline
  def apply(
    checkErrors: js.Array[SchemaCheckError] = null,
    checkInfo: SchemaCheckInfo = null,
    operationId: String = null,
    quotaInfo: SchemaQuotaInfo = null,
    serviceConfigId: String = null
  ): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    if (checkErrors != null) __obj.updateDynamic("checkErrors")(checkErrors.asInstanceOf[js.Any])
    if (checkInfo != null) __obj.updateDynamic("checkInfo")(checkInfo.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckResponse]
  }
}

