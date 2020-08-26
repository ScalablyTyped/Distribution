package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import typings.chalk.mod.Instance
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ink-spinner.ink-spinner.Omit<chalk.chalk.Chalk, keyof ink-spinner.ink-spinner.ChalkColorModels | keyof ink-spinner.ink-spinner.ChalkKeywordsAndHexes | 'constructor' | 'level' | 'enabled'> */
@js.native
trait ChalkCommons extends js.Object {
  var Instance: typings.chalk.mod.Instance = js.native
  var ansi: js.Function1[/* code */ Double, Chalk] = js.native
  var ansi256: js.Function1[/* index */ Double, Chalk] = js.native
  var bgAnsi: js.Function1[/* code */ Double, Chalk] = js.native
  var bgAnsi256: js.Function1[/* index */ Double, Chalk] = js.native
  var bgBlack: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgBlackBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgBlue: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgBlueBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgCyan: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgCyanBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgGray: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgGreen: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgGreenBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgGrey: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgMagenta: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgMagentaBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgRed: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgRedBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgWhite: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgWhiteBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgYellow: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bgYellowBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var black: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var blackBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var blue: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var blueBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var bold: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var cyan: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var cyanBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var dim: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var gray: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var green: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var greenBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var grey: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var hidden: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var inverse: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var italic: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var magenta: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var magentaBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var red: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var redBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var reset: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var strikethrough: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var underline: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var visible: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var white: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var whiteBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var yellow: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  var yellowBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
}

object ChalkCommons {
  @scala.inline
  def apply(
    Instance: Instance,
    ansi: /* code */ Double => Chalk,
    ansi256: /* index */ Double => Chalk,
    bgAnsi: /* code */ Double => Chalk,
    bgAnsi256: /* index */ Double => Chalk,
    bgBlack: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgBlackBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgBlue: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgBlueBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgCyan: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgCyanBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgGray: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgGreen: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgGreenBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgGrey: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgMagenta: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgMagentaBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgRed: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgRedBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgWhite: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgWhiteBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgYellow: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bgYellowBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    black: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    blackBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    blue: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    blueBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    bold: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    cyan: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    cyanBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    dim: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    gray: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    green: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    greenBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    grey: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    hidden: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    inverse: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    italic: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    magenta: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    magentaBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    red: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    redBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    reset: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    strikethrough: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    underline: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    visible: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    white: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    whiteBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    yellow: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String,
    yellowBright: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String
  ): ChalkCommons = {
    val __obj = js.Dynamic.literal(Instance = Instance.asInstanceOf[js.Any], ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), bgAnsi = js.Any.fromFunction1(bgAnsi), bgAnsi256 = js.Any.fromFunction1(bgAnsi256), bgBlack = js.Any.fromFunction2(bgBlack), bgBlackBright = js.Any.fromFunction2(bgBlackBright), bgBlue = js.Any.fromFunction2(bgBlue), bgBlueBright = js.Any.fromFunction2(bgBlueBright), bgCyan = js.Any.fromFunction2(bgCyan), bgCyanBright = js.Any.fromFunction2(bgCyanBright), bgGray = js.Any.fromFunction2(bgGray), bgGreen = js.Any.fromFunction2(bgGreen), bgGreenBright = js.Any.fromFunction2(bgGreenBright), bgGrey = js.Any.fromFunction2(bgGrey), bgMagenta = js.Any.fromFunction2(bgMagenta), bgMagentaBright = js.Any.fromFunction2(bgMagentaBright), bgRed = js.Any.fromFunction2(bgRed), bgRedBright = js.Any.fromFunction2(bgRedBright), bgWhite = js.Any.fromFunction2(bgWhite), bgWhiteBright = js.Any.fromFunction2(bgWhiteBright), bgYellow = js.Any.fromFunction2(bgYellow), bgYellowBright = js.Any.fromFunction2(bgYellowBright), black = js.Any.fromFunction2(black), blackBright = js.Any.fromFunction2(blackBright), blue = js.Any.fromFunction2(blue), blueBright = js.Any.fromFunction2(blueBright), bold = js.Any.fromFunction2(bold), cyan = js.Any.fromFunction2(cyan), cyanBright = js.Any.fromFunction2(cyanBright), dim = js.Any.fromFunction2(dim), gray = js.Any.fromFunction2(gray), green = js.Any.fromFunction2(green), greenBright = js.Any.fromFunction2(greenBright), grey = js.Any.fromFunction2(grey), hidden = js.Any.fromFunction2(hidden), inverse = js.Any.fromFunction2(inverse), italic = js.Any.fromFunction2(italic), magenta = js.Any.fromFunction2(magenta), magentaBright = js.Any.fromFunction2(magentaBright), red = js.Any.fromFunction2(red), redBright = js.Any.fromFunction2(redBright), reset = js.Any.fromFunction2(reset), strikethrough = js.Any.fromFunction2(strikethrough), underline = js.Any.fromFunction2(underline), visible = js.Any.fromFunction2(visible), white = js.Any.fromFunction2(white), whiteBright = js.Any.fromFunction2(whiteBright), yellow = js.Any.fromFunction2(yellow), yellowBright = js.Any.fromFunction2(yellowBright))
    __obj.asInstanceOf[ChalkCommons]
  }
  @scala.inline
  implicit class ChalkCommonsOps[Self <: ChalkCommons] (val x: Self) extends AnyVal {
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
    def setInstance(value: Instance): Self = this.set("Instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnsi(value: /* code */ Double => Chalk): Self = this.set("ansi", js.Any.fromFunction1(value))
    @scala.inline
    def setAnsi256(value: /* index */ Double => Chalk): Self = this.set("ansi256", js.Any.fromFunction1(value))
    @scala.inline
    def setBgAnsi(value: /* code */ Double => Chalk): Self = this.set("bgAnsi", js.Any.fromFunction1(value))
    @scala.inline
    def setBgAnsi256(value: /* index */ Double => Chalk): Self = this.set("bgAnsi256", js.Any.fromFunction1(value))
    @scala.inline
    def setBgBlack(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgBlack", js.Any.fromFunction2(value))
    @scala.inline
    def setBgBlackBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgBlackBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgBlue(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgBlue", js.Any.fromFunction2(value))
    @scala.inline
    def setBgBlueBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgBlueBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgCyan(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgCyan", js.Any.fromFunction2(value))
    @scala.inline
    def setBgCyanBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgCyanBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgGray(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgGray", js.Any.fromFunction2(value))
    @scala.inline
    def setBgGreen(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgGreen", js.Any.fromFunction2(value))
    @scala.inline
    def setBgGreenBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgGreenBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgGrey(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgGrey", js.Any.fromFunction2(value))
    @scala.inline
    def setBgMagenta(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgMagenta", js.Any.fromFunction2(value))
    @scala.inline
    def setBgMagentaBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgMagentaBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgRed(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgRed", js.Any.fromFunction2(value))
    @scala.inline
    def setBgRedBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgRedBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgWhite(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgWhite", js.Any.fromFunction2(value))
    @scala.inline
    def setBgWhiteBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgWhiteBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBgYellow(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgYellow", js.Any.fromFunction2(value))
    @scala.inline
    def setBgYellowBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bgYellowBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBlack(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("black", js.Any.fromFunction2(value))
    @scala.inline
    def setBlackBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("blackBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBlue(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("blue", js.Any.fromFunction2(value))
    @scala.inline
    def setBlueBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("blueBright", js.Any.fromFunction2(value))
    @scala.inline
    def setBold(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("bold", js.Any.fromFunction2(value))
    @scala.inline
    def setCyan(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("cyan", js.Any.fromFunction2(value))
    @scala.inline
    def setCyanBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("cyanBright", js.Any.fromFunction2(value))
    @scala.inline
    def setDim(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("dim", js.Any.fromFunction2(value))
    @scala.inline
    def setGray(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("gray", js.Any.fromFunction2(value))
    @scala.inline
    def setGreen(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("green", js.Any.fromFunction2(value))
    @scala.inline
    def setGreenBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("greenBright", js.Any.fromFunction2(value))
    @scala.inline
    def setGrey(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("grey", js.Any.fromFunction2(value))
    @scala.inline
    def setHidden(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("hidden", js.Any.fromFunction2(value))
    @scala.inline
    def setInverse(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("inverse", js.Any.fromFunction2(value))
    @scala.inline
    def setItalic(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("italic", js.Any.fromFunction2(value))
    @scala.inline
    def setMagenta(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("magenta", js.Any.fromFunction2(value))
    @scala.inline
    def setMagentaBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("magentaBright", js.Any.fromFunction2(value))
    @scala.inline
    def setRed(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("red", js.Any.fromFunction2(value))
    @scala.inline
    def setRedBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("redBright", js.Any.fromFunction2(value))
    @scala.inline
    def setReset(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("reset", js.Any.fromFunction2(value))
    @scala.inline
    def setStrikethrough(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("strikethrough", js.Any.fromFunction2(value))
    @scala.inline
    def setUnderline(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("underline", js.Any.fromFunction2(value))
    @scala.inline
    def setVisible(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("visible", js.Any.fromFunction2(value))
    @scala.inline
    def setWhite(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("white", js.Any.fromFunction2(value))
    @scala.inline
    def setWhiteBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("whiteBright", js.Any.fromFunction2(value))
    @scala.inline
    def setYellow(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("yellow", js.Any.fromFunction2(value))
    @scala.inline
    def setYellowBright(value: (/* text */ TemplateStringsArray, /* repeated */ js.Any) => String): Self = this.set("yellowBright", js.Any.fromFunction2(value))
  }
  
}

