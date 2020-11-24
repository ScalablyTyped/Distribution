package typings.konva.labelMod

import typings.konva.konvaStrings.bottom
import typings.konva.konvaStrings.left
import typings.konva.konvaStrings.right
import typings.konva.konvaStrings.top
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Label", "Tag")
@js.native
class Tag () extends Shape[TagConfig] {
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def cornerRadius(): Double = js.native
  def cornerRadius(v: Double): this.type = js.native
  @JSName("cornerRadius")
  var cornerRadius_Original: GetSet[Double, this.type] = js.native
  
  def pointerDirection(): left | top | right | bottom = js.native
  @JSName("pointerDirection")
  var pointerDirection_Original: GetSet[left | top | right | bottom, this.type] = js.native
  @JSName("pointerDirection")
  def pointerDirection_bottom(v: bottom): this.type = js.native
  @JSName("pointerDirection")
  def pointerDirection_left(v: left): this.type = js.native
  @JSName("pointerDirection")
  def pointerDirection_right(v: right): this.type = js.native
  @JSName("pointerDirection")
  def pointerDirection_top(v: top): this.type = js.native
  
  def pointerHeight(): Double = js.native
  def pointerHeight(v: Double): this.type = js.native
  @JSName("pointerHeight")
  var pointerHeight_Original: GetSet[Double, this.type] = js.native
  
  def pointerWidth(): Double = js.native
  def pointerWidth(v: Double): this.type = js.native
  @JSName("pointerWidth")
  var pointerWidth_Original: GetSet[Double, this.type] = js.native
}
