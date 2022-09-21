package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBox
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  def dataItem(): Any = js.native
  def dataItem(index: Double): Any = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  var input: JQuery = js.native
  
  def items(): Any = js.native
  
  var list: JQuery = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_ComboBox: ComboBoxOptions = js.native
  
  var popup: Popup = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def search(word: String): Unit = js.native
  
  def select(): Double = js.native
  def select(li: js.Function): Unit = js.native
  def select(li: Double): Unit = js.native
  def select(li: JQuery): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  def suggest(value: String): Unit = js.native
  
  def text(): String = js.native
  def text(text: String): Unit = js.native
  
  def toggle(toggle: Boolean): Unit = js.native
  
  var ul: JQuery = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
