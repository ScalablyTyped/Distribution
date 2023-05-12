package typings.khroma

import typings.khroma.anon.Aliceblue
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorKeywordMod {
  
  object default {
    
    @JSImport("khroma/dist/color/keyword", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("khroma/dist/color/keyword", "default.colors")
    @js.native
    def colors: Aliceblue = js.native
    inline def colors_=(x: Aliceblue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    inline def parse(color: String): Channels | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(color.asInstanceOf[js.Any]).asInstanceOf[Channels | Unit]
    
    inline def stringify(channels: Channels): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(channels.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
}
