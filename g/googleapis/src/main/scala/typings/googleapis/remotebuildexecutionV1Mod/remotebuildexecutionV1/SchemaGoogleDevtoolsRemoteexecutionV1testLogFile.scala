package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `LogFile` is a log stored in the CAS.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testLogFile extends js.Object {
  /**
    * The digest of the log contents.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * This is a hint as to the purpose of the log, and is set to true if the
    * log is human-readable text that can be usefully displayed to a user, and
    * false otherwise. For instance, if a command-line client wishes to print
    * the server logs to the terminal for a failed action, this allows it to
    * avoid displaying a binary file.
    */
  var humanReadable: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testLogFile {
  @scala.inline
  def apply(
    digest: SchemaGoogleDevtoolsRemoteexecutionV1testDigest = null,
    humanReadable: js.UndefOr[Boolean] = js.undefined
  ): SchemaGoogleDevtoolsRemoteexecutionV1testLogFile = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (!js.isUndefined(humanReadable)) __obj.updateDynamic("humanReadable")(humanReadable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile]
  }
}

