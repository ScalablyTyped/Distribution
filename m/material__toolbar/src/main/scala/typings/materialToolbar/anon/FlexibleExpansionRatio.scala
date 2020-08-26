package typings.materialToolbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexibleExpansionRatio extends js.Object {
  var flexibleExpansionRatio: Double = js.native
}

object FlexibleExpansionRatio {
  @scala.inline
  def apply(flexibleExpansionRatio: Double): FlexibleExpansionRatio = {
    val __obj = js.Dynamic.literal(flexibleExpansionRatio = flexibleExpansionRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexibleExpansionRatio]
  }
  @scala.inline
  implicit class FlexibleExpansionRatioOps[Self <: FlexibleExpansionRatio] (val x: Self) extends AnyVal {
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
    def setFlexibleExpansionRatio(value: Double): Self = this.set("flexibleExpansionRatio", value.asInstanceOf[js.Any])
  }
  
}

