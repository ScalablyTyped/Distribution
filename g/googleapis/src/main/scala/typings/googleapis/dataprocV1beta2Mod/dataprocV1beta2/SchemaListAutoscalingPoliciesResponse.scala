package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a request to list autoscaling policies in a project.
  */
@js.native
trait SchemaListAutoscalingPoliciesResponse extends js.Object {
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. Autoscaling policies list.
    */
  var policies: js.UndefOr[js.Array[SchemaAutoscalingPolicy]] = js.native
}

object SchemaListAutoscalingPoliciesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, policies: js.Array[SchemaAutoscalingPolicy] = null): SchemaListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAutoscalingPoliciesResponse]
  }
}

