package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chalk.chalk.Chalk, 'rgb' | 'hsl' | 'hsv' | 'hwb' | 'bgRgb' | 'bgHsl' | 'bgHsv' | 'bgHwb'> */
trait ChalkColorModels extends js.Object {
  var bgHsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
  var bgHsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
  var bgHwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
  var bgRgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]
  var hsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
  var hsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
  var hwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
  var rgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]
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
}

