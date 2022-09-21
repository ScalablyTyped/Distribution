package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  var gState: js.UndefOr[GState] = js.undefined
  
  var matrix: js.UndefOr[Matrix] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setGState(value: GState): Self = StObject.set(x, "gState", value.asInstanceOf[js.Any])
    
    inline def setGStateUndefined: Self = StObject.set(x, "gState", js.undefined)
    
    inline def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
  }
}
