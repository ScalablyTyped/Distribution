package typings.hl7

import typings.hl7.segmentsMshDotsegmentMod.MSH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsBaseDoteventMod {
  
  trait Base extends StObject {
    
    var MSH: typings.hl7.segmentsMshDotsegmentMod.MSH
    
    var NTE: js.UndefOr[Any] = js.undefined
  }
  object Base {
    
    inline def apply(MSH: MSH): Base = {
      val __obj = js.Dynamic.literal(MSH = MSH.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      inline def setMSH(value: MSH): Self = StObject.set(x, "MSH", value.asInstanceOf[js.Any])
      
      inline def setNTE(value: Any): Self = StObject.set(x, "NTE", value.asInstanceOf[js.Any])
      
      inline def setNTEUndefined: Self = StObject.set(x, "NTE", js.undefined)
    }
  }
}
