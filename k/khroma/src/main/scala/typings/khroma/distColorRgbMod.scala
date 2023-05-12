package typings.khroma

import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorRgbMod {
  
  object default {
    
    @JSImport("khroma/dist/color/rgb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(color: String): Channels | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(color.asInstanceOf[js.Any]).asInstanceOf[Channels | Unit]
    
    @JSImport("khroma/dist/color/rgb", "default.re")
    @js.native
    def re: js.RegExp = js.native
    inline def re_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("re")(x.asInstanceOf[js.Any])
    
    inline def stringify(channels: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(channels.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
