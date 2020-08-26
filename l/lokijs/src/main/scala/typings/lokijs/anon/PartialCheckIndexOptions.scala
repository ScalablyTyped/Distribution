package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.CheckIndexOptions> */
@js.native
trait PartialCheckIndexOptions extends js.Object {
  var randomSampling: js.UndefOr[Boolean] = js.native
  var randomSamplingFactor: js.UndefOr[Double] = js.native
  var repair: js.UndefOr[Boolean] = js.native
}

object PartialCheckIndexOptions {
  @scala.inline
  def apply(): PartialCheckIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckIndexOptions]
  }
  @scala.inline
  implicit class PartialCheckIndexOptionsOps[Self <: PartialCheckIndexOptions] (val x: Self) extends AnyVal {
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
    def setRandomSampling(value: Boolean): Self = this.set("randomSampling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomSampling: Self = this.set("randomSampling", js.undefined)
    @scala.inline
    def setRandomSamplingFactor(value: Double): Self = this.set("randomSamplingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomSamplingFactor: Self = this.set("randomSamplingFactor", js.undefined)
    @scala.inline
    def setRepair(value: Boolean): Self = this.set("repair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepair: Self = this.set("repair", js.undefined)
  }
  
}

