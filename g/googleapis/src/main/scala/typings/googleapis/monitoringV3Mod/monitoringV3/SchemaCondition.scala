package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition is a true/false test that determines when an alerting policy
  * should open an incident. If a condition evaluates to true, it signifies
  * that something is wrong.
  */
@js.native
trait SchemaCondition extends js.Object {
  /**
    * A condition that checks that a time series continues to receive new data
    * points.
    */
  var conditionAbsent: js.UndefOr[SchemaMetricAbsence] = js.native
  /**
    * A condition that compares a time series against a threshold.
    */
  var conditionThreshold: js.UndefOr[SchemaMetricThreshold] = js.native
  /**
    * A short name or phrase used to identify the condition in dashboards,
    * notifications, and incidents. To avoid confusion, don&#39;t use the same
    * display name for multiple conditions in the same policy.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required if the condition exists. The unique resource name for this
    * condition. Its syntax is:
    * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
    * [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition
    * is created as part of a new or updated alerting policy.When calling the
    * alertPolicies.create method, do not include the name field in the
    * conditions of the requested alerting policy. Stackdriver Monitoring
    * creates the condition identifiers and includes them in the new
    * policy.When calling the alertPolicies.update method to update a policy,
    * including a condition name causes the existing condition to be updated.
    * Conditions without names are added to the updated policy. Existing
    * conditions are deleted if they are not updated.Best practice is to
    * preserve [CONDITION_ID] if you make only small changes, such as those to
    * condition thresholds, durations, or trigger values. Otherwise, treat the
    * change as a new condition and let the existing condition be deleted.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCondition {
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  @scala.inline
  implicit class SchemaConditionOps[Self <: SchemaCondition] (val x: Self) extends AnyVal {
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
    def setConditionAbsent(value: SchemaMetricAbsence): Self = this.set("conditionAbsent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionAbsent: Self = this.set("conditionAbsent", js.undefined)
    @scala.inline
    def setConditionThreshold(value: SchemaMetricThreshold): Self = this.set("conditionThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionThreshold: Self = this.set("conditionThreshold", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

