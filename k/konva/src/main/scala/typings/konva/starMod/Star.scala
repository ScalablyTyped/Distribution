package typings.konva.starMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Star", "Star")
@js.native
class Star () extends Shape[StarConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def innerRadius(): Double = js.native
  def innerRadius(v: Double): this.type = js.native
  @JSName("innerRadius")
  var innerRadius_Original: GetSet[Double, this.type] = js.native
  
  def numPoints(): Double = js.native
  def numPoints(v: Double): this.type = js.native
  @JSName("numPoints")
  var numPoints_Original: GetSet[Double, this.type] = js.native
  
  def outerRadius(): Double = js.native
  def outerRadius(v: Double): this.type = js.native
  @JSName("outerRadius")
  var outerRadius_Original: GetSet[Double, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
}
