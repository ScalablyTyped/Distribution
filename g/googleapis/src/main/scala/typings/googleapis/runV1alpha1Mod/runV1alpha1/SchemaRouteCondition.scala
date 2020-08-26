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
  def apply(): SchemaRouteCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteCondition]
  }
  @scala.inline
  implicit class SchemaRouteConditionOps[Self <: SchemaRouteCondition] (val x: Self) extends AnyVal {
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastTransitionTime: Self = this.set("lastTransitionTime", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

