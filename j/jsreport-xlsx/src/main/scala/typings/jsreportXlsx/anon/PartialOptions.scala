package typings.jsreportXlsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-xlsx.jsreport-xlsx.Options> */
@js.native
trait PartialOptions extends js.Object {
  var addBufferSize: js.UndefOr[Double] = js.native
  var escapeAmp: js.UndefOr[Boolean] = js.native
  var numberOfParsedAddIterations: js.UndefOr[Double] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setAddBufferSize(value: Double): Self = this.set("addBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBufferSize: Self = this.set("addBufferSize", js.undefined)
    @scala.inline
    def setEscapeAmp(value: Boolean): Self = this.set("escapeAmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeAmp: Self = this.set("escapeAmp", js.undefined)
    @scala.inline
    def setNumberOfParsedAddIterations(value: Double): Self = this.set("numberOfParsedAddIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfParsedAddIterations: Self = this.set("numberOfParsedAddIterations", js.undefined)
  }
  
}

