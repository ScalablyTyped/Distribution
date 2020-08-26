package typings.ink.colorMod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined type-fest.type-fest.Except<type-fest.type-fest.Except<chalk.chalk.Chalk, 'Instance' | 'level'>, ink.ink/build/components/Color.Colors> */
@js.native
trait ChalkFunctions extends js.Object {
  var ansi: js.Function1[/* code */ Double, Chalk] = js.native
  var ansi256: js.Function1[/* index */ Double, Chalk] = js.native
  var bgAnsi: js.Function1[/* code */ Double, Chalk] = js.native
  var bgAnsi256: js.Function1[/* index */ Double, Chalk] = js.native
  var bgHex: js.Function1[/* color */ String, Chalk] = js.native
  var bgHsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk] = js.native
  var bgHsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk] = js.native
  var bgHwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk] = js.native
  var bgKeyword: js.Function1[/* color */ String, Chalk] = js.native
  var bgRgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk] = js.native
  var hex: js.Function1[/* color */ String, Chalk] = js.native
  var hsl: js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk] = js.native
  var hsv: js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk] = js.native
  var hwb: js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk] = js.native
  var keyword: js.Function1[/* color */ String, Chalk] = js.native
  var rgb: js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk] = js.native
}

object ChalkFunctions {
  @scala.inline
  def apply(
    ansi: /* code */ Double => Chalk,
    ansi256: /* index */ Double => Chalk,
    bgAnsi: /* code */ Double => Chalk,
    bgAnsi256: /* index */ Double => Chalk,
    bgHex: /* color */ String => Chalk,
    bgHsl: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk,
    bgHsv: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk,
    bgHwb: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk,
    bgKeyword: /* color */ String => Chalk,
    bgRgb: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk,
    hex: /* color */ String => Chalk,
    hsl: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk,
    hsv: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk,
    hwb: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk,
    keyword: /* color */ String => Chalk,
    rgb: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk
  ): ChalkFunctions = {
    val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), bgAnsi = js.Any.fromFunction1(bgAnsi), bgAnsi256 = js.Any.fromFunction1(bgAnsi256), bgHex = js.Any.fromFunction1(bgHex), bgHsl = js.Any.fromFunction3(bgHsl), bgHsv = js.Any.fromFunction3(bgHsv), bgHwb = js.Any.fromFunction3(bgHwb), bgKeyword = js.Any.fromFunction1(bgKeyword), bgRgb = js.Any.fromFunction3(bgRgb), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), keyword = js.Any.fromFunction1(keyword), rgb = js.Any.fromFunction3(rgb))
    __obj.asInstanceOf[ChalkFunctions]
  }
  @scala.inline
  implicit class ChalkFunctionsOps[Self <: ChalkFunctions] (val x: Self) extends AnyVal {
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
    def setAnsi(value: /* code */ Double => Chalk): Self = this.set("ansi", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: /* index */ Double => Chalk): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setBgAnsi(value: /* code */ Double => Chalk): Self = this.set("bgAnsi", js.Any.fromFunction1(value))
    @scala.inline
    def setBgAnsi256(value: /* index */ Double => Chalk): Self = this.set("bgAnsi256", js.Any.fromFunction1(value))
    @scala.inline
    def setBgHex(value: /* color */ String => Chalk): Self = this.set("bgHex", js.Any.fromFunction1(value))
    @scala.inline
    def setBgHsl(value: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk): Self = this.set("bgHsl", js.Any.fromFunction3(value))
    @scala.inline
    def setBgHsv(value: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk): Self = this.set("bgHsv", js.Any.fromFunction3(value))
    @scala.inline
    def setBgHwb(value: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk): Self = this.set("bgHwb", js.Any.fromFunction3(value))
    @scala.inline
    def setBgKeyword(value: /* color */ String => Chalk): Self = this.set("bgKeyword", js.Any.fromFunction1(value))
    @scala.inline
    def setBgRgb(value: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk): Self = this.set("bgRgb", js.Any.fromFunction3(value))
    @scala.inline
    def setHex(value: /* color */ String => Chalk): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsl(value: (/* hue */ Double, /* saturation */ Double, /* lightness */ Double) => Chalk): Self = this.set("hsl", js.Any.fromFunction3(value))
    @scala.inline
    def setHsv(value: (/* hue */ Double, /* saturation */ Double, /* value */ Double) => Chalk): Self = this.set("hsv", js.Any.fromFunction3(value))
    @scala.inline
    def setHwb(value: (/* hue */ Double, /* whiteness */ Double, /* blackness */ Double) => Chalk): Self = this.set("hwb", js.Any.fromFunction3(value))
    @scala.inline
    def setKeyword(value: /* color */ String => Chalk): Self = this.set("keyword", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: (/* red */ Double, /* green */ Double, /* blue */ Double) => Chalk): Self = this.set("rgb", js.Any.fromFunction3(value))
  }
  
}

