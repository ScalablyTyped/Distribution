package typings.kendoUi.kendo.geometry

import typings.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformation
  extends StObject
     with Observable {
  
  def equals(other: Transformation): Boolean = js.native
  
  def matrix(): Matrix = js.native
  
  def multiply(transformation: Transformation): Transformation = js.native
  
  var options: TransformationOptions = js.native
  
  def rotate(angle: Double, center: Any): Transformation = js.native
  def rotate(angle: Double, center: Point): Transformation = js.native
  
  def scale(scaleX: Double, scaleY: Double): Transformation = js.native
  
  def translate(x: Double, y: Double): Transformation = js.native
}
