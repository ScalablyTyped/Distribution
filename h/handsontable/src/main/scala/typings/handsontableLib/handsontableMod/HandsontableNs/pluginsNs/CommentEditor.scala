package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentEditor extends js.Object {
  var editor: stdLib.HTMLElement = js.native
  var editorStyle: stdLib.CSSStyleDeclaration = js.native
  var hidden: scala.Boolean = js.native
  var rootDocument: stdLib.Document = js.native
  def createEditor(): stdLib.HTMLElement = js.native
  def destroy(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputElement(): stdLib.HTMLElement = js.native
  def getValue(): java.lang.String = js.native
  def hide(): scala.Unit = js.native
  def isFocused(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def resetSize(): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setReadOnlyState(state: scala.Boolean): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setValue(): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

