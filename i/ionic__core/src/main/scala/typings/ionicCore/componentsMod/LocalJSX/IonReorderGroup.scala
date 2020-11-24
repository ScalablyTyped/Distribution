package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.reorderGroupInterfaceMod.ItemReorderEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonReorderGroup extends js.Object {
  
  /**
    * If `true`, the reorder will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Event that needs to be listened to in order to complete the reorder action. Once the event has been emitted, the `complete()` method then needs to be called in order to finalize the reorder action.
    */
  var onIonItemReorder: js.UndefOr[js.Function1[/* event */ CustomEvent[ItemReorderEventDetail], Unit]] = js.native
}
object IonReorderGroup {
  
  @scala.inline
  def apply(): IonReorderGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonReorderGroup]
  }
  
  @scala.inline
  implicit class IonReorderGroupOps[Self <: IonReorderGroup] (val x: Self) extends AnyVal {
    
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
    def setOnIonItemReorder(value: /* event */ CustomEvent[ItemReorderEventDetail] => Unit): Self = this.set("onIonItemReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonItemReorder: Self = this.set("onIonItemReorder", js.undefined)
  }
}
