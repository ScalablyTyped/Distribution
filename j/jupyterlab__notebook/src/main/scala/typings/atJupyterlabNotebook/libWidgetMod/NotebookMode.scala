package typings.atJupyterlabNotebook.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabNotebook.atJupyterlabNotebookStrings.command
  - typings.atJupyterlabNotebook.atJupyterlabNotebookStrings.edit
*/
trait NotebookMode extends js.Object

object NotebookMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typings.atJupyterlabNotebook.atJupyterlabNotebookStrings.command = this.cast("command")
  @scala.inline
  def edit: typings.atJupyterlabNotebook.atJupyterlabNotebookStrings.edit = this.cast("edit")
}

