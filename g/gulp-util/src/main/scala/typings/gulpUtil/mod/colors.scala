package typings.gulpUtil.mod

import typings.chalk.ChalksupportsColorColorSu
import typings.chalk.mod.Chalk
import typings.chalk.mod.ColorSupport
import typings.chalk.mod.Level
import typings.gulpUtil.gulpUtilBooleans.`false`
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-util", "colors")
@js.native
object colors extends js.Object {
  var BackgroundColor: typings.chalk.mod.BackgroundColor = js.native
  var Color: typings.chalk.mod.Color = js.native
  var ForegroundColor: typings.chalk.mod.ForegroundColor = js.native
  /**
  		Return a new Chalk instance.
  		*/
  var Instance: typings.chalk.mod.Instance = js.native
  var Level: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LevelEnum */ js.Any = js.native
  var Modifiers: typings.chalk.mod.Modifiers = js.native
  @JSName("bgBlackBright")
  val bgBlackBright_Original: Chalk = js.native
  @JSName("bgBlack")
  val bgBlack_Original: Chalk = js.native
  @JSName("bgBlueBright")
  val bgBlueBright_Original: Chalk = js.native
  @JSName("bgBlue")
  val bgBlue_Original: Chalk = js.native
  @JSName("bgCyanBright")
  val bgCyanBright_Original: Chalk = js.native
  @JSName("bgCyan")
  val bgCyan_Original: Chalk = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSName("bgGray")
  val bgGray_Original: Chalk = js.native
  @JSName("bgGreenBright")
  val bgGreenBright_Original: Chalk = js.native
  @JSName("bgGreen")
  val bgGreen_Original: Chalk = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  @JSName("bgGrey")
  val bgGrey_Original: Chalk = js.native
  @JSName("bgMagentaBright")
  val bgMagentaBright_Original: Chalk = js.native
  @JSName("bgMagenta")
  val bgMagenta_Original: Chalk = js.native
  @JSName("bgRedBright")
  val bgRedBright_Original: Chalk = js.native
  @JSName("bgRed")
  val bgRed_Original: Chalk = js.native
  @JSName("bgWhiteBright")
  val bgWhiteBright_Original: Chalk = js.native
  @JSName("bgWhite")
  val bgWhite_Original: Chalk = js.native
  @JSName("bgYellowBright")
  val bgYellowBright_Original: Chalk = js.native
  @JSName("bgYellow")
  val bgYellow_Original: Chalk = js.native
  @JSName("blackBright")
  val blackBright_Original: Chalk = js.native
  @JSName("black")
  val black_Original: Chalk = js.native
  @JSName("blueBright")
  val blueBright_Original: Chalk = js.native
  @JSName("blue")
  val blue_Original: Chalk = js.native
  /**
  		Modifier: Make text bold.
  		*/
  @JSName("bold")
  val bold_Original: Chalk = js.native
  @JSName("cyanBright")
  val cyanBright_Original: Chalk = js.native
  @JSName("cyan")
  val cyan_Original: Chalk = js.native
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  @JSName("dim")
  val dim_Original: Chalk = js.native
  /*
  		Alias for `blackBright`.
  		*/
  @JSName("gray")
  val gray_Original: Chalk = js.native
  @JSName("greenBright")
  val greenBright_Original: Chalk = js.native
  @JSName("green")
  val green_Original: Chalk = js.native
  /*
  		Alias for `blackBright`.
  		*/
  @JSName("grey")
  val grey_Original: Chalk = js.native
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  @JSName("hidden")
  val hidden_Original: Chalk = js.native
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  @JSName("inverse")
  val inverse_Original: Chalk = js.native
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  @JSName("italic")
  val italic_Original: Chalk = js.native
  /**
  		The color support for Chalk.
  		By default, color support is automatically detected based on the environment.
  		*/
  var level: Level = js.native
  @JSName("magentaBright")
  val magentaBright_Original: Chalk = js.native
  @JSName("magenta")
  val magenta_Original: Chalk = js.native
  @JSName("redBright")
  val redBright_Original: Chalk = js.native
  @JSName("red")
  val red_Original: Chalk = js.native
  /**
  		Modifier: Resets the current color chain.
  		*/
  @JSName("reset")
  val reset_Original: Chalk = js.native
  @JSName("stderr")
  var stderr_Original: ChalksupportsColorColorSu = js.native
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  @JSName("strikethrough")
  val strikethrough_Original: Chalk = js.native
  var supportsColor: ColorSupport | `false` = js.native
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  @JSName("underline")
  val underline_Original: Chalk = js.native
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  @JSName("visible")
  val visible_Original: Chalk = js.native
  @JSName("whiteBright")
  val whiteBright_Original: Chalk = js.native
  @JSName("white")
  val white_Original: Chalk = js.native
  @JSName("yellowBright")
  val yellowBright_Original: Chalk = js.native
  @JSName("yellow")
  val yellow_Original: Chalk = js.native
  def apply(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def apply(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set text color.
  		30 <= code && code < 38 || 90 <= code && code < 98
  		For example, 31 for red, 91 for redBright.
  		*/
  def ansi(code: Double): Chalk = js.native
  /**
  		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
  		*/
  def ansi256(index: Double): Chalk = js.native
  /**
  		Use a [Select/Set Graphic Rendition](https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters) (SGR) [color code number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4_bit) to set background color.
  		30 <= code && code < 38 || 90 <= code && code < 98
  		For example, 31 for red, 91 for redBright.
  		Use the foreground code, not the background code (for example, not 41, nor 101).
  		*/
  def bgAnsi(code: Double): Chalk = js.native
  /**
  		Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
  		*/
  def bgAnsi256(index: Double): Chalk = js.native
  def bgBlack(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgBlack(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgBlackBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgBlackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgBlue(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgBlue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgBlueBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgBlueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgCyan(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgCyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgCyanBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgCyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  def bgGray(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /*
  		Alias for `bgBlackBright`.
  		*/
  def bgGray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgGreen(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgGreen(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgGreenBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgGreenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /*
  		Alias for `bgBlackBright`.
  		*/
  def bgGrey(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /*
  		Alias for `bgBlackBright`.
  		*/
  def bgGrey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use HEX value to set background color.
  		@param color - Hexadecimal value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.bgHex('#DEADED');
  		```
  		*/
  def bgHex(color: String): Chalk = js.native
  /**
  		Use HSL values to set background color.
  		*/
  def bgHsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
  /**
  		Use HSV values to set background color.
  		*/
  def bgHsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
  /**
  		Use HWB values to set background color.
  		*/
  def bgHwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
  /**
  		Use keyword color value to set background color.
  		@param color - Keyword value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.bgKeyword('orange');
  		```
  		*/
  def bgKeyword(color: String): Chalk = js.native
  def bgMagenta(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgMagenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgMagentaBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgMagentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgRed(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgRed(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgRedBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgRedBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use RGB values to set background color.
  		*/
  def bgRgb(red: Double, green: Double, blue: Double): Chalk = js.native
  def bgWhite(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgWhite(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgWhiteBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgWhiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgYellow(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgYellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def bgYellowBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def bgYellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def black(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def black(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def blackBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def blackBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def blue(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def blue(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def blueBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def blueBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Make text bold.
  		*/
  def bold(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Make text bold.
  		*/
  def bold(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def cyan(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def cyan(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def cyanBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def cyanBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  def dim(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Emitting only a small amount of light.
  		*/
  def dim(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /*
  		Alias for `blackBright`.
  		*/
  def gray(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /*
  		Alias for `blackBright`.
  		*/
  def gray(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def green(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def green(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def greenBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def greenBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /*
  		Alias for `blackBright`.
  		*/
  def grey(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /*
  		Alias for `blackBright`.
  		*/
  def grey(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use HEX value to set text color.
  		@param color - Hexadecimal value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.hex('#DEADED');
  		```
  		*/
  def hex(color: String): Chalk = js.native
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  def hidden(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Prints the text, but makes it invisible.
  		*/
  def hidden(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use HSL values to set text color.
  		*/
  def hsl(hue: Double, saturation: Double, lightness: Double): Chalk = js.native
  /**
  		Use HSV values to set text color.
  		*/
  def hsv(hue: Double, saturation: Double, value: Double): Chalk = js.native
  /**
  		Use HWB values to set text color.
  		*/
  def hwb(hue: Double, whiteness: Double, blackness: Double): Chalk = js.native
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  def inverse(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Inverse background and foreground colors.
  		*/
  def inverse(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  def italic(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Make text italic. (Not widely supported)
  		*/
  def italic(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use keyword color value to set text color.
  		@param color - Keyword value representing the desired color.
  		@example
  		```
  		import chalk = require('chalk');
  		chalk.keyword('orange');
  		```
  		*/
  def keyword(color: String): Chalk = js.native
  def magenta(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def magenta(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def magentaBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def magentaBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def red(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def red(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def redBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def redBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Resets the current color chain.
  		*/
  def reset(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Resets the current color chain.
  		*/
  def reset(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Use RGB values to set text color.
  		*/
  def rgb(red: Double, green: Double, blue: Double): Chalk = js.native
  def stderr(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def stderr(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  def strikethrough(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Puts a horizontal line through the center of the text. (Not widely supported)
  		*/
  def strikethrough(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  def underline(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Make text underline. (Not widely supported)
  		*/
  def underline(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  def visible(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  /**
  		Modifier: Prints the text only when Chalk has a color support level > 0.
  		Can be useful for things that are purely cosmetic.
  		*/
  def visible(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def white(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def white(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def whiteBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def whiteBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def yellow(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def yellow(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def yellowBright(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		*/
  def yellowBright(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
}

