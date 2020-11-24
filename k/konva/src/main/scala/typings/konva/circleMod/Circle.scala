package typings.konva.circleMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Circle", "Circle")
@js.native
class Circle () extends Shape[CircleConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def radius(): Double = js.native
  def radius(v: Double): this.type = js.native
  @JSName("radius")
  var radius_Original: GetSet[Double, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
}
