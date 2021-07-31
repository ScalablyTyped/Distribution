package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonBackdrop extends StObject {
  
  /**
    * Emitted when the backdrop is tapped.
    */
  var onIonBackdropTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IonBackdrop {
  
  @scala.inline
  def apply(): IonBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonBackdrop]
  }
  
  @scala.inline
  implicit class IonBackdropMutableBuilder[Self <: IonBackdrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnIonBackdropTap(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonBackdropTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonBackdropTapUndefined: Self = StObject.set(x, "onIonBackdropTap", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    @scala.inline
    def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
