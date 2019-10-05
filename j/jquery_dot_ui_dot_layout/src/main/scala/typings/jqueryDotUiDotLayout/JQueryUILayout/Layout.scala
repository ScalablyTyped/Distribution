package typings.jqueryDotUiDotLayout.JQueryUILayout

import typings.jqueryDotUiDotLayout.Anon_East
import typings.jqueryDotUiDotLayout.Anon_EastNorth
import typings.jqueryDotUiDotLayout.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var options: Options = js.native
  var panes: Anon_East = js.native
  var state: Anon_EastNorth = js.native
  def addCloseBtn(selector: String, pane: String): JQuery = js.native
  def addOpenBtn(selector: String, pane: String): JQuery = js.native
  def addPinBtn(selector: String, pane: String): JQuery = js.native
  def addToggleBtn(selector: String, pane: String): JQuery = js.native
  def allowOverflow(elemOrPane: String): JQuery = js.native
  def allowOverflow(elemOrPane: HTMLElement): JQuery = js.native
  def close(pane: String): JQuery = js.native
  def hide(pane: String): JQuery = js.native
  def open(pane: String): JQuery = js.native
  def resetOverflow(elemOrPane: String): JQuery = js.native
  def resetOverflow(elemOrPane: HTMLElement): JQuery = js.native
  def resizeAll(): JQuery = js.native
  def resizeContent(pane: String): JQuery = js.native
  def show(pane: String): JQuery = js.native
  def show(pane: String, openPane: Boolean): JQuery = js.native
  def sizePane(pane: String, sizeInPixels: Double): JQuery = js.native
  def toggle(pane: String): JQuery = js.native
}

