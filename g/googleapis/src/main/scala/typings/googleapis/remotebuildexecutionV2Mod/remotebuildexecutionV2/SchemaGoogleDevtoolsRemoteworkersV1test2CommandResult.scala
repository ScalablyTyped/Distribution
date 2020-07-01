package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All information about the execution of a command, suitable for providing as
  * the Bots interface&#39;s `Lease.result` field.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult extends js.Object {
  /**
    * The elapsed time between calling Accept and Complete. The server will
    * also have its own idea of what this should be, but this excludes the
    * overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * The exit code of the process. An exit code of &quot;0&quot; should only
    * be trusted if `status` has a code of OK (otherwise it may simply be
    * unset).
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * Implementation-dependent metadata about the task. Both servers and bots
    * may define messages which can be encoded here; bots are free to provide
    * metadata in multiple formats, and servers are free to choose one or more
    * of the values to process and ignore others. In particular, it is *not*
    * considered an error for the bot to provide the server with a field that
    * it doesn&#39;t know about.
    */
  var metadata: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * The amount of time *not* spent executing the command (ie
    * uploading/downloading files).
    */
  var overhead: js.UndefOr[String] = js.native
  /**
    * An overall status for the command. For example, if the command timed out,
    * this might have a code of DEADLINE_EXCEEDED; if it was killed by the OS
    * for memory exhaustion, it might have a code of RESOURCE_EXHAUSTED.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult {
  @scala.inline
  def apply(
    duration: String = null,
    exitCode: js.UndefOr[Double] = js.undefined,
    metadata: js.Array[StringDictionary[_]] = null,
    outputs: SchemaGoogleDevtoolsRemoteworkersV1test2Digest = null,
    overhead: String = null,
    status: SchemaGoogleRpcStatus = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(exitCode)) __obj.updateDynamic("exitCode")(exitCode.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (overhead != null) __obj.updateDynamic("overhead")(overhead.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult]
  }
}

