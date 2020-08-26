package typings.jimpPluginThreshold.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoGreyscale extends js.Object {
  var autoGreyscale: js.UndefOr[Boolean] = js.native
  var max: Double = js.native
  var replace: js.UndefOr[Double] = js.native
}

object AutoGreyscale {
  @scala.inline
  def apply(max: Double): AutoGreyscale = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoGreyscale]
  }
  @scala.inline
  implicit class AutoGreyscaleOps[Self <: AutoGreyscale] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoGreyscale(value: Boolean): Self = this.set("autoGreyscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGreyscale: Self = this.set("autoGreyscale", js.undefined)
    @scala.inline
    def setReplace(value: Double): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

