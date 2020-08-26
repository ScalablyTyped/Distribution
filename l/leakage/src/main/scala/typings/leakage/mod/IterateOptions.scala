package typings.leakage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterateOptions extends js.Object {
  var gcollections: js.UndefOr[Double] = js.native
  var iterations: js.UndefOr[Double] = js.native
}

object IterateOptions {
  @scala.inline
  def apply(): IterateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterateOptions]
  }
  @scala.inline
  implicit class IterateOptionsOps[Self <: IterateOptions] (val x: Self) extends AnyVal {
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
    def setGcollections(value: Double): Self = this.set("gcollections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcollections: Self = this.set("gcollections", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
  }
  
}

