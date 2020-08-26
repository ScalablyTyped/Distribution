package typings.layzrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayzrOptions extends js.Object {
  /**
    * Customize the attribute the normal resolution source is taken from.
    */
  var normal: js.UndefOr[String] = js.native
  /**
    * Customize the attribute the retina/high resolution source is taken from.
    */
  var retina: js.UndefOr[String] = js.native
  /**
    * Customize the attribute the source set is taken from.
    */
  var srcset: js.UndefOr[String] = js.native
  /**
    * Adjust when images load, relative to the viewport. Positive values make images load sooner, negative values make images load later.
    *
    * Threshold is a percentage of the viewport height, identical to the CSS vh unit.
    */
  var threshold: js.UndefOr[Double] = js.native
}

object LayzrOptions {
  @scala.inline
  def apply(): LayzrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayzrOptions]
  }
  @scala.inline
  implicit class LayzrOptionsOps[Self <: LayzrOptions] (val x: Self) extends AnyVal {
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
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
    @scala.inline
    def setRetina(value: String): Self = this.set("retina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetina: Self = this.set("retina", js.undefined)
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

