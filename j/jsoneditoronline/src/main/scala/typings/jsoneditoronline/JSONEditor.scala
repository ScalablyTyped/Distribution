package typings.jsoneditoronline

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditor")
@js.native
class JSONEditor protected () extends js.Object {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: JSONEditorOptions) = this()
  def this(container: HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  var Events: AnonAction = js.native
  var History: JSONEditorHistory = js.native
  var Node: JSONEditorNode = js.native
  var SearchBox: JSONEditorSearchBox = js.native
  def clear(): Unit = js.native
  def collapseAll(): Unit = js.native
  def expandAll(): Unit = js.native
  def focus(): Unit = js.native
  def get(): js.Object = js.native
  def getName(): String = js.native
  def scrollTo(top: Double): Unit = js.native
  def search(text: String): js.Array[_] = js.native
  def set(json: js.Object): Unit = js.native
  def set(json: js.Object, name: String): Unit = js.native
  def setName(): Unit = js.native
  def setName(name: String): Unit = js.native
}

/* static members */
@JSGlobal("JSONEditor")
@js.native
object JSONEditor extends js.Object {
  var focusNode: JSONEditorNode = js.native
  var freezeHighlight: Boolean = js.native
  def addClassName(elem: HTMLElement, className: String): Unit = js.native
  def getAbsoluteLeft(elem: HTMLElement): Double = js.native
  def getAbsoluteTop(elem: HTMLElement): Double = js.native
  def getInnerText(element: HTMLElement, buffer: JSONEditorBuffer): String = js.native
  def getInternetExplorerVersion(): Double = js.native
  def getNodeFromTarget(target: HTMLElement): JSONEditorNode = js.native
  def parse(jsonString: String): js.Object = js.native
  def removeClassName(elem: HTMLElement, className: String): Unit = js.native
  def setEndOfContentEditable(contentEditableElement: HTMLElement): Unit = js.native
  def stripFormatting(divElement: HTMLElement): Unit = js.native
  def validate(jsonString: String): String = js.native
}

