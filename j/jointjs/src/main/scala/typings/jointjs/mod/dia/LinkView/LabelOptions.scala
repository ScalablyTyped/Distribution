package typings.jointjs.mod.dia.LinkView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOptions
  extends typings.jointjs.mod.dia.Cell.Options {
  var absoluteDistance: js.UndefOr[Boolean] = js.native
  var absoluteOffset: js.UndefOr[Boolean] = js.native
  var ensureLegibility: js.UndefOr[Boolean] = js.native
  var keepGradient: js.UndefOr[Boolean] = js.native
  var reverseDistance: js.UndefOr[Boolean] = js.native
}

object LabelOptions {
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
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
    def setAbsoluteDistance(value: Boolean): Self = this.set("absoluteDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteDistance: Self = this.set("absoluteDistance", js.undefined)
    @scala.inline
    def setAbsoluteOffset(value: Boolean): Self = this.set("absoluteOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteOffset: Self = this.set("absoluteOffset", js.undefined)
    @scala.inline
    def setEnsureLegibility(value: Boolean): Self = this.set("ensureLegibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnsureLegibility: Self = this.set("ensureLegibility", js.undefined)
    @scala.inline
    def setKeepGradient(value: Boolean): Self = this.set("keepGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepGradient: Self = this.set("keepGradient", js.undefined)
    @scala.inline
    def setReverseDistance(value: Boolean): Self = this.set("reverseDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseDistance: Self = this.set("reverseDistance", js.undefined)
  }
  
}

