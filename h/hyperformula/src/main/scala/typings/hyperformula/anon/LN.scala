package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LN extends StObject {
  
  var LN: Method
  
  var LOG: `20`
  
  var LOG10: Method
}
object LN {
  
  inline def apply(LN: Method, LOG: `20`, LOG10: Method): LN = {
    val __obj = js.Dynamic.literal(LN = LN.asInstanceOf[js.Any], LOG = LOG.asInstanceOf[js.Any], LOG10 = LOG10.asInstanceOf[js.Any])
    __obj.asInstanceOf[LN]
  }
  
  extension [Self <: LN](x: Self) {
    
    inline def setLN(value: Method): Self = StObject.set(x, "LN", value.asInstanceOf[js.Any])
    
    inline def setLOG(value: `20`): Self = StObject.set(x, "LOG", value.asInstanceOf[js.Any])
    
    inline def setLOG10(value: Method): Self = StObject.set(x, "LOG10", value.asInstanceOf[js.Any])
  }
}
