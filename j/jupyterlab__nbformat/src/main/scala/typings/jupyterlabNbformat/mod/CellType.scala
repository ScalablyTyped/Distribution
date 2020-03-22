package typings.jupyterlabNbformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.jupyterlabNbformat.jupyterlabNbformatStrings.code = this.cast("code")
  @scala.inline
  def markdown: typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown = this.cast("markdown")
  @scala.inline
  def raw: typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw = this.cast("raw")
}

