package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefsOptions extends js.Object {
  var arrow: js.UndefOr[DefsArrowOptions | SVGDefinitionObject] = js.native
  var `reverse-arrow`: js.UndefOr[DefsReverseArrowOptions | SVGDefinitionObject] = js.native
}

object DefsOptions {
  @scala.inline
  def apply(): DefsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsOptions]
  }
  @scala.inline
  implicit class DefsOptionsOps[Self <: DefsOptions] (val x: Self) extends AnyVal {
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
    def setArrow(value: DefsArrowOptions | SVGDefinitionObject): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    @scala.inline
    def `setReverse-arrow`(value: DefsReverseArrowOptions | SVGDefinitionObject): Self = this.set("reverse-arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteReverse-arrow`: Self = this.set("reverse-arrow", js.undefined)
  }
  
}

