package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pull message contains data that can be used by the caller of LeaseTasks
  * to process the task.  This proto can only be used for tasks in a queue
  * which has pull_target set.
  */
@js.native
trait SchemaPullMessage extends js.Object {
  /**
    * A data payload consumed by the worker to execute the task.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * The task&#39;s tag.  Tags allow similar tasks to be processed in a batch.
    * If you label tasks with a tag, your worker can lease tasks with the same
    * tag using filter. For example, if you want to aggregate the events
    * associated with a specific user once a day, you could tag tasks with the
    * user ID.  The task&#39;s tag can only be set when the task is created.
    * The tag must be less than 500 characters.  SDK compatibility: Although
    * the SDK allows tags to be either string or
    * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
    * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn&#39;t
    * UTF-8 encoded, the tag will be empty when the task is returned by Cloud
    * Tasks.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaPullMessage {
  @scala.inline
  def apply(): SchemaPullMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullMessage]
  }
  @scala.inline
  implicit class SchemaPullMessageOps[Self <: SchemaPullMessage] (val x: Self) extends AnyVal {
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

