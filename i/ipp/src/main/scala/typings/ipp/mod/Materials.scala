package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Materials extends js.Object {
  var `material-amount`: js.UndefOr[Double] = js.native
  var `material-amount-units`: js.UndefOr[MaterialAmountUnits] = js.native
  var `material-color`: js.UndefOr[String] = js.native
  var `material-diameter`: js.UndefOr[Double] = js.native
  var `material-diameter-tolerance`: js.UndefOr[Double] = js.native
  var `material-fill-density`: js.UndefOr[Double] = js.native
  var `material-key`: js.UndefOr[String] = js.native
  var `material-name`: js.UndefOr[String] = js.native
  var `material-nozzle-diameter`: js.UndefOr[Double] = js.native
  var `material-purpose`: js.UndefOr[js.Array[MaterialPurpose]] = js.native
  var `material-rate`: js.UndefOr[Double] = js.native
  var `material-rate-units`: js.UndefOr[MaterialRateUnits] = js.native
  var `material-retraction`: js.UndefOr[Boolean] = js.native
  var `material-shell-thickness`: js.UndefOr[Double] = js.native
  var `material-temperature`: js.UndefOr[Double] = js.native
  var `material-type`: js.UndefOr[MaterialType] = js.native
}

object Materials {
  @scala.inline
  def apply(): Materials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Materials]
  }
  @scala.inline
  implicit class MaterialsOps[Self <: Materials] (val x: Self) extends AnyVal {
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
    def `setMaterial-amount`(value: Double): Self = this.set("material-amount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-amount`: Self = this.set("material-amount", js.undefined)
    @scala.inline
    def `setMaterial-amount-units`(value: MaterialAmountUnits): Self = this.set("material-amount-units", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-amount-units`: Self = this.set("material-amount-units", js.undefined)
    @scala.inline
    def `setMaterial-color`(value: String): Self = this.set("material-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-color`: Self = this.set("material-color", js.undefined)
    @scala.inline
    def `setMaterial-diameter`(value: Double): Self = this.set("material-diameter", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-diameter`: Self = this.set("material-diameter", js.undefined)
    @scala.inline
    def `setMaterial-diameter-tolerance`(value: Double): Self = this.set("material-diameter-tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-diameter-tolerance`: Self = this.set("material-diameter-tolerance", js.undefined)
    @scala.inline
    def `setMaterial-fill-density`(value: Double): Self = this.set("material-fill-density", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-fill-density`: Self = this.set("material-fill-density", js.undefined)
    @scala.inline
    def `setMaterial-key`(value: String): Self = this.set("material-key", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-key`: Self = this.set("material-key", js.undefined)
    @scala.inline
    def `setMaterial-name`(value: String): Self = this.set("material-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-name`: Self = this.set("material-name", js.undefined)
    @scala.inline
    def `setMaterial-nozzle-diameter`(value: Double): Self = this.set("material-nozzle-diameter", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-nozzle-diameter`: Self = this.set("material-nozzle-diameter", js.undefined)
    @scala.inline
    def `setMaterial-purposeVarargs`(value: MaterialPurpose*): Self = this.set("material-purpose", js.Array(value :_*))
    @scala.inline
    def `setMaterial-purpose`(value: js.Array[MaterialPurpose]): Self = this.set("material-purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-purpose`: Self = this.set("material-purpose", js.undefined)
    @scala.inline
    def `setMaterial-rate`(value: Double): Self = this.set("material-rate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-rate`: Self = this.set("material-rate", js.undefined)
    @scala.inline
    def `setMaterial-rate-units`(value: MaterialRateUnits): Self = this.set("material-rate-units", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-rate-units`: Self = this.set("material-rate-units", js.undefined)
    @scala.inline
    def `setMaterial-retraction`(value: Boolean): Self = this.set("material-retraction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-retraction`: Self = this.set("material-retraction", js.undefined)
    @scala.inline
    def `setMaterial-shell-thickness`(value: Double): Self = this.set("material-shell-thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-shell-thickness`: Self = this.set("material-shell-thickness", js.undefined)
    @scala.inline
    def `setMaterial-temperature`(value: Double): Self = this.set("material-temperature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-temperature`: Self = this.set("material-temperature", js.undefined)
    @scala.inline
    def `setMaterial-type`(value: MaterialType): Self = this.set("material-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMaterial-type`: Self = this.set("material-type", js.undefined)
  }
  
}

