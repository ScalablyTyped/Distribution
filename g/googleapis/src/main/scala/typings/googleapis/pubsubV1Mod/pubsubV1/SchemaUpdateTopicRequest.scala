package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateTopic method.
  */
@js.native
trait SchemaUpdateTopicRequest extends js.Object {
  /**
    * The updated topic object.
    */
  var topic: js.UndefOr[SchemaTopic] = js.native
  /**
    * Indicates which fields in the provided topic to update. Must be specified
    * and non-empty. Note that if `update_mask` contains
    * &quot;message_storage_policy&quot; then the new value will be determined
    * based on the policy configured at the project or organization level. The
    * `message_storage_policy` must not be set in the `topic` provided above.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateTopicRequest {
  @scala.inline
  def apply(topic: SchemaTopic = null, updateMask: String = null): SchemaUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateTopicRequest]
  }
}

