package typings.jqueryui.anon

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQuery
import typings.jqueryui.JQueryUI.MenuOptions
import typings.jqueryui.jqueryuiStrings.blur
import typings.jqueryui.jqueryuiStrings.collapse
import typings.jqueryui.jqueryuiStrings.collapseAll
import typings.jqueryui.jqueryuiStrings.destroy
import typings.jqueryui.jqueryuiStrings.disable
import typings.jqueryui.jqueryuiStrings.enable
import typings.jqueryui.jqueryuiStrings.focus
import typings.jqueryui.jqueryuiStrings.isFirstItem
import typings.jqueryui.jqueryuiStrings.isLastItem
import typings.jqueryui.jqueryuiStrings.next
import typings.jqueryui.jqueryuiStrings.nextPage
import typings.jqueryui.jqueryuiStrings.previous
import typings.jqueryui.jqueryuiStrings.previousPage
import typings.jqueryui.jqueryuiStrings.refresh
import typings.jqueryui.jqueryuiStrings.select
import typings.jqueryui.jqueryuiStrings.widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(methodName: String): JQuery = js.native
  def apply(methodName: String, event: JQueryEventObject, item: JQuery): Unit = js.native
  def apply(methodName: blur): Unit = js.native
  def apply(methodName: collapse): Unit = js.native
  def apply(methodName: collapseAll): Unit = js.native
  def apply(methodName: collapseAll, event: js.UndefOr[scala.Nothing], all: Boolean): Unit = js.native
  def apply(methodName: collapseAll, event: JQueryEventObject): Unit = js.native
  def apply(methodName: collapseAll, event: JQueryEventObject, all: Boolean): Unit = js.native
  def apply(methodName: collapse, event: JQueryEventObject): Unit = js.native
  def apply(methodName: destroy): Unit = js.native
  def apply(methodName: disable): Unit = js.native
  def apply(methodName: enable): Unit = js.native
  def apply(methodName: focus, event: JQueryEventObject, item: JQuery): Unit = js.native
  def apply(methodName: isFirstItem): Boolean = js.native
  def apply(methodName: isLastItem): Boolean = js.native
  def apply(methodName: next): Unit = js.native
  def apply(methodName: nextPage): Unit = js.native
  def apply(methodName: nextPage, event: JQueryEventObject): Unit = js.native
  def apply(methodName: next, event: JQueryEventObject): Unit = js.native
  def apply(methodName: previous): Unit = js.native
  def apply(methodName: previousPage): Unit = js.native
  def apply(methodName: previousPage, event: JQueryEventObject): Unit = js.native
  def apply(methodName: previous, event: JQueryEventObject): Unit = js.native
  def apply(methodName: refresh): Unit = js.native
  def apply(methodName: select): Unit = js.native
  def apply(methodName: select, event: JQueryEventObject): Unit = js.native
  def apply(methodName: widget): JQuery = js.native
  def apply(optionLiteral: String, optionName: String): js.Any = js.native
  def apply(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def apply(optionLiteral: String, options: MenuOptions): js.Any = js.native
  def apply(options: MenuOptions): JQuery = js.native
  
  var active: Boolean = js.native
}
