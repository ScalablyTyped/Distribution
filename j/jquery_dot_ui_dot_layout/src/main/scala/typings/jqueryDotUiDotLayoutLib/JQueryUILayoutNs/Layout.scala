package typings
package jqueryDotUiDotLayoutLib.JQueryUILayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var options: Options = js.native
  var panes: jqueryDotUiDotLayoutLib.Anon_WestNorth = js.native
  var state: jqueryDotUiDotLayoutLib.Anon_West = js.native
  def addCloseBtn(selector: java.lang.String, pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def addOpenBtn(selector: java.lang.String, pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def addPinBtn(selector: java.lang.String, pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def addToggleBtn(selector: java.lang.String, pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def allowOverflow(elemOrPane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def allowOverflow(elemOrPane: stdLib.HTMLElement): jqueryDotUiDotLayoutLib.JQuery = js.native
  def close(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def hide(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def open(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def resetOverflow(elemOrPane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def resetOverflow(elemOrPane: stdLib.HTMLElement): jqueryDotUiDotLayoutLib.JQuery = js.native
  def resizeAll(): jqueryDotUiDotLayoutLib.JQuery = js.native
  def resizeContent(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def show(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
  def show(pane: java.lang.String, openPane: scala.Boolean): jqueryDotUiDotLayoutLib.JQuery = js.native
  def sizePane(pane: java.lang.String, sizeInPixels: scala.Double): jqueryDotUiDotLayoutLib.JQuery = js.native
  def toggle(pane: java.lang.String): jqueryDotUiDotLayoutLib.JQuery = js.native
}

