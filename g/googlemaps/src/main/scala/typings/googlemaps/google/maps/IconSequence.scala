package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSequence extends js.Object {
  var fixedRotation: js.UndefOr[Boolean] = js.native
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[Symbol] = js.native
  var offset: js.UndefOr[String] = js.native
  var repeat: js.UndefOr[String] = js.native
}

object IconSequence {
  @scala.inline
  def apply(): IconSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSequence]
  }
  @scala.inline
  implicit class IconSequenceOps[Self <: IconSequence] (val x: Self) extends AnyVal {
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
    def setFixedRotation(value: Boolean): Self = this.set("fixedRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRotation: Self = this.set("fixedRotation", js.undefined)
    @scala.inline
    def setIcon(value: Symbol): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setRepeat(value: String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

