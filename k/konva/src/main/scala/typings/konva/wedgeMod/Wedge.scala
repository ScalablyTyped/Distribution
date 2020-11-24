package typings.konva.wedgeMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Wedge", "Wedge")
@js.native
class Wedge () extends Shape[WedgeConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def angle(): Double = js.native
  def angle(v: Double): this.type = js.native
  @JSName("angle")
  var angle_Original: GetSet[Double, this.type] = js.native
  
  def clockwise(): Boolean = js.native
  def clockwise(v: Boolean): this.type = js.native
  @JSName("clockwise")
  var clockwise_Original: GetSet[Boolean, this.type] = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def radius(): Double = js.native
  def radius(v: Double): this.type = js.native
  @JSName("radius")
  var radius_Original: GetSet[Double, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
}
