package typings.ionicCore

import typings.ionicCore.anon.Capture
import typings.ionicCore.anon.Destroy
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/pointer-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPointerEvents(el: Node, pointerDown: js.Any, pointerMove: js.Any, pointerUp: js.Any, options: Capture): Destroy = (^.asInstanceOf[js.Dynamic].applyDynamic("createPointerEvents")(el.asInstanceOf[js.Any], pointerDown.asInstanceOf[js.Any], pointerMove.asInstanceOf[js.Any], pointerUp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Destroy]
  
  trait PointerEventsConfig extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    def pointerDown(ev: js.Any): Boolean
    
    var pointerMove: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.undefined
    
    var pointerUp: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.undefined
    
    var zone: js.UndefOr[Boolean] = js.undefined
  }
  object PointerEventsConfig {
    
    inline def apply(pointerDown: js.Any => Boolean): PointerEventsConfig = {
      val __obj = js.Dynamic.literal(pointerDown = js.Any.fromFunction1(pointerDown))
      __obj.asInstanceOf[PointerEventsConfig]
    }
    
    extension [Self <: PointerEventsConfig](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setPointerDown(value: js.Any => Boolean): Self = StObject.set(x, "pointerDown", js.Any.fromFunction1(value))
      
      inline def setPointerMove(value: /* ev */ js.Any => Unit): Self = StObject.set(x, "pointerMove", js.Any.fromFunction1(value))
      
      inline def setPointerMoveUndefined: Self = StObject.set(x, "pointerMove", js.undefined)
      
      inline def setPointerUp(value: /* ev */ js.Any => Unit): Self = StObject.set(x, "pointerUp", js.Any.fromFunction1(value))
      
      inline def setPointerUpUndefined: Self = StObject.set(x, "pointerUp", js.undefined)
      
      inline def setZone(value: Boolean): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
