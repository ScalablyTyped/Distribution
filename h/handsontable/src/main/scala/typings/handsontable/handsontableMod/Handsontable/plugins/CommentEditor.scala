package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.std.CSSStyleDeclaration
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentEditor extends js.Object {
  var editor: HTMLElement = js.native
  var editorStyle: CSSStyleDeclaration = js.native
  var hidden: Boolean = js.native
  var rootDocument: Document = js.native
  def createEditor(): HTMLElement = js.native
  def destroy(): Unit = js.native
  def focus(): Unit = js.native
  def getInputElement(): HTMLElement = js.native
  def getValue(): String = js.native
  def hide(): Unit = js.native
  def isFocused(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def resetSize(): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setReadOnlyState(state: Boolean): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setValue(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def show(): Unit = js.native
}

