package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Side
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonItemOptions extends js.Object {
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
    def setOnIonSwipe(value: /* event */ CustomEvent[_] => Unit): Self = this.set("onIonSwipe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonSwipe: Self = this.set("onIonSwipe", js.undefined)
    @scala.inline
    def setSide(value: Side): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
  }
  
}

