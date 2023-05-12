package typings.khroma

import typings.khroma.anon.A
import typings.khroma.anon.B
import typings.khroma.anon.G
import typings.khroma.distTypesMod.HSL
import typings.khroma.distTypesMod.RGB
import typings.khroma.khromaStrings.b
import typings.khroma.khromaStrings.g
import typings.khroma.khromaStrings.h
import typings.khroma.khromaStrings.l
import typings.khroma.khromaStrings.r
import typings.khroma.khromaStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsChannelMod {
  
  object default {
    
    @JSImport("khroma/dist/utils/channel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("khroma/dist/utils/channel", "default.clamp")
    @js.native
    def clamp: G = js.native
    inline def clamp_=(x: G): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clamp")(x.asInstanceOf[js.Any])
    
    inline def hsl2rgb(param0: HSL, channel: /* keyof khroma.khroma/dist/types.RGB */ r | g | b): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(param0.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def hue2rgb(p: Double, q: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hue2rgb")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("khroma/dist/utils/channel", "default.max")
    @js.native
    def max: B = js.native
    inline def max_=(x: B): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("khroma/dist/utils/channel", "default.min")
    @js.native
    def min: A = js.native
    inline def min_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
    
    inline def rgb2hsl(param0: RGB, channel: /* keyof khroma.khroma/dist/types.HSL */ h | s | l): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(param0.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def toLinear(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toLinear")(c.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
