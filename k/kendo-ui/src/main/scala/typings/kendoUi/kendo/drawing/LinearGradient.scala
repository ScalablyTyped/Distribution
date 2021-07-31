package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGradient
  extends StObject
     with Gradient {
  
  def end(): Point = js.native
  def end(end: js.Any): Unit = js.native
  def end(end: Point): Unit = js.native
  
  @JSName("options")
  var options_LinearGradient: LinearGradientOptions = js.native
  
  def start(): Point = js.native
  def start(start: js.Any): Unit = js.native
  def start(start: Point): Unit = js.native
}
