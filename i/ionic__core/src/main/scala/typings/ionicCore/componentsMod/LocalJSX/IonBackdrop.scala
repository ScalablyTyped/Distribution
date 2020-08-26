package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonBackdrop extends js.Object {
  /**
    * Emitted when the backdrop is tapped.
    */
  var onIonBackdropTap: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IonBackdrop {
  @scala.inline
  def apply(): IonBackdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonBackdrop]
  }
  @scala.inline
  implicit class IonBackdropOps[Self <: IonBackdrop] (val x: Self) extends AnyVal {
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
    def setOnIonBackdropTap(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonBackdropTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonBackdropTap: Self = this.set("onIonBackdropTap", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setTappable(value: Boolean): Self = this.set("tappable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTappable: Self = this.set("tappable", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

