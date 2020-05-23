package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionWrapper extends js.Object {
  def execCommand(name: js.Object, args: js.Object): Unit
  def focus(): Unit
  def getSelectedItem(): Unit
  def getSelectionAsText(): Unit
  def insertElement(element: js.Object): Unit
  def insertTable(table: js.Object): Unit
  def replaceNode(newNode: js.Object): Unit
  def select(element: js.Object): Unit
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
}

