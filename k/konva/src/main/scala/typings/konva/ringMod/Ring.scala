package typings.konva.ringMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Ring", "Ring")
@js.native
class Ring () extends Shape[RingConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def innerRadius(): Double = js.native
  def innerRadius(v: Double): this.type = js.native
  @JSName("innerRadius")
  var innerRadius_Original: GetSet[Double, this.type] = js.native
  
  def outerRadius(): Double = js.native
  def outerRadius(v: Double): this.type = js.native
  @JSName("outerRadius")
  var outerRadius_Original: GetSet[Double, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
}
