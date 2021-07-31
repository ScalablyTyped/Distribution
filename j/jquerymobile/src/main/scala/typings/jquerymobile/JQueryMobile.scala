package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMobile
  extends StObject
     with JQueryMobileOptions {
  
  var activePage: JQuery = js.native
  
  var base: js.Any = js.native
  
  var button: js.Any = js.native
  
  def changePage(to: js.Any): Unit = js.native
  def changePage(to: js.Any, options: ChangePageOptions): Unit = js.native
  
  var checkboxradio: js.Any = js.native
  
  var collapsible: js.Any = js.native
  
  var collapsibleset: js.Any = js.native
  
  var defaultHomeScroll: Double = js.native
  
  var dialog: js.Any = js.native
  
  var filterable: js.Any = js.native
  
  var fixedtoolbar: js.Any = js.native
  
  var flipswitch: js.Any = js.native
  
  def initializePage(): Unit = js.native
  
  var listview: js.Any = js.native
  
  def loadPage(url: js.Any): Unit = js.native
  def loadPage(url: js.Any, options: LoadPageOptions): Unit = js.native
  
  var loader: js.Any = js.native
  
  def loading(): JQuery = js.native
  def loading(command: String): JQuery = js.native
  def loading(command: String, options: LoaderOptions): JQuery = js.native
  
  var options: JQueryMobileOptions = js.native
  
  var page: js.Any = js.native
  
  var pageContainer: js.Any = js.native
  
  var path: JQueryMobilePath = js.native
  
  var popup: js.Any = js.native
  
  var selectmenu: js.Any = js.native
  
  var showCategory: js.Any = js.native
  
  def silentScroll(yPos: Double): Unit = js.native
  
  var slider: js.Any = js.native
  
  var textinput: js.Any = js.native
  
  var touchOverflow: js.Any = js.native
  
  var version: String = js.native
}
