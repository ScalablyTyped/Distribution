package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exit code from a tool execution.
  */
@js.native
trait SchemaToolExitCode extends js.Object {
  /**
    * Tool execution exit code. A value of 0 means that the execution was
    * successful.  - In response: always set - In create/update request: always
    * set
    */
  var number: js.UndefOr[Double] = js.native
}

object SchemaToolExitCode {
  @scala.inline
  def apply(): SchemaToolExitCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExitCode]
  }
  @scala.inline
  implicit class SchemaToolExitCodeOps[Self <: SchemaToolExitCode] (val x: Self) extends AnyVal {
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
  
}

