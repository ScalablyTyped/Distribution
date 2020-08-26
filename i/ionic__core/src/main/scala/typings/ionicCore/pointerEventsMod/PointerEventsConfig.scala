package typings.ionicCore.pointerEventsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventsConfig extends js.Object {
  var capture: js.UndefOr[Boolean] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var passive: js.UndefOr[Boolean] = js.native
  var pointerMove: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
  var pointerUp: js.UndefOr[js.Function1[/* ev */ js.Any, Unit]] = js.native
  var zone: js.UndefOr[Boolean] = js.native
  def pointerDown(ev: js.Any): Boolean = js.native
}

object PointerEventsConfig {
  @scala.inline
  def apply(pointerDown: js.Any => Boolean): PointerEventsConfig = {
    val __obj = js.Dynamic.literal(pointerDown = js.Any.fromFunction1(pointerDown))
    __obj.asInstanceOf[PointerEventsConfig]
  }
  @scala.inline
  implicit class PointerEventsConfigOps[Self <: PointerEventsConfig] (val x: Self) extends AnyVal {
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
    def setPointerDown(value: js.Any => Boolean): Self = this.set("pointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    @scala.inline
    def setPointerMove(value: /* ev */ js.Any => Unit): Self = this.set("pointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerMove: Self = this.set("pointerMove", js.undefined)
    @scala.inline
    def setPointerUp(value: /* ev */ js.Any => Unit): Self = this.set("pointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerUp: Self = this.set("pointerUp", js.undefined)
    @scala.inline
    def setZone(value: Boolean): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

