package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impressions extends js.Object {
  var blank: js.UndefOr[Double] = js.native
  var `blank-two-sided`: js.UndefOr[Double] = js.native
  var `full-color`: js.UndefOr[Double] = js.native
  var `full-color-two-sided`: js.UndefOr[Double] = js.native
  var `highlight-color`: js.UndefOr[Double] = js.native
  var `highlight-color-two-sided`: js.UndefOr[Double] = js.native
  var monochrome: js.UndefOr[Double] = js.native
  var `monochrome-two-sided`: js.UndefOr[Double] = js.native
}

object Impressions {
  @scala.inline
  def apply(): Impressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Impressions]
  }
  @scala.inline
  implicit class ImpressionsOps[Self <: Impressions] (val x: Self) extends AnyVal {
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
    def setBlank(value: Double): Self = this.set("blank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlank: Self = this.set("blank", js.undefined)
    @scala.inline
    def `setBlank-two-sided`(value: Double): Self = this.set("blank-two-sided", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBlank-two-sided`: Self = this.set("blank-two-sided", js.undefined)
    @scala.inline
    def `setFull-color`(value: Double): Self = this.set("full-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFull-color`: Self = this.set("full-color", js.undefined)
    @scala.inline
    def `setFull-color-two-sided`(value: Double): Self = this.set("full-color-two-sided", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFull-color-two-sided`: Self = this.set("full-color-two-sided", js.undefined)
    @scala.inline
    def `setHighlight-color`(value: Double): Self = this.set("highlight-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHighlight-color`: Self = this.set("highlight-color", js.undefined)
    @scala.inline
    def `setHighlight-color-two-sided`(value: Double): Self = this.set("highlight-color-two-sided", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHighlight-color-two-sided`: Self = this.set("highlight-color-two-sided", js.undefined)
    @scala.inline
    def setMonochrome(value: Double): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    @scala.inline
    def `setMonochrome-two-sided`(value: Double): Self = this.set("monochrome-two-sided", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMonochrome-two-sided`: Self = this.set("monochrome-two-sided", js.undefined)
  }
  
}

