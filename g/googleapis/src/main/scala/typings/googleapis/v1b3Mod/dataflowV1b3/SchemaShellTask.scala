package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which consists of a shell command for the worker to execute.
  */
@js.native
trait SchemaShellTask extends js.Object {
  /**
    * The shell command to run.
    */
  var command: js.UndefOr[String] = js.native
  /**
    * Exit code for the task.
    */
  var exitCode: js.UndefOr[Double] = js.native
}

object SchemaShellTask {
  @scala.inline
  def apply(): SchemaShellTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShellTask]
  }
  @scala.inline
  implicit class SchemaShellTaskOps[Self <: SchemaShellTask] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
  }
  
}

