package typings.ionicCore

import typings.ionicCore.anon.Capture
import typings.ionicCore.anon.Destroy
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/pointer-events", "createPointerEvents")
  @js.native
  def createPointerEvents(el: Node, pointerDown: js.Any, pointerMove: js.Any, pointerUp: js.Any, options: Capture): Destroy = js.native
  
  @js.native
  trait PointerEventsConfig extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    var passive: js.UndefOr[Boolean] = js.native
    
    def pointerDown(ev: js.Any): Boolean = js.native
    
    var pointerMove: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
    
    var pointerUp: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
    
    var zone: js.UndefOr[Boolean] = js.native
  }
  object PointerEventsConfig {
    
    @scala.inline
    def apply(pointerDown: js.Any => Boolean): PointerEventsConfig = {
      val __obj = js.Dynamic.literal(pointerDown = js.Any.fromFunction1(pointerDown))
      __obj.asInstanceOf[PointerEventsConfig]
    }
    
    @scala.inline
    implicit class PointerEventsConfigMutableBuilder[Self <: PointerEventsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      @scala.inline
      def setPointerDown(value: js.Any => Boolean): Self = StObject.set(x, "pointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointerMove(value: /* ev */ js.Any => Unit): Self = StObject.set(x, "pointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointerMoveUndefined: Self = StObject.set(x, "pointerMove", js.undefined)
      
      @scala.inline
      def setPointerUp(value: /* ev */ js.Any => Unit): Self = StObject.set(x, "pointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointerUpUndefined: Self = StObject.set(x, "pointerUp", js.undefined)
      
      @scala.inline
      def setZone(value: Boolean): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
