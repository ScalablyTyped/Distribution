package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JSONEditor")
@js.native
class JSONEditor protected () extends js.Object {
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, options: JSONEditorOptions) = this()
  def this(container: stdLib.HTMLElement, options: JSONEditorOptions, json: js.Any) = this()
  var Events: Anon_Action = js.native
  var History: JSONEditorHistory = js.native
  var Node: JSONEditorNode = js.native
  var SearchBox: JSONEditorSearchBox = js.native
  def clear(): scala.Unit = js.native
  def collapseAll(): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def get(): js.Object = js.native
  def getName(): java.lang.String = js.native
  def scrollTo(top: scala.Double): scala.Unit = js.native
  def search(text: java.lang.String): js.Array[_] = js.native
  def set(json: js.Object): scala.Unit = js.native
  def set(json: js.Object, name: java.lang.String): scala.Unit = js.native
  def setName(): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("JSONEditor")
@js.native
object JSONEditor extends js.Object {
  var focusNode: jsoneditoronlineLib.JSONEditorNode = js.native
  var freezeHighlight: scala.Boolean = js.native
  def addClassName(elem: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def getAbsoluteLeft(elem: stdLib.HTMLElement): scala.Double = js.native
  def getAbsoluteTop(elem: stdLib.HTMLElement): scala.Double = js.native
  def getInnerText(element: stdLib.HTMLElement, buffer: jsoneditoronlineLib.JSONEditorBuffer): java.lang.String = js.native
  def getInternetExplorerVersion(): scala.Double = js.native
  def getNodeFromTarget(target: stdLib.HTMLElement): jsoneditoronlineLib.JSONEditorNode = js.native
  def parse(jsonString: java.lang.String): js.Object = js.native
  def removeClassName(elem: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def setEndOfContentEditable(contentEditableElement: stdLib.HTMLElement): scala.Unit = js.native
  def stripFormatting(divElement: stdLib.HTMLElement): scala.Unit = js.native
  def validate(jsonString: java.lang.String): java.lang.String = js.native
}

