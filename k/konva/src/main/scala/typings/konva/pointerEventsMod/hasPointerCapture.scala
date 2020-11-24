package typings.konva.pointerEventsMod

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/PointerEvents", "hasPointerCapture")
@js.native
object hasPointerCapture extends js.Object {
  
  def apply(pointerId: Double, shape: Shape[ShapeConfig]): Boolean = js.native
  def apply(pointerId: Double, shape: Stage): Boolean = js.native
}
