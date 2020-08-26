package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var active: js.UndefOr[`6`] = js.native
  var animation: js.UndefOr[Jiggle] = js.native
  var borderSize: js.UndefOr[Medium] = js.native
  var breakpoints: js.UndefOr[Dictx] = js.native
  var colors: js.UndefOr[typings.grommet.baseMod.Colors] = js.native
  var control: js.UndefOr[BorderDisabled] = js.native
  var debounceDelay: js.UndefOr[Double] = js.native
  var deviceBreakpoints: js.UndefOr[Computer] = js.native
  var drop: js.UndefOr[ShadowSize] = js.native
  var edgeSize: js.UndefOr[Hair] = js.native
  var elevation: js.UndefOr[DarkLight] = js.native
  var focus: js.UndefOr[Outline] = js.native
  var font: js.UndefOr[Face] = js.native
  var graph: js.UndefOr[`7`] = js.native
  var hover: js.UndefOr[BackgroundColor] = js.native
  var input: js.UndefOr[Padding] = js.native
  var opacity: js.UndefOr[Strong] = js.native
  var selected: js.UndefOr[BackgroundColor] = js.native
  var size: js.UndefOr[Full] = js.native
  var spacing: js.UndefOr[String] = js.native
}

object Animation {
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
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
    def setActive(value: `6`): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAnimation(value: Jiggle): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBorderSize(value: Medium): Self = this.set("borderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSize: Self = this.set("borderSize", js.undefined)
    @scala.inline
    def setBreakpoints(value: Dictx): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setColors(value: typings.grommet.baseMod.Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setControl(value: BorderDisabled): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setDebounceDelay(value: Double): Self = this.set("debounceDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceDelay: Self = this.set("debounceDelay", js.undefined)
    @scala.inline
    def setDeviceBreakpoints(value: Computer): Self = this.set("deviceBreakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceBreakpoints: Self = this.set("deviceBreakpoints", js.undefined)
    @scala.inline
    def setDrop(value: ShadowSize): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setEdgeSize(value: Hair): Self = this.set("edgeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeSize: Self = this.set("edgeSize", js.undefined)
    @scala.inline
    def setElevation(value: DarkLight): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def setFocus(value: Outline): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFont(value: Face): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGraph(value: `7`): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraph: Self = this.set("graph", js.undefined)
    @scala.inline
    def setHover(value: BackgroundColor): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setInput(value: Padding): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOpacity(value: Strong): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSelected(value: BackgroundColor): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSize(value: Full): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpacing(value: String): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
  
}

