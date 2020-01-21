package typings.jsoneditoronline

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorNode")
@js.native
class JSONEditorNode protected () extends js.Object {
  def this(editor: JSONEditor, params: JSONEditorConstructorParams) = this()
  var types: js.Array[JSONEditorNodeType] = js.native
  def appendChild(node: JSONEditorNode): Unit = js.native
  def blur(): Unit = js.native
  def changeType(newType: String): Unit = js.native
  def clearDom(): Unit = js.native
  def collapse(recurse: Boolean): Unit = js.native
  def containsNode(node: JSONEditorNode): Boolean = js.native
  def expand(recurse: Boolean): Unit = js.native
  def focus(): Unit = js.native
  def getAppend(): HTMLElement = js.native
  def getDom(): HTMLElement = js.native
  def getField(): String = js.native
  def getLevel(): Double = js.native
  def getParent(): JSONEditorNode = js.native
  def getValue(): js.Any = js.native
  def hide(): Unit = js.native
  def hideChilds(): Unit = js.native
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit = js.native
  def moveTo(node: JSONEditorNode, index: Double): Unit = js.native
  def onEvent(event: Event_): Unit = js.native
  def removeChild(node: JSONEditorNode): JSONEditorNode = js.native
  def scrollTo(): Unit = js.native
  def search(text: String): js.Array[JSONEditorNode] = js.native
  def setField(field: String, fieldEditable: Boolean): Unit = js.native
  def setHighlight(highlight: Boolean): Unit = js.native
  def setParent(parent: JSONEditorNode): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
  def showChilds(): Unit = js.native
  def updateDom(): Unit = js.native
  def updateField(field: String): Unit = js.native
  def updateValue(value: js.Any): Unit = js.native
}

