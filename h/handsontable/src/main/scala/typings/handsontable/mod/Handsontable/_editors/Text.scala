package typings.handsontable.mod.Handsontable._editors

import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends Base {
  var TEXTAREA: HTMLInputElement = js.native
  var TEXTAREA_PARENT: HTMLElement = js.native
  var textareaStyle: CSSStyleDeclaration = js.native
  def bindEvents(): Unit = js.native
  def createElements(): Unit = js.native
  def destroy(): Unit = js.native
  def hideEditableElement(): Unit = js.native
  def refreshDimensions(): Unit = js.native
  def refreshDimensions(force: Boolean): Unit = js.native
  def refreshValue(): Unit = js.native
  def showEditableElement(): Unit = js.native
}

