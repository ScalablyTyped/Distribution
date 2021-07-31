package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonMenu extends StObject {
  
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: js.UndefOr[Double] = js.undefined
  
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the menu is closed.
    */
  var onIonDidClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the menu is open.
    */
  var onIonDidOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the menu is about to be closed.
    */
  var onIonWillClose: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the menu is about to be opened.
    */
  var onIonWillOpen: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Which side of the view the menu should be placed.
    */
  var side: js.UndefOr[Side] = js.undefined
  
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object IonMenu {
  
  @scala.inline
  def apply(): IonMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenu]
  }
  
  @scala.inline
  implicit class IonMenuMutableBuilder[Self <: IonMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMaxEdgeStart(value: Double): Self = StObject.set(x, "maxEdgeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxEdgeStartUndefined: Self = StObject.set(x, "maxEdgeStart", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    @scala.inline
    def setOnIonDidClose(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonDidClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonDidCloseUndefined: Self = StObject.set(x, "onIonDidClose", js.undefined)
    
    @scala.inline
    def setOnIonDidOpen(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonDidOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonDidOpenUndefined: Self = StObject.set(x, "onIonDidOpen", js.undefined)
    
    @scala.inline
    def setOnIonWillClose(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonWillClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonWillCloseUndefined: Self = StObject.set(x, "onIonWillClose", js.undefined)
    
    @scala.inline
    def setOnIonWillOpen(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonWillOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonWillOpenUndefined: Self = StObject.set(x, "onIonWillOpen", js.undefined)
    
    @scala.inline
    def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = StObject.set(x, "swipeGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeGestureUndefined: Self = StObject.set(x, "swipeGesture", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
