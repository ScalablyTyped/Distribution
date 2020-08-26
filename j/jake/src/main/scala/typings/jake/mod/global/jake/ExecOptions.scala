package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////////////////////
// Running shell-commands ////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
@js.native
trait ExecOptions extends js.Object {
  /**
    * stop execution on error, default true
    */
  var breakOnError: js.UndefOr[Boolean] = js.native
  /**
    * print to stderr, default false
    */
  var printStderr: js.UndefOr[Boolean] = js.native
  /**
    * print to stdout, default false
    */
  var printStdout: js.UndefOr[Boolean] = js.native
  /**
    *
    */
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
}

object ExecOptions {
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  @scala.inline
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
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
    def setBreakOnError(value: Boolean): Self = this.set("breakOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakOnError: Self = this.set("breakOnError", js.undefined)
    @scala.inline
    def setPrintStderr(value: Boolean): Self = this.set("printStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintStderr: Self = this.set("printStderr", js.undefined)
    @scala.inline
    def setPrintStdout(value: Boolean): Self = this.set("printStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintStdout: Self = this.set("printStdout", js.undefined)
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
  
}

