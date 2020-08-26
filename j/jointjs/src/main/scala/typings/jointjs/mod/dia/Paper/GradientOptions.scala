package typings.jointjs.mod.dia.Paper

import typings.jointjs.anon.Color
import typings.jointjs.jointjsStrings.linearGradient
import typings.jointjs.jointjsStrings.radialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientOptions extends js.Object {
  var id: js.UndefOr[String] = js.native
  var stops: js.Array[Color] = js.native
  var `type`: linearGradient | radialGradient = js.native
}

object GradientOptions {
  @scala.inline
  def apply(stops: js.Array[Color], `type`: linearGradient | radialGradient): GradientOptions = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientOptions]
  }
  @scala.inline
  implicit class GradientOptionsOps[Self <: GradientOptions] (val x: Self) extends AnyVal {
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
    def setStopsVarargs(value: Color*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[Color]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: linearGradient | radialGradient): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

