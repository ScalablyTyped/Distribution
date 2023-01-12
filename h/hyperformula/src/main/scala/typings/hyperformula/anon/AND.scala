package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AND extends StObject {
  
  var AND: ExpandRanges
  
  var CHOOSE: ParametersRepeatLastArgs
  
  var FALSE: ParametersArray
  
  var IF: MethodStringParametersArray
  
  var IFERROR: `0`
  
  var IFNA: `0`
  
  var NOT: Method
  
  var OR: ExpandRanges
  
  var SWITCH: RepeatLastArgs
  
  var TRUE: ParametersArray
  
  var XOR: ExpandRanges
}
object AND {
  
  inline def apply(
    AND: ExpandRanges,
    CHOOSE: ParametersRepeatLastArgs,
    FALSE: ParametersArray,
    IF: MethodStringParametersArray,
    IFERROR: `0`,
    IFNA: `0`,
    NOT: Method,
    OR: ExpandRanges,
    SWITCH: RepeatLastArgs,
    TRUE: ParametersArray,
    XOR: ExpandRanges
  ): AND = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], CHOOSE = CHOOSE.asInstanceOf[js.Any], FALSE = FALSE.asInstanceOf[js.Any], IF = IF.asInstanceOf[js.Any], IFERROR = IFERROR.asInstanceOf[js.Any], IFNA = IFNA.asInstanceOf[js.Any], NOT = NOT.asInstanceOf[js.Any], OR = OR.asInstanceOf[js.Any], SWITCH = SWITCH.asInstanceOf[js.Any], TRUE = TRUE.asInstanceOf[js.Any], XOR = XOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AND]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AND] (val x: Self) extends AnyVal {
    
    inline def setAND(value: ExpandRanges): Self = StObject.set(x, "AND", value.asInstanceOf[js.Any])
    
    inline def setCHOOSE(value: ParametersRepeatLastArgs): Self = StObject.set(x, "CHOOSE", value.asInstanceOf[js.Any])
    
    inline def setFALSE(value: ParametersArray): Self = StObject.set(x, "FALSE", value.asInstanceOf[js.Any])
    
    inline def setIF(value: MethodStringParametersArray): Self = StObject.set(x, "IF", value.asInstanceOf[js.Any])
    
    inline def setIFERROR(value: `0`): Self = StObject.set(x, "IFERROR", value.asInstanceOf[js.Any])
    
    inline def setIFNA(value: `0`): Self = StObject.set(x, "IFNA", value.asInstanceOf[js.Any])
    
    inline def setNOT(value: Method): Self = StObject.set(x, "NOT", value.asInstanceOf[js.Any])
    
    inline def setOR(value: ExpandRanges): Self = StObject.set(x, "OR", value.asInstanceOf[js.Any])
    
    inline def setSWITCH(value: RepeatLastArgs): Self = StObject.set(x, "SWITCH", value.asInstanceOf[js.Any])
    
    inline def setTRUE(value: ParametersArray): Self = StObject.set(x, "TRUE", value.asInstanceOf[js.Any])
    
    inline def setXOR(value: ExpandRanges): Self = StObject.set(x, "XOR", value.asInstanceOf[js.Any])
  }
}
