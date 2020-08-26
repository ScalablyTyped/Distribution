package typings.gyronorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Absolute extends js.Object {
  var absolute: Double = js.native
  var alpha: Double = js.native
  var beta: Double = js.native
  var gamma: Double = js.native
}

object Absolute {
  @scala.inline
  def apply(absolute: Double, alpha: Double, beta: Double, gamma: Double): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  @scala.inline
  implicit class AbsoluteOps[Self <: Absolute] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: Double): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
  }
  
}

