package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonItemSliding extends StObject {
  
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ CustomEvent[js.Any], Unit]] = js.undefined
}
object IonItemSliding {
  
  @scala.inline
  def apply(): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemSliding]
  }
  
  @scala.inline
  implicit class IonItemSlidingMutableBuilder[Self <: IonItemSliding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnIonDrag(value: /* event */ CustomEvent[js.Any] => Unit): Self = StObject.set(x, "onIonDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonDragUndefined: Self = StObject.set(x, "onIonDrag", js.undefined)
  }
}
