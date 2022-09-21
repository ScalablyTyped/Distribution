package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeTheme[Theme] extends StObject {
  
  var theme: Theme
}
object ThemeTheme {
  
  inline def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme[Theme]]
  }
  
  extension [Self <: ThemeTheme[?], Theme](x: Self & ThemeTheme[Theme]) {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
