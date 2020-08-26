package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorHistory extends js.Object {
  def add(action: String, params: js.Object): Unit = js.native
  def canRedo(): Boolean = js.native
  def canUndo(): Boolean = js.native
  def clear(): Unit = js.native
  def onChange(): Unit = js.native
  def redo(): Unit = js.native
  def undo(): Unit = js.native
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
  @scala.inline
  implicit class JSONEditorHistoryOps[Self <: JSONEditorHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (String, js.Object) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setCanRedo(value: () => Boolean): Self = this.set("canRedo", js.Any.fromFunction0(value))
    @scala.inline
    def setCanUndo(value: () => Boolean): Self = this.set("canUndo", js.Any.fromFunction0(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setRedo(value: () => Unit): Self = this.set("redo", js.Any.fromFunction0(value))
    @scala.inline
    def setUndo(value: () => Unit): Self = this.set("undo", js.Any.fromFunction0(value))
  }
  
}

