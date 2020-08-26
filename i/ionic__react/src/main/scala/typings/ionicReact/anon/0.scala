package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType] = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: typings.ionicReact.createOverlayComponentMod.OverlayElement */ OverlayType](create: js.Any => js.Promise[OverlayType]): `0`[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`0`[OverlayType]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: typings.ionicReact.createOverlayComponentMod.OverlayElement */ OverlayType] (val x: Self with `0`[OverlayType]) extends AnyVal {
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
    def setCreate(value: js.Any => js.Promise[OverlayType]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

