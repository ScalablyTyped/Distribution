package typings.khroma

import typings.khroma.anon.PartialCHANNELS
import typings.khroma.distMethodsRgbaMod.IRgba
import typings.khroma.distTypesMod.CHANNEL
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("khroma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjust(color: String, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjust")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def adjust(color: Channels, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjust")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def alpha(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def alpha(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def blue(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def blue(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def change(color: String, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def change(color: Channels, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def channel(color: String, channel: CHANNEL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("channel")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def channel(color: Channels, channel: CHANNEL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("channel")(color.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def complement(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("complement")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def complement(color: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("complement")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def contrast(color1: String, color2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def darken(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def darken(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def desaturate(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def desaturate(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("desaturate")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fadeIn(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fadeIn(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fadeOut(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fadeOut(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def grayscale(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscale")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def grayscale(color: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscale")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def green(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("green")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def green(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("green")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("khroma", "hex")
  @js.native
  val hex: IRgba = js.native
  
  inline def hsl(h: Double, s: Double, l: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsl(h: Double, s: Double, l: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hsla(h: Double, s: Double, l: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hsla(h: Double, s: Double, l: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsla")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hue(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def hue(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hue")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def invert(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def invert(color: String, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(color.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def invert(color: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def invert(color: Channels, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(color.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isDark(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDark")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDark(color: Channels): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDark")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLight(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLight")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isLight(color: Channels): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLight")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValid(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lighten(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def lighten(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lightness(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def lightness(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lightness")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def luminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("luminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def luminance(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("luminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def mix(color1: String, color2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: String, color2: String, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: String, color2: Channels): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: String, color2: Channels, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: Channels, color2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: Channels, color2: String, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: Channels, color2: Channels): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mix(color1: Channels, color2: Channels, weight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def opacify(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def opacify(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("opacify")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def opacity(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opacity")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def opacity(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opacity")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def red(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def red(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("khroma", "rgb")
  @js.native
  val rgb: IRgba = js.native
  
  @JSImport("khroma", "rgba")
  @js.native
  val rgba: IRgba = js.native
  
  inline def saturate(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def saturate(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def saturation(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def saturation(color: Channels): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("saturation")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def scale(color: String, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scale(color: Channels, channels: PartialCHANNELS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(color.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHsla(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHsla")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toKeyword(color: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyword")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def toRgba(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRgba")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transparentize(color: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transparentize(color: Channels, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transparentize")(color.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
}
