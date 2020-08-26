package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIndexOptions extends js.Object {
  var randomSampling: Boolean = js.native
  var randomSamplingFactor: Double = js.native
  var repair: Boolean = js.native
}

object CheckIndexOptions {
  @scala.inline
  def apply(randomSampling: Boolean, randomSamplingFactor: Double, repair: Boolean): CheckIndexOptions = {
    val __obj = js.Dynamic.literal(randomSampling = randomSampling.asInstanceOf[js.Any], randomSamplingFactor = randomSamplingFactor.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIndexOptions]
  }
  @scala.inline
  implicit class CheckIndexOptionsOps[Self <: CheckIndexOptions] (val x: Self) extends AnyVal {
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
    def setRandomSamplingFactor(value: Double): Self = this.set("randomSamplingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepair(value: Boolean): Self = this.set("repair", value.asInstanceOf[js.Any])
  }
  
}

