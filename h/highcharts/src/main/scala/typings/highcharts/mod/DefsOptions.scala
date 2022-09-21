package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsOptions extends StObject {
  
  var arrow: js.UndefOr[ASTNode | DefsArrowOptions] = js.undefined
  
  var `reverse-arrow`: js.UndefOr[ASTNode | DefsReverseArrowOptions] = js.undefined
}
object DefsOptions {
  
  inline def apply(): DefsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsOptions]
  }
  
  extension [Self <: DefsOptions](x: Self) {
    
    inline def setArrow(value: ASTNode | DefsArrowOptions): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def `setReverse-arrow`(value: ASTNode | DefsReverseArrowOptions): Self = StObject.set(x, "reverse-arrow", value.asInstanceOf[js.Any])
    
    inline def `setReverse-arrowUndefined`: Self = StObject.set(x, "reverse-arrow", js.undefined)
  }
}
