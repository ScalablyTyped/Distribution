package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMobile
  extends StObject
     with JQueryMobileOptions {
  
  var activePage: JQuery = js.native
  
  var base: Any = js.native
  
  var button: Any = js.native
  
  def changePage(to: Any): Unit = js.native
  def changePage(to: Any, options: ChangePageOptions): Unit = js.native
  
  var checkboxradio: Any = js.native
  
  var collapsible: Any = js.native
  
  var collapsibleset: Any = js.native
  
  var defaultHomeScroll: Double = js.native
  
  var dialog: Any = js.native
  
  var filterable: Any = js.native
  
  var fixedtoolbar: Any = js.native
  
  var flipswitch: Any = js.native
  
  def initializePage(): Unit = js.native
  
  var listview: Any = js.native
  
  def loadPage(url: Any): Unit = js.native
  def loadPage(url: Any, options: LoadPageOptions): Unit = js.native
  
  var loader: Any = js.native
  
  def loading(): JQuery = js.native
  def loading(command: String): JQuery = js.native
  def loading(command: String, options: LoaderOptions): JQuery = js.native
  
  var options: JQueryMobileOptions = js.native
  
  var page: Any = js.native
  
  var pageContainer: Any = js.native
  
  var path: JQueryMobilePath = js.native
  
  var popup: Any = js.native
  
  var selectmenu: Any = js.native
  
  var showCategory: Any = js.native
  
  def silentScroll(yPos: Double): Unit = js.native
  
  var slider: Any = js.native
  
  var textinput: Any = js.native
  
  var touchOverflow: Any = js.native
  
  var version: String = js.native
}
