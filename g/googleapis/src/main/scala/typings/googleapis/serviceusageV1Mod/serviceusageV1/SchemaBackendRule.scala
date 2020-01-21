package typings.googleapis.serviceusageV1Mod.serviceusageV1

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
    deadline: Int | Double = null,
    jwtAudience: String = null,
    minDeadline: Int | Double = null,
    operationDeadline: Int | Double = null,
    pathTranslation: String = null,
    selector: String = null
  ): SchemaBackendRule = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (jwtAudience != null) __obj.updateDynamic("jwtAudience")(jwtAudience.asInstanceOf[js.Any])
    if (minDeadline != null) __obj.updateDynamic("minDeadline")(minDeadline.asInstanceOf[js.Any])
    if (operationDeadline != null) __obj.updateDynamic("operationDeadline")(operationDeadline.asInstanceOf[js.Any])
    if (pathTranslation != null) __obj.updateDynamic("pathTranslation")(pathTranslation.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendRule]
  }
}

