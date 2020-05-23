package typings.jsoneditoronline

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorNode extends js.Object {
  var types: js.Array[JSONEditorNodeType]
  def appendChild(node: JSONEditorNode): Unit
  def blur(): Unit
  def changeType(newType: String): Unit
  def clearDom(): Unit
  def collapse(recurse: Boolean): Unit
  def containsNode(node: JSONEditorNode): Boolean
  def expand(recurse: Boolean): Unit
  def focus(): Unit
  def getAppend(): HTMLElement
  def getDom(): HTMLElement
  def getField(): String
  def getLevel(): Double
  def getParent(): JSONEditorNode
  def getValue(): js.Any
  def hide(): Unit
  def hideChilds(): Unit
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  def moveTo(node: JSONEditorNode, index: Double): Unit
  def onEvent(event: Event): Unit
  def removeChild(node: JSONEditorNode): JSONEditorNode
  def scrollTo(): Unit
  def search(text: String): js.Array[JSONEditorNode]
  def setField(field: String, fieldEditable: Boolean): Unit
  def setHighlight(highlight: Boolean): Unit
  def setParent(parent: JSONEditorNode): Unit
  def setValue(value: js.Any): Unit
  def showChilds(): Unit
  def updateDom(): Unit
  def updateField(field: String): Unit
  def updateValue(value: js.Any): Unit
}

object JSONEditorNode {
  @scala.inline
  def apply(
    appendChild: JSONEditorNode => Unit,
    blur: () => Unit,
    changeType: String => Unit,
    clearDom: () => Unit,
    collapse: Boolean => Unit,
    containsNode: JSONEditorNode => Boolean,
    expand: Boolean => Unit,
    focus: () => Unit,
    getAppend: () => HTMLElement,
    getDom: () => HTMLElement,
    getField: () => String,
    getLevel: () => Double,
    getParent: () => JSONEditorNode,
    getValue: () => js.Any,
    hide: () => Unit,
    hideChilds: () => Unit,
    insertBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveBefore: (JSONEditorNode, JSONEditorNode) => Unit,
    moveTo: (JSONEditorNode, Double) => Unit,
    onEvent: Event => Unit,
    removeChild: JSONEditorNode => JSONEditorNode,
    scrollTo: () => Unit,
    search: String => js.Array[JSONEditorNode],
    setField: (String, Boolean) => Unit,
    setHighlight: Boolean => Unit,
    setParent: JSONEditorNode => Unit,
    setValue: js.Any => Unit,
    showChilds: () => Unit,
    types: js.Array[JSONEditorNodeType],
    updateDom: () => Unit,
    updateField: String => Unit,
    updateValue: js.Any => Unit
  ): JSONEditorNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), blur = js.Any.fromFunction0(blur), changeType = js.Any.fromFunction1(changeType), clearDom = js.Any.fromFunction0(clearDom), collapse = js.Any.fromFunction1(collapse), containsNode = js.Any.fromFunction1(containsNode), expand = js.Any.fromFunction1(expand), focus = js.Any.fromFunction0(focus), getAppend = js.Any.fromFunction0(getAppend), getDom = js.Any.fromFunction0(getDom), getField = js.Any.fromFunction0(getField), getLevel = js.Any.fromFunction0(getLevel), getParent = js.Any.fromFunction0(getParent), getValue = js.Any.fromFunction0(getValue), hide = js.Any.fromFunction0(hide), hideChilds = js.Any.fromFunction0(hideChilds), insertBefore = js.Any.fromFunction2(insertBefore), moveBefore = js.Any.fromFunction2(moveBefore), moveTo = js.Any.fromFunction2(moveTo), onEvent = js.Any.fromFunction1(onEvent), removeChild = js.Any.fromFunction1(removeChild), scrollTo = js.Any.fromFunction0(scrollTo), search = js.Any.fromFunction1(search), setField = js.Any.fromFunction2(setField), setHighlight = js.Any.fromFunction1(setHighlight), setParent = js.Any.fromFunction1(setParent), setValue = js.Any.fromFunction1(setValue), showChilds = js.Any.fromFunction0(showChilds), types = types.asInstanceOf[js.Any], updateDom = js.Any.fromFunction0(updateDom), updateField = js.Any.fromFunction1(updateField), updateValue = js.Any.fromFunction1(updateValue))
    __obj.asInstanceOf[JSONEditorNode]
  }
}

