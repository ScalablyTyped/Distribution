package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Splitter
  extends StObject
     with Widget {
  
  def ajaxRequest(pane: String, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: String, url: String, data: Any): Unit = js.native
  def ajaxRequest(pane: JQuery, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: JQuery, url: String, data: Any): Unit = js.native
  def ajaxRequest(pane: Element, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: Element, url: String, data: Any): Unit = js.native
  
  def append(): JQuery = js.native
  def append(config: Any): JQuery = js.native
  
  def collapse(pane: String): Unit = js.native
  def collapse(pane: JQuery): Unit = js.native
  def collapse(pane: Element): Unit = js.native
  
  def expand(pane: String): Unit = js.native
  def expand(pane: JQuery): Unit = js.native
  def expand(pane: Element): Unit = js.native
  
  def insertAfter(config: Any, referencePane: String): JQuery = js.native
  def insertAfter(config: Any, referencePane: JQuery): JQuery = js.native
  def insertAfter(config: Any, referencePane: Element): JQuery = js.native
  
  def insertBefore(config: Any, referencePane: String): JQuery = js.native
  def insertBefore(config: Any, referencePane: JQuery): JQuery = js.native
  def insertBefore(config: Any, referencePane: Element): JQuery = js.native
  
  def max(pane: String, value: String): Unit = js.native
  def max(pane: JQuery, value: String): Unit = js.native
  def max(pane: Element, value: String): Unit = js.native
  
  def min(pane: String, value: String): Unit = js.native
  def min(pane: JQuery, value: String): Unit = js.native
  def min(pane: Element, value: String): Unit = js.native
  
  @JSName("options")
  var options_Splitter: SplitterOptions = js.native
  
  def remove(pane: String): Unit = js.native
  def remove(pane: JQuery): Unit = js.native
  def remove(pane: Element): Unit = js.native
  
  def size(pane: String): Any = js.native
  def size(pane: String, value: String): Unit = js.native
  def size(pane: JQuery): Any = js.native
  def size(pane: JQuery, value: String): Unit = js.native
  def size(pane: Element): Any = js.native
  def size(pane: Element, value: String): Unit = js.native
  @JSName("size")
  def size_Unit(pane: String): Unit = js.native
  @JSName("size")
  def size_Unit(pane: JQuery): Unit = js.native
  @JSName("size")
  def size_Unit(pane: Element): Unit = js.native
  
  def toggle(pane: String): Unit = js.native
  def toggle(pane: String, expand: Boolean): Unit = js.native
  def toggle(pane: JQuery): Unit = js.native
  def toggle(pane: JQuery, expand: Boolean): Unit = js.native
  def toggle(pane: Element): Unit = js.native
  def toggle(pane: Element, expand: Boolean): Unit = js.native
  
  var wrapper: JQuery = js.native
}
