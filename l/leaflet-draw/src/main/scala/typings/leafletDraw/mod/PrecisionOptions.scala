package typings.leafletDraw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecisionOptions extends js.Object {
  var ac: js.UndefOr[Double] = js.native
  var ft: js.UndefOr[Double] = js.native
  var ha: js.UndefOr[Double] = js.native
  var km: js.UndefOr[Double] = js.native
  var m: js.UndefOr[Double] = js.native
  var mi: js.UndefOr[Double] = js.native
  var nm: js.UndefOr[Double] = js.native
  var yd: js.UndefOr[Double] = js.native
}

object PrecisionOptions {
  @scala.inline
  def apply(): PrecisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecisionOptions]
  }
  @scala.inline
  implicit class PrecisionOptionsOps[Self <: PrecisionOptions] (val x: Self) extends AnyVal {
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
    def setAc(value: Double): Self = this.set("ac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAc: Self = this.set("ac", js.undefined)
    @scala.inline
    def setFt(value: Double): Self = this.set("ft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFt: Self = this.set("ft", js.undefined)
    @scala.inline
    def setHa(value: Double): Self = this.set("ha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHa: Self = this.set("ha", js.undefined)
    @scala.inline
    def setKm(value: Double): Self = this.set("km", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKm: Self = this.set("km", js.undefined)
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMi(value: Double): Self = this.set("mi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMi: Self = this.set("mi", js.undefined)
    @scala.inline
    def setNm(value: Double): Self = this.set("nm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNm: Self = this.set("nm", js.undefined)
    @scala.inline
    def setYd(value: Double): Self = this.set("yd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYd: Self = this.set("yd", js.undefined)
  }
  
}

