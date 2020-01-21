package typings.jupyterlabNotebook.widgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNotebook.jupyterlabNotebookStrings.command
  - typings.jupyterlabNotebook.jupyterlabNotebookStrings.edit
*/
trait NotebookMode extends js.Object

object NotebookMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typings.jupyterlabNotebook.jupyterlabNotebookStrings.command = this.cast("command")
  @scala.inline
  def edit: typings.jupyterlabNotebook.jupyterlabNotebookStrings.edit = this.cast("edit")
}

