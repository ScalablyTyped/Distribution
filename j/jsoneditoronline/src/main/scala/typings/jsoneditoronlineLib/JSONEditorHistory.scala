package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorHistory")
@js.native
class JSONEditorHistory protected () extends js.Object {
  def this(editor: JSONEditor) = this()
  def add(action: java.lang.String, params: js.Object): scala.Unit = js.native
  def canRedo(): scala.Boolean = js.native
  def canUndo(): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def onChange(): scala.Unit = js.native
  def redo(): scala.Unit = js.native
  def undo(): scala.Unit = js.native
}

