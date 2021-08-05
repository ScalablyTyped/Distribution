package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Foundation extends StObject {
  
  var base: Base
  
  var palette: Palette
}
object Foundation {
  
  inline def apply(base: Base, palette: Palette): Foundation = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
  
  extension [Self <: Foundation](x: Self) {
    
    inline def setBase(value: Base): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
  }
}
