package typings
package atJupyterlabNotebookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabNotebookLibStrings {
  @js.native
  sealed trait above extends js.Object
  
  @js.native
  sealed trait below extends js.Object
  
  @js.native
  sealed trait command
    extends atJupyterlabNotebookLib.libWidgetMod.NotebookMode
  
  @js.native
  sealed trait edit
    extends atJupyterlabNotebookLib.libWidgetMod.NotebookMode
  
  @js.native
  sealed trait replace extends js.Object
  
  @scala.inline
  def above: above = "above".asInstanceOf[above]
  @scala.inline
  def below: below = "below".asInstanceOf[below]
  @scala.inline
  def command: command = "command".asInstanceOf[command]
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

