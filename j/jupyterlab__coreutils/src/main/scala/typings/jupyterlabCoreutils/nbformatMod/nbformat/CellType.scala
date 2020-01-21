package typings.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type which describes the type of cell.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown
  - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.code = this.cast("code")
  @scala.inline
  def markdown: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.raw = this.cast("raw")
}

