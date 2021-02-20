package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonItemOptions extends StObject {
  
  /**
    * Emitted when the item has been fully swiped.
    */
  var onIonSwipe: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: js.UndefOr[Side] = js.native
}
object IonItemOptions {
  
  @scala.inline
  def apply(): IonItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemOptions]
  }
  
  @scala.inline
  implicit class IonItemOptionsMutableBuilder[Self <: IonItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnIonSwipe(value: /* event */ CustomEvent[_] => Unit): Self = StObject.set(x, "onIonSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonSwipeUndefined: Self = StObject.set(x, "onIonSwipe", js.undefined)
    
    @scala.inline
    def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
