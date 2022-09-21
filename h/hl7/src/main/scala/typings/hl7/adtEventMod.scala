package typings.hl7

import typings.hl7.baseEventMod.Base
import typings.hl7.mshSegmentMod.MSH
import typings.hl7.pidSegmentMod.PID
import typings.hl7.pv1SegmentMod.PV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adtEventMod {
  
  trait ADT
    extends StObject
       with Base {
    
    var EVN: Any
    
    var PID: typings.hl7.pidSegmentMod.PID
    
    var PV1: typings.hl7.pv1SegmentMod.PV1
  }
  object ADT {
    
    inline def apply(EVN: Any, MSH: MSH, PID: PID, PV1: PV1): ADT = {
      val __obj = js.Dynamic.literal(EVN = EVN.asInstanceOf[js.Any], MSH = MSH.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PV1 = PV1.asInstanceOf[js.Any])
      __obj.asInstanceOf[ADT]
    }
    
    extension [Self <: ADT](x: Self) {
      
      inline def setEVN(value: Any): Self = StObject.set(x, "EVN", value.asInstanceOf[js.Any])
      
      inline def setPID(value: PID): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
      
      inline def setPV1(value: PV1): Self = StObject.set(x, "PV1", value.asInstanceOf[js.Any])
    }
  }
}
