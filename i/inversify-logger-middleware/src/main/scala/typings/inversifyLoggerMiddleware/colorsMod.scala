package typings.inversifyLoggerMiddleware

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.chalk.mod.ChalkInstance
import typings.chalk.mod.Options
import typings.chalk.supportsColorMod.ColorInfo
import typings.chalk.supportsColorMod.ColorSupport
import typings.chalk.supportsColorMod.ColorSupportLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  object Chalk extends Shortcut {
    
    /**
    Main Chalk object that allows to chain styles together.
    Call the last one as a method with a string argument.
    Order doesn't matter, and later styles take precedent in case of a conflict.
    This simply means that `chalk.red.yellow.green` is equivalent to `chalk.green`.
    */
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.default")
    @js.native
    val default: ChalkInstance = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.Chalk")
    @js.native
    open class Chalk ()
      extends typings.chalk.mod.Chalk {
      def this(options: Options) = this()
    }
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.Chalk")
    @js.native
    val Chalk: Instantiable1[/* options */ js.UndefOr[Options], ChalkInstance] = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.chalkStderr")
    @js.native
    val chalkStderr: ChalkInstance = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.supportsColor")
    @js.native
    val supportsColor: ColorInfo = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "Chalk.supportsColorStderr")
    @js.native
    val supportsColorStderr: ColorInfo = js.native
    
    type _To = ChalkInstance
    
    /* This means you don't have to write `default`, but can instead just say `Chalk.foo` */
    override def _to: ChalkInstance = default
  }
  
  /* Inlined chalk.chalk.Chalk & {  supportsColor :chalk.chalk.ColorSupport} */
  object green {
    
    inline def apply(text: Any*): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Use an [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.ansi256(201);
    	```
    	*/
    inline def ansi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgAnsi256(201);
    	```
    	*/
    inline def bgAnsi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgAnsi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgBlack")
    @js.native
    val bgBlack: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgBlackBright")
    @js.native
    val bgBlackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgBlue")
    @js.native
    val bgBlue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgBlueBright")
    @js.native
    val bgBlueBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgCyan")
    @js.native
    val bgCyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgCyanBright")
    @js.native
    val bgCyanBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgGray")
    @js.native
    val bgGray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgGreen")
    @js.native
    val bgGreen: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgGreenBright")
    @js.native
    val bgGreenBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgGrey")
    @js.native
    val bgGrey: this.type = js.native
    
    /**
    	Use HEX value to set background color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgHex('#DEADED');
    	```
    	*/
    inline def bgHex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgHex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgMagenta")
    @js.native
    val bgMagenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgMagentaBright")
    @js.native
    val bgMagentaBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgRed")
    @js.native
    val bgRed: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgRedBright")
    @js.native
    val bgRedBright: this.type = js.native
    
    /**
    	Use RGB values to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgRgb(222, 173, 237);
    	```
    	*/
    inline def bgRgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("bgRgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgWhite")
    @js.native
    val bgWhite: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgWhiteBright")
    @js.native
    val bgWhiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgYellow")
    @js.native
    val bgYellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bgYellowBright")
    @js.native
    val bgYellowBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.black")
    @js.native
    val black: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.blackBright")
    @js.native
    val blackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.blue")
    @js.native
    val blue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.blueBright")
    @js.native
    val blueBright: this.type = js.native
    
    /**
    	Modifier: Make the text bold.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.bold")
    @js.native
    val bold: this.type = js.native
    
    inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    inline def constructor(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.cyan")
    @js.native
    val cyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.cyanBright")
    @js.native
    val cyanBright: this.type = js.native
    
    /**
    	Modifier: Make the text have lower opacity.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.dim")
    @js.native
    val dim: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.gray")
    @js.native
    val gray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.green")
    @js.native
    val green: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.greenBright")
    @js.native
    val greenBright: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.grey")
    @js.native
    val grey: this.type = js.native
    
    /**
    	Use HEX value to set text color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.hex('#DEADED');
    	```
    	*/
    inline def hex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Modifier: Print the text but make it invisible.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.hidden")
    @js.native
    val hidden: this.type = js.native
    
    /**
    	Modifier: Invert background and foreground colors.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.inverse")
    @js.native
    val inverse: this.type = js.native
    
    /**
    	Modifier: Make the text italic. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.italic")
    @js.native
    val italic: this.type = js.native
    
    /**
    	The color support for Chalk.
    	By default, color support is automatically detected based on the environment.
    	Levels:
    	- `0` - All colors disabled.
    	- `1` - Basic 16 colors support.
    	- `2` - ANSI 256 colors support.
    	- `3` - Truecolor 16 million colors support.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.level")
    @js.native
    def level: ColorSupportLevel = js.native
    inline def level_=(x: ColorSupportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.magenta")
    @js.native
    val magenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.magentaBright")
    @js.native
    val magentaBright: this.type = js.native
    
    /**
    	Modifier: Put a horizontal line above the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.overline")
    @js.native
    val overline: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.red")
    @js.native
    val red: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.redBright")
    @js.native
    val redBright: this.type = js.native
    
    /**
    	Modifier: Reset the current style.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.reset")
    @js.native
    val reset: this.type = js.native
    
    /**
    	Use RGB values to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.rgb(222, 173, 237);
    	```
    	*/
    inline def rgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
    	Modifier: Puts a horizontal line through the center of the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.strikethrough")
    @js.native
    val strikethrough: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.supportsColor")
    @js.native
    def supportsColor: ColorSupport = js.native
    inline def supportsColor_=(x: ColorSupport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsColor")(x.asInstanceOf[js.Any])
    
    /**
    	Modifier: Put a horizontal line below the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.underline")
    @js.native
    val underline: this.type = js.native
    
    /**
    	Modifier: Print the text only when Chalk has a color level above zero.
    	Can be useful for things that are purely cosmetic.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.visible")
    @js.native
    val visible: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.white")
    @js.native
    val white: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.whiteBright")
    @js.native
    val whiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.yellow")
    @js.native
    val yellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "green.yellowBright")
    @js.native
    val yellowBright: this.type = js.native
  }
  
  /* Inlined chalk.chalk.Chalk & {  supportsColor :chalk.chalk.ColorSupport} */
  object red {
    
    inline def apply(text: Any*): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Use an [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.ansi256(201);
    	```
    	*/
    inline def ansi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgAnsi256(201);
    	```
    	*/
    inline def bgAnsi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgAnsi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgBlack")
    @js.native
    val bgBlack: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgBlackBright")
    @js.native
    val bgBlackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgBlue")
    @js.native
    val bgBlue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgBlueBright")
    @js.native
    val bgBlueBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgCyan")
    @js.native
    val bgCyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgCyanBright")
    @js.native
    val bgCyanBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgGray")
    @js.native
    val bgGray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgGreen")
    @js.native
    val bgGreen: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgGreenBright")
    @js.native
    val bgGreenBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgGrey")
    @js.native
    val bgGrey: this.type = js.native
    
    /**
    	Use HEX value to set background color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgHex('#DEADED');
    	```
    	*/
    inline def bgHex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgHex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgMagenta")
    @js.native
    val bgMagenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgMagentaBright")
    @js.native
    val bgMagentaBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgRed")
    @js.native
    val bgRed: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgRedBright")
    @js.native
    val bgRedBright: this.type = js.native
    
    /**
    	Use RGB values to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgRgb(222, 173, 237);
    	```
    	*/
    inline def bgRgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("bgRgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgWhite")
    @js.native
    val bgWhite: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgWhiteBright")
    @js.native
    val bgWhiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgYellow")
    @js.native
    val bgYellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bgYellowBright")
    @js.native
    val bgYellowBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.black")
    @js.native
    val black: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.blackBright")
    @js.native
    val blackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.blue")
    @js.native
    val blue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.blueBright")
    @js.native
    val blueBright: this.type = js.native
    
    /**
    	Modifier: Make the text bold.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.bold")
    @js.native
    val bold: this.type = js.native
    
    inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    inline def constructor(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.cyan")
    @js.native
    val cyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.cyanBright")
    @js.native
    val cyanBright: this.type = js.native
    
    /**
    	Modifier: Make the text have lower opacity.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.dim")
    @js.native
    val dim: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.gray")
    @js.native
    val gray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.green")
    @js.native
    val green: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.greenBright")
    @js.native
    val greenBright: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.grey")
    @js.native
    val grey: this.type = js.native
    
    /**
    	Use HEX value to set text color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.hex('#DEADED');
    	```
    	*/
    inline def hex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Modifier: Print the text but make it invisible.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.hidden")
    @js.native
    val hidden: this.type = js.native
    
    /**
    	Modifier: Invert background and foreground colors.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.inverse")
    @js.native
    val inverse: this.type = js.native
    
    /**
    	Modifier: Make the text italic. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.italic")
    @js.native
    val italic: this.type = js.native
    
    /**
    	The color support for Chalk.
    	By default, color support is automatically detected based on the environment.
    	Levels:
    	- `0` - All colors disabled.
    	- `1` - Basic 16 colors support.
    	- `2` - ANSI 256 colors support.
    	- `3` - Truecolor 16 million colors support.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.level")
    @js.native
    def level: ColorSupportLevel = js.native
    inline def level_=(x: ColorSupportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.magenta")
    @js.native
    val magenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.magentaBright")
    @js.native
    val magentaBright: this.type = js.native
    
    /**
    	Modifier: Put a horizontal line above the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.overline")
    @js.native
    val overline: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.red")
    @js.native
    val red: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.redBright")
    @js.native
    val redBright: this.type = js.native
    
    /**
    	Modifier: Reset the current style.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.reset")
    @js.native
    val reset: this.type = js.native
    
    /**
    	Use RGB values to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.rgb(222, 173, 237);
    	```
    	*/
    inline def rgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
    	Modifier: Puts a horizontal line through the center of the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.strikethrough")
    @js.native
    val strikethrough: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.supportsColor")
    @js.native
    def supportsColor: ColorSupport = js.native
    inline def supportsColor_=(x: ColorSupport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsColor")(x.asInstanceOf[js.Any])
    
    /**
    	Modifier: Put a horizontal line below the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.underline")
    @js.native
    val underline: this.type = js.native
    
    /**
    	Modifier: Print the text only when Chalk has a color level above zero.
    	Can be useful for things that are purely cosmetic.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.visible")
    @js.native
    val visible: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.white")
    @js.native
    val white: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.whiteBright")
    @js.native
    val whiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.yellow")
    @js.native
    val yellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "red.yellowBright")
    @js.native
    val yellowBright: this.type = js.native
  }
  
  /* Inlined chalk.chalk.Chalk & {  supportsColor :chalk.chalk.ColorSupport} */
  object yellow {
    
    inline def apply(text: Any*): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Use an [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.ansi256(201);
    	```
    	*/
    inline def ansi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("ansi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Use a [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgAnsi256(201);
    	```
    	*/
    inline def bgAnsi256(index: Double): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgAnsi256")(index.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgBlack")
    @js.native
    val bgBlack: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgBlackBright")
    @js.native
    val bgBlackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgBlue")
    @js.native
    val bgBlue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgBlueBright")
    @js.native
    val bgBlueBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgCyan")
    @js.native
    val bgCyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgCyanBright")
    @js.native
    val bgCyanBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgGray")
    @js.native
    val bgGray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgGreen")
    @js.native
    val bgGreen: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgGreenBright")
    @js.native
    val bgGreenBright: this.type = js.native
    
    /*
    	Alias for `bgBlackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgGrey")
    @js.native
    val bgGrey: this.type = js.native
    
    /**
    	Use HEX value to set background color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgHex('#DEADED');
    	```
    	*/
    inline def bgHex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("bgHex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgMagenta")
    @js.native
    val bgMagenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgMagentaBright")
    @js.native
    val bgMagentaBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgRed")
    @js.native
    val bgRed: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgRedBright")
    @js.native
    val bgRedBright: this.type = js.native
    
    /**
    	Use RGB values to set background color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.bgRgb(222, 173, 237);
    	```
    	*/
    inline def bgRgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("bgRgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgWhite")
    @js.native
    val bgWhite: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgWhiteBright")
    @js.native
    val bgWhiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgYellow")
    @js.native
    val bgYellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bgYellowBright")
    @js.native
    val bgYellowBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.black")
    @js.native
    val black: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.blackBright")
    @js.native
    val blackBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.blue")
    @js.native
    val blue: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.blueBright")
    @js.native
    val blueBright: this.type = js.native
    
    /**
    	Modifier: Make the text bold.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.bold")
    @js.native
    val bold: this.type = js.native
    
    inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    inline def constructor(options: Options): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.cyan")
    @js.native
    val cyan: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.cyanBright")
    @js.native
    val cyanBright: this.type = js.native
    
    /**
    	Modifier: Make the text have lower opacity.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.dim")
    @js.native
    val dim: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.gray")
    @js.native
    val gray: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.green")
    @js.native
    val green: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.greenBright")
    @js.native
    val greenBright: this.type = js.native
    
    /*
    	Alias for `blackBright`.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.grey")
    @js.native
    val grey: this.type = js.native
    
    /**
    	Use HEX value to set text color.
    	@param color - Hexadecimal value representing the desired color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.hex('#DEADED');
    	```
    	*/
    inline def hex(color: String): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(color.asInstanceOf[js.Any]).asInstanceOf[this.type]
    
    /**
    	Modifier: Print the text but make it invisible.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.hidden")
    @js.native
    val hidden: this.type = js.native
    
    /**
    	Modifier: Invert background and foreground colors.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.inverse")
    @js.native
    val inverse: this.type = js.native
    
    /**
    	Modifier: Make the text italic. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.italic")
    @js.native
    val italic: this.type = js.native
    
    /**
    	The color support for Chalk.
    	By default, color support is automatically detected based on the environment.
    	Levels:
    	- `0` - All colors disabled.
    	- `1` - Basic 16 colors support.
    	- `2` - ANSI 256 colors support.
    	- `3` - Truecolor 16 million colors support.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.level")
    @js.native
    def level: ColorSupportLevel = js.native
    inline def level_=(x: ColorSupportLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.magenta")
    @js.native
    val magenta: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.magentaBright")
    @js.native
    val magentaBright: this.type = js.native
    
    /**
    	Modifier: Put a horizontal line above the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.overline")
    @js.native
    val overline: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.red")
    @js.native
    val red: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.redBright")
    @js.native
    val redBright: this.type = js.native
    
    /**
    	Modifier: Reset the current style.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.reset")
    @js.native
    val reset: this.type = js.native
    
    /**
    	Use RGB values to set text color.
    	@example
    	```
    	import chalk from 'chalk';
    	chalk.rgb(222, 173, 237);
    	```
    	*/
    inline def rgb(red: Double, green: Double, blue: Double): this.type = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[this.type]
    
    /**
    	Modifier: Puts a horizontal line through the center of the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.strikethrough")
    @js.native
    val strikethrough: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.supportsColor")
    @js.native
    def supportsColor: ColorSupport = js.native
    inline def supportsColor_=(x: ColorSupport): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsColor")(x.asInstanceOf[js.Any])
    
    /**
    	Modifier: Put a horizontal line below the text. *(Not widely supported)*
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.underline")
    @js.native
    val underline: this.type = js.native
    
    /**
    	Modifier: Print the text only when Chalk has a color level above zero.
    	Can be useful for things that are purely cosmetic.
    	*/
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.visible")
    @js.native
    val visible: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.white")
    @js.native
    val white: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.whiteBright")
    @js.native
    val whiteBright: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.yellow")
    @js.native
    val yellow: this.type = js.native
    
    @JSImport("inversify-logger-middleware/dts/serializers/text/colors", "yellow.yellowBright")
    @js.native
    val yellowBright: this.type = js.native
  }
}
