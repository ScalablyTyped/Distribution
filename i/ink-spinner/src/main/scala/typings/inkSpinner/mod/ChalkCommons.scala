package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import typings.chalk.mod.Instance
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ink-spinner.ink-spinner.Omit<chalk.chalk.Chalk, keyof ink-spinner.ink-spinner.ChalkColorModels | keyof ink-spinner.ink-spinner.ChalkKeywordsAndHexes | 'constructor' | 'level' | 'enabled'> */
trait ChalkCommons extends js.Object {
  var Instance: typings.chalk.mod.Instance
  var ansi: js.Function1[/* code */ Double, Chalk]
  var ansi256: js.Function1[/* index */ Double, Chalk]
  var bgAnsi: js.Function1[/* code */ Double, Chalk]
  var bgAnsi256: js.Function1[/* index */ Double, Chalk]
  var bgBlack: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgBlackBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgBlue: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgBlueBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgCyan: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgCyanBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgGray: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgGreen: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgGreenBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgGrey: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgMagenta: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgMagentaBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgRed: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgRedBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgWhite: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgWhiteBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgYellow: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bgYellowBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var black: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var blackBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var blue: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var blueBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var bold: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var cyan: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var cyanBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var dim: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var gray: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var green: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var greenBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var grey: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var hidden: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var inverse: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var italic: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var magenta: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var magentaBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var red: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var redBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var reset: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var strikethrough: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var underline: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var visible: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var white: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var whiteBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var yellow: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
  var yellowBright: js.Function2[/* text */ TemplateStringsArray, /* repeated */ js.Any, String]
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
}

