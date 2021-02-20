package typings.konva

import typings.konva.nodeMod.KonvaEventObject
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.Stage
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("konva/types/PointerEvents", "createEvent")
  @js.native
  def createEvent(evt: PointerEvent): KonvaPointerEvent = js.native
  
  @JSImport("konva/types/PointerEvents", "getCapturedShape")
  @js.native
  def getCapturedShape(pointerId: Double): Stage | Shape[ShapeConfig] = js.native
  
  @JSImport("konva/types/PointerEvents", "hasPointerCapture")
  @js.native
  def hasPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Boolean = js.native
  @JSImport("konva/types/PointerEvents", "hasPointerCapture")
  @js.native
  def hasPointerCapture(pointerId: Double, shape: Stage): Boolean = js.native
  
  @JSImport("konva/types/PointerEvents", "releaseCapture")
  @js.native
  def releaseCapture(pointerId: Double): Unit = js.native
  @JSImport("konva/types/PointerEvents", "releaseCapture")
  @js.native
  def releaseCapture(pointerId: Double, target: Shape[ShapeConfig]): Unit = js.native
  @JSImport("konva/types/PointerEvents", "releaseCapture")
  @js.native
  def releaseCapture(pointerId: Double, target: Stage): Unit = js.native
  
  @JSImport("konva/types/PointerEvents", "setPointerCapture")
  @js.native
  def setPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Unit = js.native
  @JSImport("konva/types/PointerEvents", "setPointerCapture")
  @js.native
  def setPointerCapture(pointerId: Double, shape: Stage): Unit = js.native
  
  @js.native
  trait KonvaPointerEvent extends KonvaEventObject[PointerEvent] {
    
    var pointerId: Double = js.native
  }
  object KonvaPointerEvent {
    
    @scala.inline
    def apply(
      cancelBubble: Boolean,
      currentTarget: Node[NodeConfig],
      evt: PointerEvent,
      pointerId: Double,
      target: Shape[ShapeConfig] | Stage
    ): KonvaPointerEvent = {
      val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[KonvaPointerEvent]
    }
    
    @scala.inline
    implicit class KonvaPointerEventMutableBuilder[Self <: KonvaPointerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    }
  }
}
