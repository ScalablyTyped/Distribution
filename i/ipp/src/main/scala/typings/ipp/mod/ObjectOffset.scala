package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectOffset extends js.Object {
  var `x-offset`: js.UndefOr[Double] = js.native
  var `y-offset`: js.UndefOr[Double] = js.native
  var `z-offset`: js.UndefOr[Double] = js.native
}

object ObjectOffset {
  @scala.inline
  def apply(): ObjectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOffset]
  }
  @scala.inline
  implicit class ObjectOffsetOps[Self <: ObjectOffset] (val x: Self) extends AnyVal {
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
    def `setX-offset`(value: Double): Self = this.set("x-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-offset`: Self = this.set("x-offset", js.undefined)
    @scala.inline
    def `setY-offset`(value: Double): Self = this.set("y-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteY-offset`: Self = this.set("y-offset", js.undefined)
    @scala.inline
    def `setZ-offset`(value: Double): Self = this.set("z-offset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteZ-offset`: Self = this.set("z-offset", js.undefined)
  }
  
}

