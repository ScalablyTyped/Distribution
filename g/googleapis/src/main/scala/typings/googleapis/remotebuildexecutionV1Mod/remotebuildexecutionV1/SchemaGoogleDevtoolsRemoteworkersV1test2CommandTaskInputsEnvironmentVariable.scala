package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

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
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariableOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

