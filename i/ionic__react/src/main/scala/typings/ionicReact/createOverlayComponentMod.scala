package typings.ionicReact

import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicReact.anon.`0`
import typings.ionicReact.anon.`1`
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createOverlayComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createOverlayComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](displayName: String, controller: `0`[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `1`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(displayName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `1`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  
  @js.native
  trait OverlayElement
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
  
  trait ReactOverlayProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var isOpen: Boolean
    
    var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
    
    var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[js.Any]], Unit]] = js.undefined
  }
  object ReactOverlayProps {
    
    @scala.inline
    def apply(isOpen: Boolean): ReactOverlayProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactOverlayProps]
    }
    
    @scala.inline
    implicit class ReactOverlayPropsMutableBuilder[Self <: ReactOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidDismissUndefined: Self = StObject.set(x, "onDidDismiss", js.undefined)
      
      @scala.inline
      def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onDidPresent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDidPresentUndefined: Self = StObject.set(x, "onDidPresent", js.undefined)
      
      @scala.inline
      def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillDismissUndefined: Self = StObject.set(x, "onWillDismiss", js.undefined)
      
      @scala.inline
      def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onWillPresent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWillPresentUndefined: Self = StObject.set(x, "onWillPresent", js.undefined)
    }
  }
}
