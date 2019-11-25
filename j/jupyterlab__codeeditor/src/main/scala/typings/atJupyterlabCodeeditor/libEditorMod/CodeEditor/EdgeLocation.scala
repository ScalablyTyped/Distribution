package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The location of requested edges.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.top
  - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.topLine
  - typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bottom
*/
trait EdgeLocation extends js.Object

object EdgeLocation {
  @scala.inline
  def bottom: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def top: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.top = this.cast("top")
  @scala.inline
  def topLine: typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorStrings.topLine = this.cast("topLine")
}

