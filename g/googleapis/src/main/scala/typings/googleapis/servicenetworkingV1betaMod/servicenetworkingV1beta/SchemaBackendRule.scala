package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A backend rule provides configuration for an individual API element.
  */
@js.native
trait SchemaBackendRule extends js.Object {
  /**
    * The address of the API backend.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for a response from a request.  The default
    * deadline for gRPC is infinite (no deadline) and HTTP requests is 5
    * seconds.
    */
  var deadline: js.UndefOr[Double] = js.native
  /**
    * The JWT audience is used when generating a JWT id token for the backend.
    */
  var jwtAudience: js.UndefOr[String] = js.native
  /**
    * Minimum deadline in seconds needed for this method. Calls having deadline
    * value lower than this will be rejected.
    */
  var minDeadline: js.UndefOr[Double] = js.native
  /**
    * The number of seconds to wait for the completion of a long running
    * operation. The default is no deadline.
    */
  var operationDeadline: js.UndefOr[Double] = js.native
  var pathTranslation: js.UndefOr[String] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaBackendRule {
  @scala.inline
  def apply(
    address: String = null,
    deadline: js.UndefOr[Double] = js.undefined,
    jwtAudience: String = null,
    minDeadline: js.UndefOr[Double] = js.undefined,
    operationDeadline: js.UndefOr[Double] = js.undefined,
    pathTranslation: String = null,
    selector: String = null
  ): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(deadline)) __obj.updateDynamic("deadline")(deadline.get.asInstanceOf[js.Any])
    if (jwtAudience != null) __obj.updateDynamic("jwtAudience")(jwtAudience.asInstanceOf[js.Any])
    if (!js.isUndefined(minDeadline)) __obj.updateDynamic("minDeadline")(minDeadline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(operationDeadline)) __obj.updateDynamic("operationDeadline")(operationDeadline.get.asInstanceOf[js.Any])
    if (pathTranslation != null) __obj.updateDynamic("pathTranslation")(pathTranslation.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendRule]
  }
}

