package typings.jupyterlabNbformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.stdout
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typings.jupyterlabNbformat.jupyterlabNbformatStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typings.jupyterlabNbformat.jupyterlabNbformatStrings.stdout = this.cast("stdout")
}

