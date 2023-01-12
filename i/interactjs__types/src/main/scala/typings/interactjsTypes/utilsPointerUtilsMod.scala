package typings.interactjsTypes

import typings.interactjsTypes.anon.Bottom
import typings.interactjsTypes.anon.Buttons
import typings.interactjsTypes.anon.ClientX
import typings.interactjsTypes.anon.Identifier
import typings.interactjsTypes.anon.Set
import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.CoordsSetMember
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.coreTypesMod.PointerType
import typings.std.Event
import typings.std.Partial
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPointerUtilsMod {
  
  @JSImport("@interactjs/utils/pointerUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coordsToEvent(coords: MockCoords): Buttons & PointerType & PointerEventType = ^.asInstanceOf[js.Dynamic].applyDynamic("coordsToEvent")(coords.asInstanceOf[js.Any]).asInstanceOf[Buttons & PointerType & PointerEventType]
  
  inline def copyCoords(dest: CoordsSetMember, src: CoordsSetMember): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyCoords")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClientXY(pointer: PointerType, client: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientXY")(pointer.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getEventTargets(event: Event): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTargets")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getPageXY(pointer: InteractEvent[scala.Nothing, EventPhase]): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")(pointer.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def getPageXY(pointer: InteractEvent[scala.Nothing, EventPhase], page: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")(pointer.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getPageXY(pointer: PointerType): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")(pointer.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def getPageXY(pointer: PointerType, page: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageXY")(pointer.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getPointerId(pointer: Identifier): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerId")(pointer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getPointerType(pointer: typings.interactjsTypes.anon.PointerType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerType")(pointer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTouchPair(event: js.Array[PointerType]): js.Array[PointerType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchPair")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[PointerType]]
  inline def getTouchPair(event: TouchEvent): js.Array[PointerType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchPair")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[PointerType]]
  
  inline def getXY(`type`: String, pointer: InteractEvent[scala.Nothing, EventPhase], xy: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getXY")(`type`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], xy.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getXY(`type`: String, pointer: PointerType, xy: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getXY")(`type`.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], xy.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def isNativePointer(pointer: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativePointer")(pointer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def newCoords(): CoordsSetMember = ^.asInstanceOf[js.Dynamic].applyDynamic("newCoords")().asInstanceOf[CoordsSetMember]
  
  inline def pointerAverage(pointers: js.Array[PointerType]): ClientX = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerAverage")(pointers.asInstanceOf[js.Any]).asInstanceOf[ClientX]
  
  inline def pointerExtend[T](dest: Partial[T & Set[T]], source: T): Partial[T & Set[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointerExtend")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T & Set[T]]]
  
  inline def setCoordDeltas(targetObj: CoordsSetMember, prev: CoordsSetMember, cur: CoordsSetMember): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCoordDeltas")(targetObj.asInstanceOf[js.Any], prev.asInstanceOf[js.Any], cur.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCoordVelocity(targetObj: CoordsSetMember, delta: CoordsSetMember): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCoordVelocity")(targetObj.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCoords(dest: CoordsSetMember, pointers: js.Array[Any], timeStamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCoords")(dest.asInstanceOf[js.Any], pointers.asInstanceOf[js.Any], timeStamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setZeroCoords(targetObj: CoordsSetMember): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setZeroCoords")(targetObj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def touchAngle(event: js.Array[PointerType], deltaSource: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("touchAngle")(event.asInstanceOf[js.Any], deltaSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def touchAngle(event: TouchEvent, deltaSource: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("touchAngle")(event.asInstanceOf[js.Any], deltaSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def touchBBox(event: js.Array[PointerType]): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("touchBBox")(event.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def touchDistance(event: js.Array[PointerType], deltaSource: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("touchDistance")(event.asInstanceOf[js.Any], deltaSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def touchDistance(event: TouchEvent, deltaSource: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("touchDistance")(event.asInstanceOf[js.Any], deltaSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait MockCoords extends StObject {
    
    var buttons: js.UndefOr[Double] = js.undefined
    
    var client: Point
    
    var page: Point
    
    var pointerId: js.UndefOr[Any] = js.undefined
    
    var pointerType: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[Any] = js.undefined
    
    var timeStamp: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MockCoords {
    
    inline def apply(client: Point, page: Point): MockCoords = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockCoords]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockCoords] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setClient(value: Point): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Point): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPointerId(value: Any): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      inline def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
