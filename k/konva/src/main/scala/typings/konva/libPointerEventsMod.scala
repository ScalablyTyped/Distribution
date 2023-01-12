package typings.konva

import typings.konva.libNodeMod.KonvaEventObject
import typings.konva.libNodeMod.Node
import typings.konva.libNodeMod.NodeConfig
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libStageMod.Stage
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPointerEventsMod {
  
  @JSImport("konva/lib/PointerEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEvent(evt: PointerEvent): KonvaPointerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[KonvaPointerEvent]
  
  inline def getCapturedShape(pointerId: Double): Stage | Shape[ShapeConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapturedShape")(pointerId.asInstanceOf[js.Any]).asInstanceOf[Stage | Shape[ShapeConfig]]
  
  inline def hasPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasPointerCapture(pointerId: Double, shape: Stage): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def releaseCapture(pointerId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def releaseCapture(pointerId: Double, target: Shape[ShapeConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def releaseCapture(pointerId: Double, target: Stage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")(pointerId.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPointerCapture(pointerId: Double, shape: Shape[ShapeConfig]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setPointerCapture(pointerId: Double, shape: Stage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPointerCapture")(pointerId.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait KonvaPointerEvent
    extends StObject
       with KonvaEventObject[PointerEvent] {
    
    var pointerId: Double
  }
  object KonvaPointerEvent {
    
    inline def apply(
      cancelBubble: Boolean,
      currentTarget: Node[NodeConfig],
      evt: PointerEvent,
      pointerId: Double,
      target: Shape[ShapeConfig] | Stage,
      `type`: String
    ): KonvaPointerEvent = {
      val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KonvaPointerEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KonvaPointerEvent] (val x: Self) extends AnyVal {
      
      inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    }
  }
}
