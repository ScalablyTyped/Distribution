package typings.ink.colorMod

import typings.chalk.mod.Chalk
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof ink.ink/build/components/Color.ChalkFunctions ]: std.Parameters<ink.ink/build/components/Color.ChalkFunctions[K]> extends [string]? string : std.Parameters<ink.ink/build/components/Color.ChalkFunctions[K]>} */
@js.native
trait ChalkFunctionProps extends js.Object {
  
  var ansi: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String = js.native
  
  var ansi256: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String = js.native
  
  var bgAnsi: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String = js.native
  
  var bgAnsi256: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String = js.native
  
  var bgHex: (Parameters[js.Function1[/* color */ String, Chalk]]) | String = js.native
  
  var bgHsl: (Parameters[
    js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
  ]) | String = js.native
  
  var bgHsv: (Parameters[
    js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
  ]) | String = js.native
  
  var bgHwb: (Parameters[
    js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
  ]) | String = js.native
  
  var bgKeyword: (Parameters[js.Function1[/* color */ String, Chalk]]) | String = js.native
  
  var bgRgb: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String = js.native
  
  var hex: (Parameters[js.Function1[/* color */ String, Chalk]]) | String = js.native
  
  var hsl: (Parameters[
    js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
  ]) | String = js.native
  
  var hsv: (Parameters[
    js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
  ]) | String = js.native
  
  var hwb: (Parameters[
    js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
  ]) | String = js.native
  
  var keyword: (Parameters[js.Function1[/* color */ String, Chalk]]) | String = js.native
  
  var rgb: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String = js.native
}
object ChalkFunctionProps {
  
  @scala.inline
  def apply(
    ansi: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String,
    ansi256: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String,
    bgAnsi: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String,
    bgAnsi256: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String,
    bgHex: (Parameters[js.Function1[/* color */ String, Chalk]]) | String,
    bgHsl: (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
    ]) | String,
    bgHsv: (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
    ]) | String,
    bgHwb: (Parameters[
      js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
    ]) | String,
    bgKeyword: (Parameters[js.Function1[/* color */ String, Chalk]]) | String,
    bgRgb: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String,
    hex: (Parameters[js.Function1[/* color */ String, Chalk]]) | String,
    hsl: (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
    ]) | String,
    hsv: (Parameters[
      js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
    ]) | String,
    hwb: (Parameters[
      js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
    ]) | String,
    keyword: (Parameters[js.Function1[/* color */ String, Chalk]]) | String,
    rgb: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
  ): ChalkFunctionProps = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], ansi256 = ansi256.asInstanceOf[js.Any], bgAnsi = bgAnsi.asInstanceOf[js.Any], bgAnsi256 = bgAnsi256.asInstanceOf[js.Any], bgHex = bgHex.asInstanceOf[js.Any], bgHsl = bgHsl.asInstanceOf[js.Any], bgHsv = bgHsv.asInstanceOf[js.Any], bgHwb = bgHwb.asInstanceOf[js.Any], bgKeyword = bgKeyword.asInstanceOf[js.Any], bgRgb = bgRgb.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], hwb = hwb.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChalkFunctionProps]
  }
  
  @scala.inline
  implicit class ChalkFunctionPropsOps[Self <: ChalkFunctionProps] (val x: Self) extends AnyVal {
    
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
    def setAnsi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): Self = this.set("ansi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgAnsi(value: (Parameters[js.Function1[/* code */ Double, Chalk]]) | String): Self = this.set("bgAnsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgAnsi256(value: (Parameters[js.Function1[/* index */ Double, Chalk]]) | String): Self = this.set("bgAnsi256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("bgHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): Self = this.set("bgHwb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgKeyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("bgKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): Self = this.set("bgRgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsl(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* lightness */ Double, Chalk]
        ]) | String
    ): Self = this.set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsv(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* saturation */ Double, /* value */ Double, Chalk]
        ]) | String
    ): Self = this.set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHwb(
      value: (Parameters[
          js.Function3[/* hue */ Double, /* whiteness */ Double, /* blackness */ Double, Chalk]
        ]) | String
    ): Self = this.set("hwb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyword(value: (Parameters[js.Function1[/* color */ String, Chalk]]) | String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb(
      value: (Parameters[js.Function3[/* red */ Double, /* green */ Double, /* blue */ Double, Chalk]]) | String
    ): Self = this.set("rgb", value.asInstanceOf[js.Any])
  }
}
