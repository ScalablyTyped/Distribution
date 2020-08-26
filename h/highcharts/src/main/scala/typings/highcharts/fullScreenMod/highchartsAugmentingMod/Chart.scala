package typings.highcharts.fullScreenMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chart extends js.Object {
  var fullscreen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fullscreen */ js.Any = js.native
}

object Chart {
  @scala.inline
  def apply(
    fullscreen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fullscreen */ js.Any
  ): Chart = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  @scala.inline
  implicit class ChartOps[Self <: Chart] (val x: Self) extends AnyVal {
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
    def setFullscreen(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fullscreen */ js.Any
    ): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
  }
  
}

