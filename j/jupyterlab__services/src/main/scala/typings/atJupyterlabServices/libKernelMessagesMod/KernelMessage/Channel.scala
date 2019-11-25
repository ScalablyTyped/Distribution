package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Jupyter channel names in a message to a frontend.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.control
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control: typings.atJupyterlabServices.atJupyterlabServicesStrings.control = this.cast("control")
  @scala.inline
  def iopub: typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typings.atJupyterlabServices.atJupyterlabServicesStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin = this.cast("stdin")
}

