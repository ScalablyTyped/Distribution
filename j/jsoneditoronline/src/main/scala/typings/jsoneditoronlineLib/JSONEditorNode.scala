package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditorNode")
@js.native
class JSONEditorNode protected () extends js.Object {
  def this(editor: JSONEditor, params: JSONEditorConstructorParams) = this()
  var types: js.Array[JSONEditorNodeType] = js.native
  def appendChild(node: JSONEditorNode): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def changeType(newType: java.lang.String): scala.Unit = js.native
  def clearDom(): scala.Unit = js.native
  def collapse(recurse: scala.Boolean): scala.Unit = js.native
  def containsNode(node: JSONEditorNode): scala.Boolean = js.native
  def expand(recurse: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getAppend(): stdLib.HTMLElement = js.native
  def getDom(): stdLib.HTMLElement = js.native
  def getField(): java.lang.String = js.native
  def getLevel(): scala.Double = js.native
  def getParent(): JSONEditorNode = js.native
  def getValue(): js.Any = js.native
  def hide(): scala.Unit = js.native
  def hideChilds(): scala.Unit = js.native
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): scala.Unit = js.native
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): scala.Unit = js.native
  def moveTo(node: JSONEditorNode, index: scala.Double): scala.Unit = js.native
  def onEvent(event: stdLib.Event): scala.Unit = js.native
  def removeChild(node: JSONEditorNode): JSONEditorNode = js.native
  def scrollTo(): scala.Unit = js.native
  def search(text: java.lang.String): js.Array[JSONEditorNode] = js.native
  def setField(field: java.lang.String, fieldEditable: scala.Boolean): scala.Unit = js.native
  def setHighlight(highlight: scala.Boolean): scala.Unit = js.native
  def setParent(parent: JSONEditorNode): scala.Unit = js.native
  def setValue(value: js.Any): scala.Unit = js.native
  def showChilds(): scala.Unit = js.native
  def updateDom(): scala.Unit = js.native
  def updateField(field: java.lang.String): scala.Unit = js.native
  def updateValue(value: js.Any): scala.Unit = js.native
}

