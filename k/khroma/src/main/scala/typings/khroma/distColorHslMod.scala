package typings.khroma

import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorHslMod {
  
  object default {
    
    @JSImport("khroma/dist/color/hsl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def hue2deg(hue: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_hue2deg")(hue.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("khroma/dist/color/hsl", "default.hueRe")
    @js.native
    def hueRe: js.RegExp = js.native
    inline def hueRe_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hueRe")(x.asInstanceOf[js.Any])
    
    inline def parse(color: String): Channels | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(color.asInstanceOf[js.Any]).asInstanceOf[Channels | Unit]
    
    @JSImport("khroma/dist/color/hsl", "default.re")
    @js.native
    def re: js.RegExp = js.native
    inline def re_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("re")(x.asInstanceOf[js.Any])
    
    inline def stringify(channels: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(channels.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
