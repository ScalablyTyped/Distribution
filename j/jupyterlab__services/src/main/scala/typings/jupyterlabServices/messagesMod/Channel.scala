package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.shell
  - typings.jupyterlabServices.jupyterlabServicesStrings.control
  - typings.jupyterlabServices.jupyterlabServicesStrings.iopub
  - typings.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control: typings.jupyterlabServices.jupyterlabServicesStrings.control = this.cast("control")
  @scala.inline
  def iopub: typings.jupyterlabServices.jupyterlabServicesStrings.iopub = this.cast("iopub")
  @scala.inline
  def shell: typings.jupyterlabServices.jupyterlabServicesStrings.shell = this.cast("shell")
  @scala.inline
  def stdin: typings.jupyterlabServices.jupyterlabServicesStrings.stdin = this.cast("stdin")
}

