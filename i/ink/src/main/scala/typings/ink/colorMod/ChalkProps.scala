package typings.ink.colorMod

import typings.chalk.mod.Chalk
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ink.ink/build/components/Color.ChalkBooleanProps & ink.ink/build/components/Color.ChalkFunctionProps> */
@js.native
trait ChalkProps extends js.Object {
  var ansi: js.UndefOr[(Parameters[js.Function1[/* code */ Double, Chalk]]) | String] = js.native
  var ansi256: js.UndefOr[(Parameters[js.Function1[/* index */ Double, Chalk]]) | String] = js.native
  var bgAnsi: js.UndefOr[(Parameters[js.Function1[/* code */ Double, Chalk]]) | String] = js.native
  var bgAnsi256: js.UndefOr[(Parameters[js.Function1[/* index */ Double, Chalk]]) | String] = js.native
  var bgBlack: js.UndefOr[Boolean] = js.native
  var bgBlackBright: js.UndefOr[Boolean] = js.native
  var bgBlue: js.UndefOr[Boolean] = js.native
  var bgBlueBright: js.UndefOr[Boolean] = js.native
  var bgCyan: js.UndefOr[Boolean] = js.native
  var bgCyanBright: js.UndefOr[Boolean] = js.native
  var bgGray: js.UndefOr[Boolean] = js.native
  var bgGreen: js.UndefOr[Boolean] = js.native
  var bgGreenBright: js.UndefOr[Boolean] = js.native
  var bgGrey: js.UndefOr[Boolean] = js.native
  var bgHex: js.UndefOr[(Parameters[js.Function1[/* color */ String, Chalk]]) | String] = js.native
  var bgHsl: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
    ]) | String
  ] = js.native
  var bgHsv: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
    ]) | String
  ] = js.native
  var bgHwb: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
    ]) | String
  ] = js.native
  var bgKeyword: js.UndefOr[(Parameters[js.Function1[/* color */ String, Chalk]]) | String] = js.native
  var bgMagenta: js.UndefOr[Boolean] = js.native
  var bgMagentaBright: js.UndefOr[Boolean] = js.native
  var bgRed: js.UndefOr[Boolean] = js.native
  var bgRedBright: js.UndefOr[Boolean] = js.native
  var bgRgb: js.UndefOr[
    (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
  ] = js.native
  var bgWhite: js.UndefOr[Boolean] = js.native
  var bgWhiteBright: js.UndefOr[Boolean] = js.native
  var bgYellow: js.UndefOr[Boolean] = js.native
  var bgYellowBright: js.UndefOr[Boolean] = js.native
  var black: js.UndefOr[Boolean] = js.native
  var blackBright: js.UndefOr[Boolean] = js.native
  var blue: js.UndefOr[Boolean] = js.native
  var blueBright: js.UndefOr[Boolean] = js.native
  var bold: js.UndefOr[Boolean] = js.native
  var cyan: js.UndefOr[Boolean] = js.native
  var cyanBright: js.UndefOr[Boolean] = js.native
  var dim: js.UndefOr[Boolean] = js.native
  var gray: js.UndefOr[Boolean] = js.native
  var green: js.UndefOr[Boolean] = js.native
  var greenBright: js.UndefOr[Boolean] = js.native
  var grey: js.UndefOr[Boolean] = js.native
  var hex: js.UndefOr[(Parameters[js.Function1[/* color */ String, Chalk]]) | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var hsl: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
    ]) | String
  ] = js.native
  var hsv: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
    ]) | String
  ] = js.native
  var hwb: js.UndefOr[
    (Parameters[
      js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
    ]) | String
  ] = js.native
  var inverse: js.UndefOr[Boolean] = js.native
  var italic: js.UndefOr[Boolean] = js.native
  var keyword: js.UndefOr[(Parameters[js.Function1[/* color */ String, Chalk]]) | String] = js.native
  var magenta: js.UndefOr[Boolean] = js.native
  var magentaBright: js.UndefOr[Boolean] = js.native
  var red: js.UndefOr[Boolean] = js.native
  var redBright: js.UndefOr[Boolean] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var rgb: js.UndefOr[
    (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
  ] = js.native
  var strikethrough: js.UndefOr[Boolean] = js.native
  var underline: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var white: js.UndefOr[Boolean] = js.native
  var whiteBright: js.UndefOr[Boolean] = js.native
  var yellow: js.UndefOr[Boolean] = js.native
  var yellowBright: js.UndefOr[Boolean] = js.native
}

object ChalkProps {
  @scala.inline
  def apply(): ChalkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChalkProps]
  }
  @scala.inline
  implicit class ChalkPropsOps[Self <: ChalkProps] (val x: Self) extends AnyVal {
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
    def setAnsi(value: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String): Self = this.set("ansi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnsi: Self = this.set("ansi", js.undefined)
    @scala.inline
    def setAnsi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): Self = this.set("ansi256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnsi256: Self = this.set("ansi256", js.undefined)
    @scala.inline
    def setBgAnsi(value: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String): Self = this.set("bgAnsi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgAnsi: Self = this.set("bgAnsi", js.undefined)
    @scala.inline
    def setBgAnsi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): Self = this.set("bgAnsi256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgAnsi256: Self = this.set("bgAnsi256", js.undefined)
    @scala.inline
    def setBgBlack(value: Boolean): Self = this.set("bgBlack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgBlack: Self = this.set("bgBlack", js.undefined)
    @scala.inline
    def setBgBlackBright(value: Boolean): Self = this.set("bgBlackBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgBlackBright: Self = this.set("bgBlackBright", js.undefined)
    @scala.inline
    def setBgBlue(value: Boolean): Self = this.set("bgBlue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgBlue: Self = this.set("bgBlue", js.undefined)
    @scala.inline
    def setBgBlueBright(value: Boolean): Self = this.set("bgBlueBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgBlueBright: Self = this.set("bgBlueBright", js.undefined)
    @scala.inline
    def setBgCyan(value: Boolean): Self = this.set("bgCyan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgCyan: Self = this.set("bgCyan", js.undefined)
    @scala.inline
    def setBgCyanBright(value: Boolean): Self = this.set("bgCyanBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgCyanBright: Self = this.set("bgCyanBright", js.undefined)
    @scala.inline
    def setBgGray(value: Boolean): Self = this.set("bgGray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgGray: Self = this.set("bgGray", js.undefined)
    @scala.inline
    def setBgGreen(value: Boolean): Self = this.set("bgGreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgGreen: Self = this.set("bgGreen", js.undefined)
    @scala.inline
    def setBgGreenBright(value: Boolean): Self = this.set("bgGreenBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgGreenBright: Self = this.set("bgGreenBright", js.undefined)
    @scala.inline
    def setBgGrey(value: Boolean): Self = this.set("bgGrey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgGrey: Self = this.set("bgGrey", js.undefined)
    @scala.inline
    def setBgHex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("bgHex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgHex: Self = this.set("bgHex", js.undefined)
    @scala.inline
    def setBgHsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHsl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgHsl: Self = this.set("bgHsl", js.undefined)
    @scala.inline
    def setBgHsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHsv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgHsv: Self = this.set("bgHsv", js.undefined)
    @scala.inline
    def setBgHwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHwb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgHwb: Self = this.set("bgHwb", js.undefined)
    @scala.inline
    def setBgKeyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("bgKeyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgKeyword: Self = this.set("bgKeyword", js.undefined)
    @scala.inline
    def setBgMagenta(value: Boolean): Self = this.set("bgMagenta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgMagenta: Self = this.set("bgMagenta", js.undefined)
    @scala.inline
    def setBgMagentaBright(value: Boolean): Self = this.set("bgMagentaBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgMagentaBright: Self = this.set("bgMagentaBright", js.undefined)
    @scala.inline
    def setBgRed(value: Boolean): Self = this.set("bgRed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgRed: Self = this.set("bgRed", js.undefined)
    @scala.inline
    def setBgRedBright(value: Boolean): Self = this.set("bgRedBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgRedBright: Self = this.set("bgRedBright", js.undefined)
    @scala.inline
    def setBgRgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): Self = this.set("bgRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgRgb: Self = this.set("bgRgb", js.undefined)
    @scala.inline
    def setBgWhite(value: Boolean): Self = this.set("bgWhite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgWhite: Self = this.set("bgWhite", js.undefined)
    @scala.inline
    def setBgWhiteBright(value: Boolean): Self = this.set("bgWhiteBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgWhiteBright: Self = this.set("bgWhiteBright", js.undefined)
    @scala.inline
    def setBgYellow(value: Boolean): Self = this.set("bgYellow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgYellow: Self = this.set("bgYellow", js.undefined)
    @scala.inline
    def setBgYellowBright(value: Boolean): Self = this.set("bgYellowBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgYellowBright: Self = this.set("bgYellowBright", js.undefined)
    @scala.inline
    def setBlack(value: Boolean): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlack: Self = this.set("black", js.undefined)
    @scala.inline
    def setBlackBright(value: Boolean): Self = this.set("blackBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackBright: Self = this.set("blackBright", js.undefined)
    @scala.inline
    def setBlue(value: Boolean): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    @scala.inline
    def setBlueBright(value: Boolean): Self = this.set("blueBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueBright: Self = this.set("blueBright", js.undefined)
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setCyan(value: Boolean): Self = this.set("cyan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCyan: Self = this.set("cyan", js.undefined)
    @scala.inline
    def setCyanBright(value: Boolean): Self = this.set("cyanBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCyanBright: Self = this.set("cyanBright", js.undefined)
    @scala.inline
    def setDim(value: Boolean): Self = this.set("dim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDim: Self = this.set("dim", js.undefined)
    @scala.inline
    def setGray(value: Boolean): Self = this.set("gray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGray: Self = this.set("gray", js.undefined)
    @scala.inline
    def setGreen(value: Boolean): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    @scala.inline
    def setGreenBright(value: Boolean): Self = this.set("greenBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreenBright: Self = this.set("greenBright", js.undefined)
    @scala.inline
    def setGrey(value: Boolean): Self = this.set("grey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrey: Self = this.set("grey", js.undefined)
    @scala.inline
    def setHex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHex: Self = this.set("hex", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): Self = this.set("hsl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsl: Self = this.set("hsl", js.undefined)
    @scala.inline
    def setHsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): Self = this.set("hsv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsv: Self = this.set("hsv", js.undefined)
    @scala.inline
    def setHwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): Self = this.set("hwb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHwb: Self = this.set("hwb", js.undefined)
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setKeyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    @scala.inline
    def setMagenta(value: Boolean): Self = this.set("magenta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagenta: Self = this.set("magenta", js.undefined)
    @scala.inline
    def setMagentaBright(value: Boolean): Self = this.set("magentaBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagentaBright: Self = this.set("magentaBright", js.undefined)
    @scala.inline
    def setRed(value: Boolean): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
    @scala.inline
    def setRedBright(value: Boolean): Self = this.set("redBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedBright: Self = this.set("redBright", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRgb: Self = this.set("rgb", js.undefined)
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWhite(value: Boolean): Self = this.set("white", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
    @scala.inline
    def setWhiteBright(value: Boolean): Self = this.set("whiteBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteBright: Self = this.set("whiteBright", js.undefined)
    @scala.inline
    def setYellow(value: Boolean): Self = this.set("yellow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYellow: Self = this.set("yellow", js.undefined)
    @scala.inline
    def setYellowBright(value: Boolean): Self = this.set("yellowBright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYellowBright: Self = this.set("yellowBright", js.undefined)
  }
  
}

