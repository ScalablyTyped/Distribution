package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the error status for payloads that were not written.
  */
@js.native
trait SchemaCollectdPayloadError extends js.Object {
  /**
    * Records the error status for the payload. If this field is present, the
    * partial errors for nested values won&#39;t be populated.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * The zero-based index in
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Records the error status for values that were not written due to an
    * error.Failed payloads for which nothing is written will not include
    * partial value errors.
    */
  var valueErrors: js.UndefOr[js.Array[SchemaCollectdValueError]] = js.native
}

object SchemaCollectdPayloadError {
  @scala.inline
  def apply(
    error: SchemaStatus = null,
    index: Int | Double = null,
    valueErrors: js.Array[SchemaCollectdValueError] = null
  ): SchemaCollectdPayloadError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (valueErrors != null) __obj.updateDynamic("valueErrors")(valueErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCollectdPayloadError]
  }
}

