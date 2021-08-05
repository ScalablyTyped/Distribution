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
  
  inline def apply(): IonBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonBackdrop]
  }
  
  extension [Self <: IonBackdrop](x: Self) {
    
    inline def setOnIonBackdropTap(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonBackdropTap", js.Any.fromFunction1(value))
    
    inline def setOnIonBackdropTapUndefined: Self = StObject.set(x, "onIonBackdropTap", js.undefined)
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    inline def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    inline def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
