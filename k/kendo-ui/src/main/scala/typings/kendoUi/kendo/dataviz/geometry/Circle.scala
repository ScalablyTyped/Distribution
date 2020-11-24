package typings.kendoUi.kendo.dataviz.geometry

import typings.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends Observable {
  
  def bbox(matrix: typings.kendoUi.kendo.geometry.Matrix): typings.kendoUi.kendo.geometry.Rect = js.native
  
  var center: typings.kendoUi.kendo.geometry.Point = js.native
  
  def equals(other: typings.kendoUi.kendo.geometry.Circle): Boolean = js.native
  
  def getCenter(): typings.kendoUi.kendo.geometry.Point = js.native
  
  def getRadius(): Double = js.native
  
  var options: CircleOptions = js.native
  
  def pointAt(angle: Double): typings.kendoUi.kendo.geometry.Point = js.native
  
  var radius: Double = js.native
  
  def setCenter(value: js.Any): typings.kendoUi.kendo.geometry.Point = js.native
  def setCenter(value: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Point = js.native
  
  def setRadius(value: Double): typings.kendoUi.kendo.geometry.Circle = js.native
}
