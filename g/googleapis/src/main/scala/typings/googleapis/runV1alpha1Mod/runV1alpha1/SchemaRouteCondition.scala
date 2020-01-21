package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteCondition defines a readiness condition for a Route.
  */
@js.native
trait SchemaRouteCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    * +optional
    */
  var lastTransitionTime: js.UndefOr[String] = js.native
  /**
    * Human-readable message indicating details about last transition.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  /**
    * One-word CamelCase reason for the condition&#39;s last transition.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Status of the condition, one of &quot;True&quot;, &quot;False&quot;,
    * &quot;Unknown&quot;.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * RouteConditionType is used to communicate the status of the
    * reconciliation process. See also:
    * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types include: &quot;Ready&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRouteCondition {
  @scala.inline
  def apply(
    lastTransitionTime: String = null,
    message: String = null,
    reason: String = null,
    status: String = null,
    `type`: String = null
  ): SchemaRouteCondition = {
    val __obj = js.Dynamic.literal()
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouteCondition]
  }
}

