package typings
package jquerymobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMobile extends JQueryMobileOptions {
  var activePage: JQuery = js.native
  var base: js.Any = js.native
  var button: js.Any = js.native
  var checkboxradio: js.Any = js.native
  var collapsible: js.Any = js.native
  var collapsibleset: js.Any = js.native
  var defaultHomeScroll: scala.Double = js.native
  var dialog: js.Any = js.native
  var filterable: js.Any = js.native
  var fixedtoolbar: js.Any = js.native
  var flipswitch: js.Any = js.native
  var listview: js.Any = js.native
  var loader: js.Any = js.native
  var options: JQueryMobileOptions = js.native
  var page: js.Any = js.native
  var pageContainer: js.Any = js.native
  var path: JQueryMobilePath = js.native
  var popup: js.Any = js.native
  var selectmenu: js.Any = js.native
  var showCategory: js.Any = js.native
  var slider: js.Any = js.native
  var textinput: js.Any = js.native
  var touchOverflow: js.Any = js.native
  var version: java.lang.String = js.native
  def changePage(to: js.Any): scala.Unit = js.native
  def changePage(to: js.Any, options: ChangePageOptions): scala.Unit = js.native
  def initializePage(): scala.Unit = js.native
  def loadPage(url: js.Any): scala.Unit = js.native
  def loadPage(url: js.Any, options: LoadPageOptions): scala.Unit = js.native
  def loading(): JQuery = js.native
  def loading(command: java.lang.String): JQuery = js.native
  def loading(command: java.lang.String, options: LoaderOptions): JQuery = js.native
  def silentScroll(yPos: scala.Double): scala.Unit = js.native
}

