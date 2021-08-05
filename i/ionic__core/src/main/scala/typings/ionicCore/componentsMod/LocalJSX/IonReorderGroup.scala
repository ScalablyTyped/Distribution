package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.reorderGroupInterfaceMod.ItemReorderEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonReorderGroup extends StObject {
  
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event that needs to be listened to in order to complete the reorder action. Once the event has been emitted, the `complete()` method then needs to be called in order to finalize the reorder action.
    */
  var onIonItemReorder: js.UndefOr[js.Function1[/* event */ CustomEvent[ItemReorderEventDetail], Unit]] = js.undefined
}
object IonReorderGroup {
  
  inline def apply(): IonReorderGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonReorderGroup]
  }
  
  extension [Self <: IonReorderGroup](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnIonItemReorder(value: /* event */ CustomEvent[ItemReorderEventDetail] => Unit): Self = StObject.set(x, "onIonItemReorder", js.Any.fromFunction1(value))
    
    inline def setOnIonItemReorderUndefined: Self = StObject.set(x, "onIonItemReorder", js.undefined)
  }
}
