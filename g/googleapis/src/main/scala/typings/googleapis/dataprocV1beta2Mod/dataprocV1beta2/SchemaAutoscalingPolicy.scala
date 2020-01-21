package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an autoscaling policy for Dataproc cluster autoscaler.
  */
@js.native
trait SchemaAutoscalingPolicy extends js.Object {
  var basicAlgorithm: js.UndefOr[SchemaBasicAutoscalingAlgorithm] = js.native
  /**
    * Required. The policy id.The id must contain only letters (a-z, A-Z),
    * numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the policy, as described in
    * https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Describes how the autoscaler will operate for secondary
    * workers.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.native
  /**
    * Required. Describes how the autoscaler will operate for primary workers.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.native
}

object SchemaAutoscalingPolicy {
  @scala.inline
  def apply(
    basicAlgorithm: SchemaBasicAutoscalingAlgorithm = null,
    id: String = null,
    name: String = null,
    secondaryWorkerConfig: SchemaInstanceGroupAutoscalingPolicyConfig = null,
    workerConfig: SchemaInstanceGroupAutoscalingPolicyConfig = null
  ): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (basicAlgorithm != null) __obj.updateDynamic("basicAlgorithm")(basicAlgorithm.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (secondaryWorkerConfig != null) __obj.updateDynamic("secondaryWorkerConfig")(secondaryWorkerConfig.asInstanceOf[js.Any])
    if (workerConfig != null) __obj.updateDynamic("workerConfig")(workerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
}

