package typings.khroma

import typings.khroma.anon.Hex
import typings.khroma.distTypesMod.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorMod {
  
  object default {
    
    @JSImport("khroma/dist/color", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("khroma/dist/color", "default.format")
    @js.native
    def format: Hex = js.native
    inline def format_=(x: Hex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    inline def parse(color: String): Channels = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(color.asInstanceOf[js.Any]).asInstanceOf[Channels]
    inline def parse(color: Channels): Channels = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(color.asInstanceOf[js.Any]).asInstanceOf[Channels]
    
    inline def stringify(channels: Channels): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(channels.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
