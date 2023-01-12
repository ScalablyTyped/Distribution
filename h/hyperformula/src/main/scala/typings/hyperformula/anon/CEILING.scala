package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CEILING extends StObject {
  
  var CEILING: Method
  
  @JSName("CEILING.MATH")
  var CEILINGDotMATH: `11`
  
  @JSName("CEILING.PRECISE")
  var CEILINGDotPRECISE: `11`
  
  var EVEN: Method
  
  var FLOOR: Method
  
  @JSName("FLOOR.MATH")
  var FLOORDotMATH: `11`
  
  @JSName("FLOOR.PRECISE")
  var FLOORDotPRECISE: `11`
  
  var INT: Method
  
  var ODD: Method
  
  var ROUND: `11`
  
  var ROUNDDOWN: `11`
  
  var ROUNDUP: `11`
}
object CEILING {
  
  inline def apply(
    CEILING: Method,
    CEILINGDotMATH: `11`,
    CEILINGDotPRECISE: `11`,
    EVEN: Method,
    FLOOR: Method,
    FLOORDotMATH: `11`,
    FLOORDotPRECISE: `11`,
    INT: Method,
    ODD: Method,
    ROUND: `11`,
    ROUNDDOWN: `11`,
    ROUNDUP: `11`
  ): CEILING = {
    val __obj = js.Dynamic.literal(CEILING = CEILING.asInstanceOf[js.Any], EVEN = EVEN.asInstanceOf[js.Any], FLOOR = FLOOR.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any], ROUND = ROUND.asInstanceOf[js.Any], ROUNDDOWN = ROUNDDOWN.asInstanceOf[js.Any], ROUNDUP = ROUNDUP.asInstanceOf[js.Any])
    __obj.updateDynamic("CEILING.MATH")(CEILINGDotMATH.asInstanceOf[js.Any])
    __obj.updateDynamic("CEILING.PRECISE")(CEILINGDotPRECISE.asInstanceOf[js.Any])
    __obj.updateDynamic("FLOOR.MATH")(FLOORDotMATH.asInstanceOf[js.Any])
    __obj.updateDynamic("FLOOR.PRECISE")(FLOORDotPRECISE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CEILING]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CEILING] (val x: Self) extends AnyVal {
    
    inline def setCEILING(value: Method): Self = StObject.set(x, "CEILING", value.asInstanceOf[js.Any])
    
    inline def setCEILINGDotMATH(value: `11`): Self = StObject.set(x, "CEILING.MATH", value.asInstanceOf[js.Any])
    
    inline def setCEILINGDotPRECISE(value: `11`): Self = StObject.set(x, "CEILING.PRECISE", value.asInstanceOf[js.Any])
    
    inline def setEVEN(value: Method): Self = StObject.set(x, "EVEN", value.asInstanceOf[js.Any])
    
    inline def setFLOOR(value: Method): Self = StObject.set(x, "FLOOR", value.asInstanceOf[js.Any])
    
    inline def setFLOORDotMATH(value: `11`): Self = StObject.set(x, "FLOOR.MATH", value.asInstanceOf[js.Any])
    
    inline def setFLOORDotPRECISE(value: `11`): Self = StObject.set(x, "FLOOR.PRECISE", value.asInstanceOf[js.Any])
    
    inline def setINT(value: Method): Self = StObject.set(x, "INT", value.asInstanceOf[js.Any])
    
    inline def setODD(value: Method): Self = StObject.set(x, "ODD", value.asInstanceOf[js.Any])
    
    inline def setROUND(value: `11`): Self = StObject.set(x, "ROUND", value.asInstanceOf[js.Any])
    
    inline def setROUNDDOWN(value: `11`): Self = StObject.set(x, "ROUNDDOWN", value.asInstanceOf[js.Any])
    
    inline def setROUNDUP(value: `11`): Self = StObject.set(x, "ROUNDUP", value.asInstanceOf[js.Any])
  }
}
