package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorHistory extends js.Object {
  def add(action: String, params: js.Object): Unit
  def canRedo(): Boolean
  def canUndo(): Boolean
  def clear(): Unit
  def onChange(): Unit
  def redo(): Unit
  def undo(): Unit
}

object JSONEditorHistory {
  @scala.inline
  def apply(
    add: (String, js.Object) => Unit,
    canRedo: () => Boolean,
    canUndo: () => Boolean,
    clear: () => Unit,
    onChange: () => Unit,
    redo: () => Unit,
    undo: () => Unit
  ): JSONEditorHistory = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), canRedo = js.Any.fromFunction0(canRedo), canUndo = js.Any.fromFunction0(canUndo), clear = js.Any.fromFunction0(clear), onChange = js.Any.fromFunction0(onChange), redo = js.Any.fromFunction0(redo), undo = js.Any.fromFunction0(undo))
    __obj.asInstanceOf[JSONEditorHistory]
  }
}

