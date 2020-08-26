package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecutedActionMetadata contains details about a completed execution.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata extends js.Object {
  /**
    * When the worker completed executing the action command.
    */
  var executionCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started executing the action command.
    */
  var executionStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished fetching action inputs.
    */
  var inputFetchCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started fetching action inputs.
    */
  var inputFetchStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker finished uploading action outputs.
    */
  var outputUploadCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker started uploading action outputs.
    */
  var outputUploadStartTimestamp: js.UndefOr[String] = js.native
  /**
    * When was the action added to the queue.
    */
  var queuedTimestamp: js.UndefOr[String] = js.native
  /**
    * The name of the worker which ran the execution.
    */
  var worker: js.UndefOr[String] = js.native
  /**
    * When the worker completed the action, including all stages.
    */
  var workerCompletedTimestamp: js.UndefOr[String] = js.native
  /**
    * When the worker received the action.
    */
  var workerStartTimestamp: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadataOps[Self <: SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata] (val x: Self) extends AnyVal {
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
    def setExecutionCompletedTimestamp(value: String): Self = this.set("executionCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionCompletedTimestamp: Self = this.set("executionCompletedTimestamp", js.undefined)
    @scala.inline
    def setExecutionStartTimestamp(value: String): Self = this.set("executionStartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStartTimestamp: Self = this.set("executionStartTimestamp", js.undefined)
    @scala.inline
    def setInputFetchCompletedTimestamp(value: String): Self = this.set("inputFetchCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFetchCompletedTimestamp: Self = this.set("inputFetchCompletedTimestamp", js.undefined)
    @scala.inline
    def setInputFetchStartTimestamp(value: String): Self = this.set("inputFetchStartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFetchStartTimestamp: Self = this.set("inputFetchStartTimestamp", js.undefined)
    @scala.inline
    def setOutputUploadCompletedTimestamp(value: String): Self = this.set("outputUploadCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUploadCompletedTimestamp: Self = this.set("outputUploadCompletedTimestamp", js.undefined)
    @scala.inline
    def setOutputUploadStartTimestamp(value: String): Self = this.set("outputUploadStartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUploadStartTimestamp: Self = this.set("outputUploadStartTimestamp", js.undefined)
    @scala.inline
    def setQueuedTimestamp(value: String): Self = this.set("queuedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueuedTimestamp: Self = this.set("queuedTimestamp", js.undefined)
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
    @scala.inline
    def setWorkerCompletedTimestamp(value: String): Self = this.set("workerCompletedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerCompletedTimestamp: Self = this.set("workerCompletedTimestamp", js.undefined)
    @scala.inline
    def setWorkerStartTimestamp(value: String): Self = this.set("workerStartTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerStartTimestamp: Self = this.set("workerStartTimestamp", js.undefined)
  }
  
}

