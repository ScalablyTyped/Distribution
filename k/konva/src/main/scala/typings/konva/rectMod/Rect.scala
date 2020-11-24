package typings.konva.rectMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Rect", "Rect")
@js.native
class Rect () extends Shape[RectConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def cornerRadius(): Double | js.Array[Double] = js.native
  def cornerRadius(v: js.Array[Double]): this.type = js.native
  def cornerRadius(v: Double): this.type = js.native
  @JSName("cornerRadius")
  var cornerRadius_Original: GetSet[Double | js.Array[Double], this.type] = js.native
}
