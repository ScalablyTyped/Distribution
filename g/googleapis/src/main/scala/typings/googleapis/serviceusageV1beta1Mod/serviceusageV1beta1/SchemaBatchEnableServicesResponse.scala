package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `BatchEnableServices` method. This response
  * message is assigned to the `response` field of the returned Operation when
  * that operation is done.
  */
@js.native
trait SchemaBatchEnableServicesResponse extends js.Object {
  /**
    * If allow_partial_success is true, and one or more services could not be
    * enabled, this field contains the details about each failure.
    */
  var failures: js.UndefOr[js.Array[SchemaEnableFailure]] = js.native
  /**
    * The new state of the services after enabling.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleApiServiceusageV1Service]] = js.native
}

object SchemaBatchEnableServicesResponse {
  @scala.inline
  def apply(
    failures: js.Array[SchemaEnableFailure] = null,
    services: js.Array[SchemaGoogleApiServiceusageV1Service] = null
  ): SchemaBatchEnableServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchEnableServicesResponse]
  }
}

