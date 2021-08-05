package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonItemOptions extends StObject {
  
  /**
    * Emitted when the item has been fully swiped.
    */
  var onIonSwipe: js.UndefOr[js.Function1[/* event */ CustomEvent[js.Any], Unit]] = js.undefined
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: js.UndefOr[Side] = js.undefined
}
object IonItemOptions {
  
  inline def apply(): IonItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemOptions]
  }
  
  extension [Self <: IonItemOptions](x: Self) {
    
    inline def setOnIonSwipe(value: /* event */ CustomEvent[js.Any] => Unit): Self = StObject.set(x, "onIonSwipe", js.Any.fromFunction1(value))
    
    inline def setOnIonSwipeUndefined: Self = StObject.set(x, "onIonSwipe", js.undefined)
    
    inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
