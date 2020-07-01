package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - use CommandResult instead. Describes the actual outputs from
  * the task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs extends js.Object {
  /**
    * exit_code is only fully reliable if the status&#39; code is OK. If the
    * task exceeded its deadline or was cancelled, the process may still
    * produce an exit code as it is cancelled, and this will be populated, but
    * a successful (zero) is unlikely to be correct unless the status code is
    * OK.
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  @scala.inline
  def apply(
    exitCode: js.UndefOr[Double] = js.undefined,
    outputs: SchemaGoogleDevtoolsRemoteworkersV1test2Digest = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode.get.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
}

