package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorHistory")
@js.native
class JSONEditorHistory protected () extends js.Object {
  def this(editor: JSONEditor) = this()
  def add(action: String, params: js.Object): Unit = js.native
  def canRedo(): Boolean = js.native
  def canUndo(): Boolean = js.native
  def clear(): Unit = js.native
  def onChange(): Unit = js.native
  def redo(): Unit = js.native
  def undo(): Unit = js.native
}

