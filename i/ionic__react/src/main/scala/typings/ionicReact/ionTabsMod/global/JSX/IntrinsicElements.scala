package typings.ionicReact.ionTabsMod.global.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicElements extends js.Object {
  var `ion-tabs`: js.Any = js.native
}

object IntrinsicElements {
  @scala.inline
  def apply(`ion-tabs`: js.Any): IntrinsicElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ion-tabs")(`ion-tabs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicElements]
  }
  @scala.inline
  implicit class IntrinsicElementsOps[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
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
    def `setIon-tabs`(value: js.Any): Self = this.set("ion-tabs", value.asInstanceOf[js.Any])
  }
  
}

