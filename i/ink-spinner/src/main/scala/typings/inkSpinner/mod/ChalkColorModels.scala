package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chalk.chalk.Chalk, 'rgb' | 'hsl' | 'hsv' | 'hwb' | 'bgRgb' | 'bgHsl' | 'bgHsv' | 'bgHwb'> */
@js.native
trait ChalkColorModels extends js.Object {
  var bgHsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk] = js.native
  var bgHsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk] = js.native
  var bgHwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk] = js.native
  var bgRgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk] = js.native
  var hsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk] = js.native
  var hsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk] = js.native
  var hwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk] = js.native
  var rgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk] = js.native
}

object ChalkColorModels {
  @scala.inline
  def apply(
    bgHsl: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk,
    bgHsv: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk,
    bgHwb: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk,
    bgRgb: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk,
    hsl: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk,
    hsv: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk,
    hwb: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk,
    rgb: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk
  ): ChalkColorModels = {
    val __obj = js.Dynamic.literal(bgHsl = js.Any.fromFunction3(bgHsl), bgHsv = js.Any.fromFunction3(bgHsv), bgHwb = js.Any.fromFunction3(bgHwb), bgRgb = js.Any.fromFunction3(bgRgb), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), rgb = js.Any.fromFunction3(rgb))
    __obj.asInstanceOf[ChalkColorModels]
  }
  @scala.inline
  implicit class ChalkColorModelsOps[Self <: ChalkColorModels] (val x: Self) extends AnyVal {
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
    def setBgHsl(value: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk): Self = this.set("bgHsl", js.Any.fromFunction3(value))
    @scala.inline
    def setBgHsv(value: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk): Self = this.set("bgHsv", js.Any.fromFunction3(value))
    @scala.inline
    def setBgHwb(value: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk): Self = this.set("bgHwb", js.Any.fromFunction3(value))
    @scala.inline
    def setBgRgb(value: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk): Self = this.set("bgRgb", js.Any.fromFunction3(value))
    @scala.inline
    def setHsl(value: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk): Self = this.set("hsl", js.Any.fromFunction3(value))
    @scala.inline
    def setHsv(value: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk): Self = this.set("hsv", js.Any.fromFunction3(value))
    @scala.inline
    def setHwb(value: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk): Self = this.set("hwb", js.Any.fromFunction3(value))
    @scala.inline
    def setRgb(value: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk): Self = this.set("rgb", js.Any.fromFunction3(value))
  }
  
}

