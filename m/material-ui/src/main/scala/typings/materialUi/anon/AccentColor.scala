package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentColor extends StObject {
  
  var accentColor: js.UndefOr[String] = js.undefined
}
object AccentColor {
  
  inline def apply(): AccentColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccentColor]
  }
  
  extension [Self <: AccentColor](x: Self) {
    
    inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
  }
}
