package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionWrapper extends js.Object {
  
  def execCommand(name: js.Object, args: js.Object): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getSelectedItem(): Unit = js.native
  
  def getSelectionAsText(): Unit = js.native
  
  def insertElement(element: js.Object): Unit = js.native
  
  def insertTable(table: js.Object): Unit = js.native
  
  def replaceNode(newNode: js.Object): Unit = js.native
  
  def select(element: js.Object): Unit = js.native
}
object SelectionWrapper {
  
  @scala.inline
  def apply(
    execCommand: (js.Object, js.Object) => Unit,
    focus: () => Unit,
    getSelectedItem: () => Unit,
    getSelectionAsText: () => Unit,
    insertElement: js.Object => Unit,
    insertTable: js.Object => Unit,
    replaceNode: js.Object => Unit,
    select: js.Object => Unit
  ): SelectionWrapper = {
    val __obj = js.Dynamic.literal(execCommand = js.Any.fromFunction2(execCommand), focus = js.Any.fromFunction0(focus), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectionAsText = js.Any.fromFunction0(getSelectionAsText), insertElement = js.Any.fromFunction1(insertElement), insertTable = js.Any.fromFunction1(insertTable), replaceNode = js.Any.fromFunction1(replaceNode), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[SelectionWrapper]
  }
  
  @scala.inline
  implicit class SelectionWrapperOps[Self <: SelectionWrapper] (val x: Self) extends AnyVal {
    
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
    def setExecCommand(value: (js.Object, js.Object) => Unit): Self = this.set("execCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItem(value: () => Unit): Self = this.set("getSelectedItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionAsText(value: () => Unit): Self = this.set("getSelectionAsText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertElement(value: js.Object => Unit): Self = this.set("insertElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertTable(value: js.Object => Unit): Self = this.set("insertTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceNode(value: js.Object => Unit): Self = this.set("replaceNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: js.Object => Unit): Self = this.set("select", js.Any.fromFunction1(value))
  }
}
