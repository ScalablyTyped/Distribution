package typings.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias for a stream type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stdout
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stdout = this.cast("stdout")
}

