package typings.konva.pointerEventsMod

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/PointerEvents", "releaseCapture")
@js.native
object releaseCapture extends js.Object {
  
  def apply(pointerId: Double): Unit = js.native
  def apply(pointerId: Double, target: Shape[ShapeConfig]): Unit = js.native
  def apply(pointerId: Double, target: Stage): Unit = js.native
}
