package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonItemSliding extends js.Object {
  
  /**
    * If `true`, the user cannot interact with the sliding item.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Emitted when the sliding position changes.
    */
  var onIonDrag: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.native
}
object IonItemSliding {
  
  @scala.inline
  def apply(): IonItemSliding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonItemSliding]
  }
  
  @scala.inline
  implicit class IonItemSlidingOps[Self <: IonItemSliding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnIonDrag(value: /* event */ CustomEvent[_] => Unit): Self = this.set("onIonDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonDrag: Self = this.set("onIonDrag", js.undefined)
  }
}
