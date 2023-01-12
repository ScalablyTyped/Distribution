package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MAXPOOL extends StObject {
  
  var MAXPOOL: ArraySizeMethodMethodParameters
  
  var MEDIANPOOL: ArraySizeMethodMethodParameters
  
  var MMULT: ArraySizeMethodMethod
  
  var TRANSPOSE: ArraySizeMethodMethod
}
object MAXPOOL {
  
  inline def apply(
    MAXPOOL: ArraySizeMethodMethodParameters,
    MEDIANPOOL: ArraySizeMethodMethodParameters,
    MMULT: ArraySizeMethodMethod,
    TRANSPOSE: ArraySizeMethodMethod
  ): MAXPOOL = {
    val __obj = js.Dynamic.literal(MAXPOOL = MAXPOOL.asInstanceOf[js.Any], MEDIANPOOL = MEDIANPOOL.asInstanceOf[js.Any], MMULT = MMULT.asInstanceOf[js.Any], TRANSPOSE = TRANSPOSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAXPOOL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MAXPOOL] (val x: Self) extends AnyVal {
    
    inline def setMAXPOOL(value: ArraySizeMethodMethodParameters): Self = StObject.set(x, "MAXPOOL", value.asInstanceOf[js.Any])
    
    inline def setMEDIANPOOL(value: ArraySizeMethodMethodParameters): Self = StObject.set(x, "MEDIANPOOL", value.asInstanceOf[js.Any])
    
    inline def setMMULT(value: ArraySizeMethodMethod): Self = StObject.set(x, "MMULT", value.asInstanceOf[js.Any])
    
    inline def setTRANSPOSE(value: ArraySizeMethodMethod): Self = StObject.set(x, "TRANSPOSE", value.asInstanceOf[js.Any])
  }
}
