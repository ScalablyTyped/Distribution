package typings.hapiHoek.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@hapi/hoek.@hapi/hoek.contain.Options, 'once'> */
@js.native
trait OmitOptionsonce extends js.Object {
  var deep: js.UndefOr[Boolean] = js.native
  var only: js.UndefOr[Boolean] = js.native
  var part: js.UndefOr[Boolean] = js.native
  var symbols: js.UndefOr[Boolean] = js.native
}

object OmitOptionsonce {
  @scala.inline
  def apply(): OmitOptionsonce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitOptionsonce]
  }
  @scala.inline
  implicit class OmitOptionsonceOps[Self <: OmitOptionsonce] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setPart(value: Boolean): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
  
}

