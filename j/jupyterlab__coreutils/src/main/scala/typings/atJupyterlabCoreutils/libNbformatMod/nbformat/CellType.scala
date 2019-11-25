package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type which describes the type of cell.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.code
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.markdown
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.code = this.cast("code")
  @scala.inline
  def markdown: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.raw = this.cast("raw")
}

