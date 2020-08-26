package typings.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundaryConnectionPointArguments extends StrokeConnectionPointArguments {
  var extrapolate: js.UndefOr[Boolean] = js.native
  var insideout: js.UndefOr[Boolean] = js.native
  var precision: js.UndefOr[Double] = js.native
  var selector: js.UndefOr[(js.Array[String | Double]) | String] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
}

object BoundaryConnectionPointArguments {
  @scala.inline
  def apply(): BoundaryConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundaryConnectionPointArguments]
  }
  @scala.inline
  implicit class BoundaryConnectionPointArgumentsOps[Self <: BoundaryConnectionPointArguments] (val x: Self) extends AnyVal {
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
    def setExtrapolate(value: Boolean): Self = this.set("extrapolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrapolate: Self = this.set("extrapolate", js.undefined)
    @scala.inline
    def setInsideout(value: Boolean): Self = this.set("insideout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsideout: Self = this.set("insideout", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setSelectorVarargs(value: (String | Double)*): Self = this.set("selector", js.Array(value :_*))
    @scala.inline
    def setSelector(value: (js.Array[String | Double]) | String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
  }
  
}

