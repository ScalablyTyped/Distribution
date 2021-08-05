package typings.ldclientJsCommon

import typings.ldclientJsCommon.mod.LDFlagValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: LDFlagValue
    
    var previous: LDFlagValue
  }
  object Current {
    
    inline def apply(current: LDFlagValue, previous: LDFlagValue): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: LDFlagValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: LDFlagValue): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
}
