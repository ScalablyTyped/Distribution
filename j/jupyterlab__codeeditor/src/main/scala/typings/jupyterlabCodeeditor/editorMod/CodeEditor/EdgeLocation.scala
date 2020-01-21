package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of requested edges.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top
  - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine
  - typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom
*/
trait EdgeLocation extends js.Object

object EdgeLocation {
  @scala.inline
  def bottom: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.top = this.cast("top")
  @scala.inline
  def topLine: typings.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.topLine = this.cast("topLine")
}

