package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable extends js.Object {
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable]
  }
}

