package typings.ionicCore.componentsMod.Components

import typings.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonItemOptions extends js.Object {
  
  def fireSwipeEvent(): js.Promise[Unit] = js.native
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side = js.native
}
object IonItemOptions {
  
  @scala.inline
  def apply(fireSwipeEvent: () => js.Promise[Unit], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = js.Any.fromFunction0(fireSwipeEvent), side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonItemOptions]
  }
  
  @scala.inline
  implicit class IonItemOptionsOps[Self <: IonItemOptions] (val x: Self) extends AnyVal {
    
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
    def setFireSwipeEvent(value: () => js.Promise[Unit]): Self = this.set("fireSwipeEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSide(value: Side): Self = this.set("side", value.asInstanceOf[js.Any])
  }
}
