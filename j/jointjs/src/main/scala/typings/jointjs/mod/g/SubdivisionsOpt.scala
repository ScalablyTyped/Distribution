package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubdivisionsOpt
  extends StObject
     with PrecisionOpt {
  
  var subdivisions: js.UndefOr[js.Array[Curve]] = js.undefined
}
object SubdivisionsOpt {
  
  inline def apply(): SubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsOpt]
  }
  
  extension [Self <: SubdivisionsOpt](x: Self) {
    
    inline def setSubdivisions(value: js.Array[Curve]): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setSubdivisionsVarargs(value: Curve*): Self = StObject.set(x, "subdivisions", js.Array(value :_*))
  }
}
