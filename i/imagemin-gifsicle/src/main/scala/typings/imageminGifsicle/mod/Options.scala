package typings.imageminGifsicle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var colors: js.UndefOr[Double] = js.native
  var interlaced: js.UndefOr[Boolean] = js.native
  var optimizationLevel: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setColors(value: Double): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setInterlaced(value: Boolean): Self = this.set("interlaced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterlaced: Self = this.set("interlaced", js.undefined)
    @scala.inline
    def setOptimizationLevel(value: Double): Self = this.set("optimizationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizationLevel: Self = this.set("optimizationLevel", js.undefined)
  }
  
}

