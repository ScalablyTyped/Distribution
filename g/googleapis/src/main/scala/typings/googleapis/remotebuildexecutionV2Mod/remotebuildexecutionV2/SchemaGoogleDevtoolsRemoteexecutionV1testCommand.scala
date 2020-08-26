package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Command` is the actual command executed by a worker running an Action.
  * Except as otherwise required, the environment (such as which system
  * libraries or binaries are available, and what filesystems are mounted
  * where) is defined by and specific to the implementation of the remote
  * execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testCommand extends js.Object {
  /**
    * The arguments to the command. The first argument must be the path to the
    * executable, which must be either a relative path, in which case it is
    * evaluated with respect to the input root, or an absolute path.  The
    * working directory will always be the input root.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  /**
    * The environment variables to set when running the program. The worker may
    * provide its own default environment variables; these defaults can be
    * overridden using this field. Additional variables can also be specified.
    * In order to ensure that equivalent `Command`s always hash to the same
    * value, the environment variables MUST be lexicographically sorted by
    * name. Sorting of strings is done by code point, equivalently, by the
    * UTF-8 bytes.
    */
  var environmentVariables: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testCommand {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testCommand]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testCommandOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testCommand] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setEnvironmentVariablesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    @scala.inline
    def setEnvironmentVariables(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
  }
  
}

