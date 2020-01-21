package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable extends js.Object {
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testCommandEnvironmentVariable]
  }
}

