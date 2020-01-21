package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a shell-style task to execute, suitable for providing as the Bots
  * interface&#39;s `Lease.payload` field.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask extends js.Object {
  /**
    * The expected outputs from the task.
    */
  var expectedOutputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] = js.native
  /**
    * The inputs to the task.
    */
  var inputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] = js.native
  /**
    * The timeouts of this task.
    */
  var timeouts: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask {
  @scala.inline
  def apply(
    expectedOutputs: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = null,
    inputs: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputs = null,
    timeouts: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    if (expectedOutputs != null) __obj.updateDynamic("expectedOutputs")(expectedOutputs.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (timeouts != null) __obj.updateDynamic("timeouts")(timeouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
}

