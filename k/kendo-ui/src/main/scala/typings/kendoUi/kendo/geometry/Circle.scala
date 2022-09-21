package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle
  extends StObject
     with Observable {
  
  def bbox(matrix: Matrix): Rect = js.native
  
  var center: Point = js.native
  
  def equals(other: Circle): Boolean = js.native
  
  def getCenter(): Point = js.native
  
  def getRadius(): Double = js.native
  
  var options: CircleOptions = js.native
  
  def pointAt(angle: Double): Point = js.native
  
  var radius: Double = js.native
  
  def setCenter(value: Any): Point = js.native
  def setCenter(value: Point): Point = js.native
  
  def setRadius(value: Double): Circle = js.native
}
