package typings.hl7

import typings.hl7.mshSegmentMod.MSH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseEventMod {
  
  trait Base extends StObject {
    
    var MSH: typings.hl7.mshSegmentMod.MSH
    
    var NTE: js.UndefOr[Any] = js.undefined
  }
  object Base {
    
    inline def apply(MSH: MSH): Base = {
      val __obj = js.Dynamic.literal(MSH = MSH.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setMSH(value: MSH): Self = StObject.set(x, "MSH", value.asInstanceOf[js.Any])
      
      inline def setNTE(value: Any): Self = StObject.set(x, "NTE", value.asInstanceOf[js.Any])
      
      inline def setNTEUndefined: Self = StObject.set(x, "NTE", js.undefined)
    }
  }
}
