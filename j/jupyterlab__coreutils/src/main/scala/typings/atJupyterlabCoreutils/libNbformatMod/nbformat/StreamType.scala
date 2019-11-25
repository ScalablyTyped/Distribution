package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alias for a stream type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stdout
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stderr
*/
trait StreamType extends js.Object

object StreamType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def stderr: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stderr = this.cast("stderr")
  @scala.inline
  def stdout: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stdout = this.cast("stdout")
}

