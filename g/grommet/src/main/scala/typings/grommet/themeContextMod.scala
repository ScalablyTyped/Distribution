package typings.grommet

import typings.grommet.anon.ValueThemeValue
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod {
  
  @JSImport("grommet/contexts/ThemeContext", "ThemeContext")
  @js.native
  val ThemeContext: ThemeContextI = js.native
  
  trait ThemeContextI
    extends StObject
       with Context[ThemeValue] {
    
    var Extend: FC[ValueThemeValue]
  }
  object ThemeContextI {
    
    inline def apply(Consumer: Consumer[ThemeValue], Extend: FC[ValueThemeValue], Provider: Provider[ThemeValue]): ThemeContextI = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeContextI]
    }
    
    extension [Self <: ThemeContextI](x: Self) {
      
      inline def setExtend(value: FC[ValueThemeValue]): Self = StObject.set(x, "Extend", value.asInstanceOf[js.Any])
    }
  }
  
  type ThemeValue = js.Object
}
