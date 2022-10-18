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

object eventsOrmDoteventMod {
  
  trait ORM
    extends StObject
       with Base {
    
    var AL1: js.UndefOr[Any] = js.undefined
    
    var BLG: js.UndefOr[Any] = js.undefined
    
    var CTD: js.UndefOr[Any] = js.undefined
    
    var CTI: js.UndefOr[Any] = js.undefined
    
    var DG1: js.UndefOr[Any] = js.undefined
    
    var FT1: js.UndefOr[Any] = js.undefined
    
    var GT1: js.UndefOr[Any] = js.undefined
    
    var IN1: js.UndefOr[Any] = js.undefined
    
    var IN2: js.UndefOr[Any] = js.undefined
    
    var IN3: js.UndefOr[Any] = js.undefined
    
    var OBR: typings.hl7.segmentsObrDotsegmentMod.OBR
    
    var OBX: typings.hl7.segmentsObxDotsegmentMod.OBX
    
    var ORC: typings.hl7.segmentsOrcDotsegmentMod.ORC
    
    var PD1: js.UndefOr[Any] = js.undefined
    
    var PID: typings.hl7.segmentsPidDotsegmentMod.PID
    
    var PV1: js.UndefOr[typings.hl7.segmentsPv1DotsegmentMod.PV1] = js.undefined
    
    var PV2: js.UndefOr[Any] = js.undefined
    
    var ZDS: Any
  }
  object ORM {
    
    inline def apply(MSH: MSH, OBR: OBR, OBX: OBX, ORC: ORC, PID: PID, ZDS: Any): ORM = {
      val __obj = js.Dynamic.literal(MSH = MSH.asInstanceOf[js.Any], OBR = OBR.asInstanceOf[js.Any], OBX = OBX.asInstanceOf[js.Any], ORC = ORC.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], ZDS = ZDS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ORM]
    }
    
    extension [Self <: ORM](x: Self) {
      
      inline def setAL1(value: Any): Self = StObject.set(x, "AL1", value.asInstanceOf[js.Any])
      
      inline def setAL1Undefined: Self = StObject.set(x, "AL1", js.undefined)
      
      inline def setBLG(value: Any): Self = StObject.set(x, "BLG", value.asInstanceOf[js.Any])
      
      inline def setBLGUndefined: Self = StObject.set(x, "BLG", js.undefined)
      
      inline def setCTD(value: Any): Self = StObject.set(x, "CTD", value.asInstanceOf[js.Any])
      
      inline def setCTDUndefined: Self = StObject.set(x, "CTD", js.undefined)
      
      inline def setCTI(value: Any): Self = StObject.set(x, "CTI", value.asInstanceOf[js.Any])
      
      inline def setCTIUndefined: Self = StObject.set(x, "CTI", js.undefined)
      
      inline def setDG1(value: Any): Self = StObject.set(x, "DG1", value.asInstanceOf[js.Any])
      
      inline def setDG1Undefined: Self = StObject.set(x, "DG1", js.undefined)
      
      inline def setFT1(value: Any): Self = StObject.set(x, "FT1", value.asInstanceOf[js.Any])
      
      inline def setFT1Undefined: Self = StObject.set(x, "FT1", js.undefined)
      
      inline def setGT1(value: Any): Self = StObject.set(x, "GT1", value.asInstanceOf[js.Any])
      
      inline def setGT1Undefined: Self = StObject.set(x, "GT1", js.undefined)
      
      inline def setIN1(value: Any): Self = StObject.set(x, "IN1", value.asInstanceOf[js.Any])
      
      inline def setIN1Undefined: Self = StObject.set(x, "IN1", js.undefined)
      
      inline def setIN2(value: Any): Self = StObject.set(x, "IN2", value.asInstanceOf[js.Any])
      
      inline def setIN2Undefined: Self = StObject.set(x, "IN2", js.undefined)
      
      inline def setIN3(value: Any): Self = StObject.set(x, "IN3", value.asInstanceOf[js.Any])
      
      inline def setIN3Undefined: Self = StObject.set(x, "IN3", js.undefined)
      
      inline def setOBR(value: OBR): Self = StObject.set(x, "OBR", value.asInstanceOf[js.Any])
      
      inline def setOBX(value: OBX): Self = StObject.set(x, "OBX", value.asInstanceOf[js.Any])
      
      inline def setORC(value: ORC): Self = StObject.set(x, "ORC", value.asInstanceOf[js.Any])
      
      inline def setPD1(value: Any): Self = StObject.set(x, "PD1", value.asInstanceOf[js.Any])
      
      inline def setPD1Undefined: Self = StObject.set(x, "PD1", js.undefined)
      
      inline def setPID(value: PID): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
      
      inline def setPV1(value: PV1): Self = StObject.set(x, "PV1", value.asInstanceOf[js.Any])
      
      inline def setPV1Undefined: Self = StObject.set(x, "PV1", js.undefined)
      
      inline def setPV2(value: Any): Self = StObject.set(x, "PV2", value.asInstanceOf[js.Any])
      
      inline def setPV2Undefined: Self = StObject.set(x, "PV2", js.undefined)
      
      inline def setZDS(value: Any): Self = StObject.set(x, "ZDS", value.asInstanceOf[js.Any])
    }
  }
}
