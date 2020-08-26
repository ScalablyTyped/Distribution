package typings.gulpStylus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var compress: js.UndefOr[Boolean] = js.native
  var `include css`: js.UndefOr[Boolean] = js.native
  var linenos: js.UndefOr[Boolean] = js.native
  var rawDefine: js.UndefOr[VariableDefinitions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def `setInclude css`(value: Boolean): Self = this.set("include css", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteInclude css`: Self = this.set("include css", js.undefined)
    @scala.inline
    def setLinenos(value: Boolean): Self = this.set("linenos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinenos: Self = this.set("linenos", js.undefined)
    @scala.inline
    def setRawDefine(value: VariableDefinitions): Self = this.set("rawDefine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawDefine: Self = this.set("rawDefine", js.undefined)
  }
  
}

