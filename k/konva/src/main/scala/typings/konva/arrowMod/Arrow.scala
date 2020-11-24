package typings.konva.arrowMod

import typings.konva.lineMod.Line
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Arrow", "Arrow")
@js.native
class Arrow () extends Line[ArrowConfig] {
  
  def _sceneFunc(ctx: js.Any): Unit = js.native
  
  def pointerAtBeginning(): Boolean = js.native
  def pointerAtBeginning(v: Boolean): this.type = js.native
  @JSName("pointerAtBeginning")
  var pointerAtBeginning_Original: GetSet[Boolean, this.type] = js.native
  
  def pointerLength(): Double = js.native
  def pointerLength(v: Double): this.type = js.native
  @JSName("pointerLength")
  var pointerLength_Original: GetSet[Double, this.type] = js.native
  
  def pointerWidth(): Double = js.native
  def pointerWidth(v: Double): this.type = js.native
  @JSName("pointerWidth")
  var pointerWidth_Original: GetSet[Double, this.type] = js.native
}
