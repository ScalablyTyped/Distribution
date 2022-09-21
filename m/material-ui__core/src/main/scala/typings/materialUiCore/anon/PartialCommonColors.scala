package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.CommonColors> */
trait PartialCommonColors extends StObject {
  
  var black: js.UndefOr[String] = js.undefined
  
  var white: js.UndefOr[String] = js.undefined
}
object PartialCommonColors {
  
  inline def apply(): PartialCommonColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommonColors]
  }
  
  extension [Self <: PartialCommonColors](x: Self) {
    
    inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBlackUndefined: Self = StObject.set(x, "black", js.undefined)
    
    inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
  }
}
