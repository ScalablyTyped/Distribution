package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc extends Observable {
  
  var anticlockwise: Boolean = js.native
  
  def bbox(matrix: typings.kendoUi.kendo.geometry.Matrix): typings.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typings.kendoUi.kendo.geometry.Point = js.native
  
  var endAngle: Double = js.native
  
  def getAnticlockwise(): Boolean = js.native
  
  def getCenter(): typings.kendoUi.kendo.geometry.Point = js.native
  
  def getEndAngle(): Double = js.native
  
  def getRadiusX(): Double = js.native
  
  def getRadiusY(): Double = js.native
  
  def getStartAngle(): Double = js.native
  
  var options: ArcOptions = js.native
  
  def pointAt(angle: Double): typings.kendoUi.kendo.geometry.Point = js.native
  
  var radiusX: Double = js.native
  
  var radiusY: Double = js.native
  
  def setAnticlockwise(value: Boolean): typings.kendoUi.kendo.geometry.Arc = js.native
  
  def setCenter(value: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Arc = js.native
  
  def setEndAngle(value: Double): typings.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusX(value: Double): typings.kendoUi.kendo.geometry.Arc = js.native
  
  def setRadiusY(value: Double): typings.kendoUi.kendo.geometry.Arc = js.native
  
  def setStartAngle(value: Double): typings.kendoUi.kendo.geometry.Arc = js.native
  
  var startAngle: Double = js.native
}
