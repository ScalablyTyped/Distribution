package typings.ionicReact

import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicReact.anon.Create
import typings.ionicReact.anon.ForwardedRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createControllerComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createControllerComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControllerComponent[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](displayName: String, controller: Create[OptionsType, OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & ForwardedRef[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createControllerComponent")(displayName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OptionsType & ReactControllerProps & ForwardedRef[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  
  @js.native
  trait OverlayBase
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  trait ReactControllerProps extends StObject {
    
    var isOpen: Boolean
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  }
  object ReactControllerProps {
    
    inline def apply(isOpen: Boolean): ReactControllerProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactControllerProps]
    }
    
    extension [Self <: ReactControllerProps](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
      
      inline def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1(value))
      
      inline def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
      
      inline def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1(value))
      
      inline def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
      
      inline def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1(value))
      
      inline def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    }
  }
}
