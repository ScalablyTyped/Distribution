package typings.khroma

import typings.khroma.anon.Clamp
import typings.khroma.anon.Dec2hex
import typings.khroma.anon.Round
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  object default {
    
    @JSImport("khroma/dist/utils", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("khroma/dist/utils", "default.channel")
    @js.native
    def channel: Clamp = js.native
    inline def channel_=(x: Clamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channel")(x.asInstanceOf[js.Any])
    
    @JSImport("khroma/dist/utils", "default.lang")
    @js.native
    def lang: Round = js.native
    inline def lang_=(x: Round): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lang")(x.asInstanceOf[js.Any])
    
    @JSImport("khroma/dist/utils", "default.unit")
    @js.native
    def unit: Dec2hex = js.native
    inline def unit_=(x: Dec2hex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unit")(x.asInstanceOf[js.Any])
  }
}
