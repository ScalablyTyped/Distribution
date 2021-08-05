package typings.grommet.anon

import typings.grommet.themeContextMod.ThemeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueThemeValue extends StObject {
  
  var value: ThemeValue
}
object ValueThemeValue {
  
  inline def apply(value: ThemeValue): ValueThemeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueThemeValue]
  }
  
  extension [Self <: ValueThemeValue](x: Self) {
    
    inline def setValue(value: ThemeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
