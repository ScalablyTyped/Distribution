package typings.gyronorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: Double = js.native
  var beta: Double = js.native
  var gamma: Double = js.native
  var gx: Double = js.native
  var gy: Double = js.native
  var gz: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

object Alpha {
  @scala.inline
  def apply(
    alpha: Double,
    beta: Double,
    gamma: Double,
    gx: Double,
    gy: Double,
    gz: Double,
    x: Double,
    y: Double,
    z: Double
  ): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], gx = gx.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any], gz = gz.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def setGx(value: Double): Self = this.set("gx", value.asInstanceOf[js.Any])
    @scala.inline
    def setGy(value: Double): Self = this.set("gy", value.asInstanceOf[js.Any])
    @scala.inline
    def setGz(value: Double): Self = this.set("gz", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}

