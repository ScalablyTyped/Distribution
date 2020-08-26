package typings.highcharts.solidGaugeMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolOptionsObject extends js.Object {
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.native
}

object SymbolOptionsObject {
  @scala.inline
  def apply(): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOptionsObject]
  }
  @scala.inline
  implicit class SymbolOptionsObjectOps[Self <: SymbolOptionsObject] (val x: Self) extends AnyVal {
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
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
  }
  
}

