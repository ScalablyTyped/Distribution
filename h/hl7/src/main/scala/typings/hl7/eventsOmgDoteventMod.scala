package typings.hl7

import typings.hl7.eventsBaseDoteventMod.Base
import typings.hl7.segmentsMshDotsegmentMod.MSH
import typings.hl7.segmentsObrDotsegmentMod.OBR
import typings.hl7.segmentsObxDotsegmentMod.OBX
import typings.hl7.segmentsOrcDotsegmentMod.ORC
import typings.hl7.segmentsPidDotsegmentMod.PID
import typings.hl7.segmentsPv1DotsegmentMod.PV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsOmgDoteventMod {
  
  trait OMG
    extends StObject
       with Base {
    
    var CTD: js.UndefOr[Any] = js.undefined
    
    var DSC: js.UndefOr[Any] = js.undefined
    
    var FT1: js.UndefOr[Any] = js.undefined
    
    var MK1: js.UndefOr[Any] = js.undefined
    
    var OBR: typings.hl7.segmentsObrDotsegmentMod.OBR
    
    var OBX: typings.hl7.segmentsObxDotsegmentMod.OBX
    
    var ORC: typings.hl7.segmentsOrcDotsegmentMod.ORC
    
    var PD1: js.UndefOr[Any] = js.undefined
    
    var PID: typings.hl7.segmentsPidDotsegmentMod.PID
    
    var PV1: typings.hl7.segmentsPv1DotsegmentMod.PV1
    
    var PV2: js.UndefOr[Any] = js.undefined
    
    var SFT: js.UndefOr[Any] = js.undefined
    
    var SPM: js.UndefOr[Any] = js.undefined
    
    var TQ1: js.UndefOr[Any] = js.undefined
    
    var TQ2: js.UndefOr[Any] = js.undefined
  }
  object OMG {
    
    inline def apply(MSH: MSH, OBR: OBR, OBX: OBX, ORC: ORC, PID: PID, PV1: PV1): OMG = {
      val __obj = js.Dynamic.literal(MSH = MSH.asInstanceOf[js.Any], OBR = OBR.asInstanceOf[js.Any], OBX = OBX.asInstanceOf[js.Any], ORC = ORC.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PV1 = PV1.asInstanceOf[js.Any])
      __obj.asInstanceOf[OMG]
    }
    
    extension [Self <: OMG](x: Self) {
      
      inline def setCTD(value: Any): Self = StObject.set(x, "CTD", value.asInstanceOf[js.Any])
      
      inline def setCTDUndefined: Self = StObject.set(x, "CTD", js.undefined)
      
      inline def setDSC(value: Any): Self = StObject.set(x, "DSC", value.asInstanceOf[js.Any])
      
      inline def setDSCUndefined: Self = StObject.set(x, "DSC", js.undefined)
      
      inline def setFT1(value: Any): Self = StObject.set(x, "FT1", value.asInstanceOf[js.Any])
      
      inline def setFT1Undefined: Self = StObject.set(x, "FT1", js.undefined)
      
      inline def setMK1(value: Any): Self = StObject.set(x, "MK1", value.asInstanceOf[js.Any])
      
      inline def setMK1Undefined: Self = StObject.set(x, "MK1", js.undefined)
      
      inline def setOBR(value: OBR): Self = StObject.set(x, "OBR", value.asInstanceOf[js.Any])
      
      inline def setOBX(value: OBX): Self = StObject.set(x, "OBX", value.asInstanceOf[js.Any])
      
      inline def setORC(value: ORC): Self = StObject.set(x, "ORC", value.asInstanceOf[js.Any])
      
      inline def setPD1(value: Any): Self = StObject.set(x, "PD1", value.asInstanceOf[js.Any])
      
      inline def setPD1Undefined: Self = StObject.set(x, "PD1", js.undefined)
      
      inline def setPID(value: PID): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
      
      inline def setPV1(value: PV1): Self = StObject.set(x, "PV1", value.asInstanceOf[js.Any])
      
      inline def setPV2(value: Any): Self = StObject.set(x, "PV2", value.asInstanceOf[js.Any])
      
      inline def setPV2Undefined: Self = StObject.set(x, "PV2", js.undefined)
      
      inline def setSFT(value: Any): Self = StObject.set(x, "SFT", value.asInstanceOf[js.Any])
      
      inline def setSFTUndefined: Self = StObject.set(x, "SFT", js.undefined)
      
      inline def setSPM(value: Any): Self = StObject.set(x, "SPM", value.asInstanceOf[js.Any])
      
      inline def setSPMUndefined: Self = StObject.set(x, "SPM", js.undefined)
      
      inline def setTQ1(value: Any): Self = StObject.set(x, "TQ1", value.asInstanceOf[js.Any])
      
      inline def setTQ1Undefined: Self = StObject.set(x, "TQ1", js.undefined)
      
      inline def setTQ2(value: Any): Self = StObject.set(x, "TQ2", value.asInstanceOf[js.Any])
      
      inline def setTQ2Undefined: Self = StObject.set(x, "TQ2", js.undefined)
    }
  }
}
