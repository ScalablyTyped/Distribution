package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Spinner //////////////////////////////////////////////////
@js.native
trait SpinnerOptions extends SpinnerEvents {
  var culture: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var incremental: js.UndefOr[js.Any] = js.native
   // boolean or ()
  var max: js.UndefOr[js.Any] = js.native
   // number or string
  var min: js.UndefOr[js.Any] = js.native
   // number or string
  var numberFormat: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var step: js.UndefOr[js.Any] = js.native
}

object SpinnerOptions {
  @scala.inline
  def apply(): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerOptions]
  }
  @scala.inline
  implicit class SpinnerOptionsOps[Self <: SpinnerOptions] (val x: Self) extends AnyVal {
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
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIncremental(value: js.Any): Self = this.set("incremental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncremental: Self = this.set("incremental", js.undefined)
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setStep(value: js.Any): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

