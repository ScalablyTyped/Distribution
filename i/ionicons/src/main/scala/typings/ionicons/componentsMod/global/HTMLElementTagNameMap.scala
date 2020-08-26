package typings.ionicons.componentsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElementTagNameMap extends js.Object {
  var `ion-icon`: HTMLIonIconElement = js.native
}

object HTMLElementTagNameMap {
  @scala.inline
  def apply(`ion-icon`: HTMLIonIconElement): HTMLElementTagNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ion-icon")(`ion-icon`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElementTagNameMap]
  }
  @scala.inline
  implicit class HTMLElementTagNameMapOps[Self <: HTMLElementTagNameMap] (val x: Self) extends AnyVal {
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
    def `setIon-icon`(value: HTMLIonIconElement): Self = this.set("ion-icon", value.asInstanceOf[js.Any])
  }
  
}

