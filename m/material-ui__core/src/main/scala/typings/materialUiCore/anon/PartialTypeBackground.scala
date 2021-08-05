package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeBackground> */
trait PartialTypeBackground extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var paper: js.UndefOr[String] = js.undefined
}
object PartialTypeBackground {
  
  inline def apply(): PartialTypeBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeBackground]
  }
  
  extension [Self <: PartialTypeBackground](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
