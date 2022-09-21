package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[Theme] extends StObject {
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object `13` {
  
  inline def apply[Theme](): `13`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[Theme]]
  }
  
  extension [Self <: `13`[?], Theme](x: Self & `13`[Theme]) {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
