package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGradient
  extends StObject
     with Gradient {
  
  def center(): Point = js.native
  def center(center: Any): Unit = js.native
  def center(center: Point): Unit = js.native
  
  @JSName("options")
  var options_RadialGradient: RadialGradientOptions = js.native
  
  def radius(): Double = js.native
  def radius(value: Double): Unit = js.native
}
