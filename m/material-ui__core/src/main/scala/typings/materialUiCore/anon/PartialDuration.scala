package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Duration> */
@js.native
trait PartialDuration extends js.Object {
  var complex: js.UndefOr[Double] = js.native
  var enteringScreen: js.UndefOr[Double] = js.native
  var leavingScreen: js.UndefOr[Double] = js.native
  var short: js.UndefOr[Double] = js.native
  var shorter: js.UndefOr[Double] = js.native
  var shortest: js.UndefOr[Double] = js.native
  var standard: js.UndefOr[Double] = js.native
}

object PartialDuration {
  @scala.inline
  def apply(): PartialDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDuration]
  }
  @scala.inline
  implicit class PartialDurationOps[Self <: PartialDuration] (val x: Self) extends AnyVal {
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
    def setComplex(value: Double): Self = this.set("complex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplex: Self = this.set("complex", js.undefined)
    @scala.inline
    def setEnteringScreen(value: Double): Self = this.set("enteringScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnteringScreen: Self = this.set("enteringScreen", js.undefined)
    @scala.inline
    def setLeavingScreen(value: Double): Self = this.set("leavingScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeavingScreen: Self = this.set("leavingScreen", js.undefined)
    @scala.inline
    def setShort(value: Double): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
    @scala.inline
    def setShorter(value: Double): Self = this.set("shorter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShorter: Self = this.set("shorter", js.undefined)
    @scala.inline
    def setShortest(value: Double): Self = this.set("shortest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortest: Self = this.set("shortest", js.undefined)
    @scala.inline
    def setStandard(value: Double): Self = this.set("standard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
  
}

