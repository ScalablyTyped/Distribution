package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLOOKUP extends StObject {
  
  var HLOOKUP: `21`
  
  var MATCH: `11`
  
  var VLOOKUP: `21`
}
object HLOOKUP {
  
  inline def apply(HLOOKUP: `21`, MATCH: `11`, VLOOKUP: `21`): HLOOKUP = {
    val __obj = js.Dynamic.literal(HLOOKUP = HLOOKUP.asInstanceOf[js.Any], MATCH = MATCH.asInstanceOf[js.Any], VLOOKUP = VLOOKUP.asInstanceOf[js.Any])
    __obj.asInstanceOf[HLOOKUP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HLOOKUP] (val x: Self) extends AnyVal {
    
    inline def setHLOOKUP(value: `21`): Self = StObject.set(x, "HLOOKUP", value.asInstanceOf[js.Any])
    
    inline def setMATCH(value: `11`): Self = StObject.set(x, "MATCH", value.asInstanceOf[js.Any])
    
    inline def setVLOOKUP(value: `21`): Self = StObject.set(x, "VLOOKUP", value.asInstanceOf[js.Any])
  }
}
