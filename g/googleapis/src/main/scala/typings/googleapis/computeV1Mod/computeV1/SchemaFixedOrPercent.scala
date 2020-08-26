package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates numeric value that can be either absolute or relative.
  */
@js.native
trait SchemaFixedOrPercent extends js.Object {
  /**
    * [Output Only] Absolute value of VM instances calculated based on the
    * specific mode.    - If the value is fixed, then the caculated value is
    * equal to the fixed value.  - If the value is a percent, then the
    * calculated value is percent/100 * targetSize. For example, the calculated
    * value of a 80% of a managed instance group with 150 instances would be
    * (80/100 * 150) = 120 VM instances. If there is a remainder, the number is
    * rounded up.
    */
  var calculated: js.UndefOr[Double] = js.native
  /**
    * Specifies a fixed number of VM instances. This must be a positive
    * integer.
    */
  var fixed: js.UndefOr[Double] = js.native
  /**
    * Specifies a percentage of instances between 0 to 100%, inclusive. For
    * example, specify 80 for 80%.
    */
  var percent: js.UndefOr[Double] = js.native
}

object SchemaFixedOrPercent {
  @scala.inline
  def apply(): SchemaFixedOrPercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixedOrPercent]
  }
  @scala.inline
  implicit class SchemaFixedOrPercentOps[Self <: SchemaFixedOrPercent] (val x: Self) extends AnyVal {
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
    def setCalculated(value: Double): Self = this.set("calculated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculated: Self = this.set("calculated", js.undefined)
    @scala.inline
    def setFixed(value: Double): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
  }
  
}

