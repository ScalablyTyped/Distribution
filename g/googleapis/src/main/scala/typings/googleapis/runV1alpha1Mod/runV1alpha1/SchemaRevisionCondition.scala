package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RevisionCondition defines a readiness condition for a Revision.
  */
@js.native
trait SchemaRevisionCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    * +optional
    */
  var lastTransitionTime: js.UndefOr[String] = js.native
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  /**
    * One-word CamelCase reason for the condition&#39;s last transition.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * RevisionConditionType is used to communicate the status of the
    * reconciliation process. See also:
    * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types include:  * &quot;Ready&quot;: True when the Revision is ready. *
    * &quot;ResourcesAvailable&quot;: True when underlying resources have been
    * provisioned. * &quot;ContainerHealthy&quot;: True when the Revision
    * readiness check completes. * &quot;Active&quot;: True when the Revision
    * may receive traffic.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRevisionCondition {
  @scala.inline
  def apply(
    lastTransitionTime: String = null,
    message: String = null,
    reason: String = null,
    status: String = null,
    `type`: String = null
  ): SchemaRevisionCondition = {
    val __obj = js.Dynamic.literal()
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevisionCondition]
  }
}

