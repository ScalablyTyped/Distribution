package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment variable required by this task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable extends js.Object {
  /**
    * The envvar name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The envvar value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  }
}

