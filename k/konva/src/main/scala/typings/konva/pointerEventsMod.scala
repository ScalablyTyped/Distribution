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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("konva/types/PointerEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createEvent(evt: PointerEvent): KonvaPointerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[KonvaPointerEvent]
  
  @scala.inline
  def getCapturedShape(pointerId: Double): Stage | Shape[ShapeConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapturedShape")(pointerId.asInstanceOf[js.Any]).asInstanceOf[Stage | Shape[ShapeConfig]]
  
  @scala.inline
  def hasPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasPointerCapture(pointerId: Double, shape: Stage): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def releaseCapture(pointerId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def releaseCapture(pointerId: Double, target: Shape[ShapeConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def releaseCapture(pointerId: Double, target: Stage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setPointerCapture(pointerId: Double, shape: Stage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait KonvaPointerEvent
    extends StObject
       with KonvaEventObject[PointerEvent] {
    
    var pointerId: Double
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
