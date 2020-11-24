package typings.konva.ellipseMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.Vector2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Ellipse", "Ellipse")
@js.native
class Ellipse () extends Shape[EllipseConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def radius(): Vector2d = js.native
  def radius(v: Vector2d): this.type = js.native
  
  def radiusX(): Double = js.native
  def radiusX(v: Double): this.type = js.native
  @JSName("radiusX")
  var radiusX_Original: GetSet[Double, this.type] = js.native
  
  def radiusY(): Double = js.native
  def radiusY(v: Double): this.type = js.native
  @JSName("radiusY")
  var radiusY_Original: GetSet[Double, this.type] = js.native
  
  @JSName("radius")
  var radius_Original: GetSet[Vector2d, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
}
