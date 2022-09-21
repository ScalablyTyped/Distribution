package typings.kendoUi.kendo.dataviz

import typings.kendoUi.kendo.Observable
import typings.kendoUi.kendo.geometry.Point
import typings.kendoUi.kendo.geometry.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAxis
  extends StObject
     with Observable {
  
  var options: ChartAxisOptions = js.native
  
  def range(): Any = js.native
  
  def slot(from: String): Rect = js.native
  def slot(from: String, to: String): Rect = js.native
  def slot(from: String, to: String, limit: Boolean): Rect = js.native
  def slot(from: String, to: js.Date): Rect = js.native
  def slot(from: String, to: js.Date, limit: Boolean): Rect = js.native
  def slot(from: String, to: Double): Rect = js.native
  def slot(from: String, to: Double, limit: Boolean): Rect = js.native
  def slot(from: String, to: Unit, limit: Boolean): Rect = js.native
  def slot(from: js.Date): Rect = js.native
  def slot(from: js.Date, to: String): Rect = js.native
  def slot(from: js.Date, to: String, limit: Boolean): Rect = js.native
  def slot(from: js.Date, to: js.Date): Rect = js.native
  def slot(from: js.Date, to: js.Date, limit: Boolean): Rect = js.native
  def slot(from: js.Date, to: Double): Rect = js.native
  def slot(from: js.Date, to: Double, limit: Boolean): Rect = js.native
  def slot(from: js.Date, to: Unit, limit: Boolean): Rect = js.native
  def slot(from: Double): Rect = js.native
  def slot(from: Double, to: String): Rect = js.native
  def slot(from: Double, to: String, limit: Boolean): Rect = js.native
  def slot(from: Double, to: js.Date): Rect = js.native
  def slot(from: Double, to: js.Date, limit: Boolean): Rect = js.native
  def slot(from: Double, to: Double): Rect = js.native
  def slot(from: Double, to: Double, limit: Boolean): Rect = js.native
  def slot(from: Double, to: Unit, limit: Boolean): Rect = js.native
  
  def value(point: Point): Unit = js.native
  
  def valueRange(): Any = js.native
}
