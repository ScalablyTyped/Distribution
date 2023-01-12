package typings.hl7

import typings.hl7.eventsAdtDoteventMod.ADT
import typings.hl7.eventsOmgDoteventMod.OMG
import typings.hl7.eventsOrmDoteventMod.ORM
import typings.hl7.eventsOruDoteventMod.ORU
import typings.hl7.eventsSiuDoteventMod.SIU
import typings.hl7.segmentsAilDotsegmentMod.AIL
import typings.hl7.segmentsAisDotsegmentMod.AIS
import typings.hl7.segmentsMshDotsegmentMod.MSH
import typings.hl7.segmentsObrDotsegmentMod.OBR
import typings.hl7.segmentsObxDotsegmentMod.OBX
import typings.hl7.segmentsOrcDotsegmentMod.ORC
import typings.hl7.segmentsPidDotsegmentMod.PID
import typings.hl7.segmentsPv1DotsegmentMod.PV1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object hl7 {
    
    /**
      * A segment is a logical grouping of data fields. Segments of a message may be required or optional.
      * They may occur only once in a message or they may be allowed to repeat. Each segment is given a name.
      * For example, the ADT message may contain the following segments: Message Header (MSH), Event Type (EVN), Patient ID (PID), and Patient Visit (PV1).
      * Each segment is identified by a unique three-character code known as the Segment ID.
      * Although the actual segments are defined in various chapters, the ID codes assigned to the various segments are listed in Appendix A.
      * All Segment ID codes beginning with the letter Z are reserved for locally defined segments. Z Codes SHALL NOT be defined within the HL7 Standard.
      */
    trait Segment extends StObject {
      
      var AIL: typings.hl7.segmentsAilDotsegmentMod.AIL
      
      var AIS: typings.hl7.segmentsAisDotsegmentMod.AIS
      
      var MSH: typings.hl7.segmentsMshDotsegmentMod.MSH
      
      var OBR: typings.hl7.segmentsObrDotsegmentMod.OBR
      
      var OBX: typings.hl7.segmentsObxDotsegmentMod.OBX
      
      var ORC: typings.hl7.segmentsOrcDotsegmentMod.ORC
      
      var PID: typings.hl7.segmentsPidDotsegmentMod.PID
      
      var PV1: typings.hl7.segmentsPv1DotsegmentMod.PV1
    }
    object Segment {
      
      inline def apply(AIL: AIL, AIS: AIS, MSH: MSH, OBR: OBR, OBX: OBX, ORC: ORC, PID: PID, PV1: PV1): Segment = {
        val __obj = js.Dynamic.literal(AIL = AIL.asInstanceOf[js.Any], AIS = AIS.asInstanceOf[js.Any], MSH = MSH.asInstanceOf[js.Any], OBR = OBR.asInstanceOf[js.Any], OBX = OBX.asInstanceOf[js.Any], ORC = ORC.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PV1 = PV1.asInstanceOf[js.Any])
        __obj.asInstanceOf[Segment]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
        
        inline def setAIL(value: AIL): Self = StObject.set(x, "AIL", value.asInstanceOf[js.Any])
        
        inline def setAIS(value: AIS): Self = StObject.set(x, "AIS", value.asInstanceOf[js.Any])
        
        inline def setMSH(value: MSH): Self = StObject.set(x, "MSH", value.asInstanceOf[js.Any])
        
        inline def setOBR(value: OBR): Self = StObject.set(x, "OBR", value.asInstanceOf[js.Any])
        
        inline def setOBX(value: OBX): Self = StObject.set(x, "OBX", value.asInstanceOf[js.Any])
        
        inline def setORC(value: ORC): Self = StObject.set(x, "ORC", value.asInstanceOf[js.Any])
        
        inline def setPID(value: PID): Self = StObject.set(x, "PID", value.asInstanceOf[js.Any])
        
        inline def setPV1(value: PV1): Self = StObject.set(x, "PV1", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The standard is written from the assumption that an event in the real world of healthcare creates the need for data to flow among systems.
      * The real-world event is called the trigger event.
      * For example, the trigger event a patient is admitted may cause the need for data about that patient to be sent to some other systems.
      * The trigger event, an observation (e.g., a CBC result) for a patient is available, may cause the need for that observation to be sent to some other systems too.
      * When the transfer of information is initiated by the application system that deals with the triggering event, the exchange is termed an unsolicited update.
      */
    trait TriggerEvent extends StObject {
      
      var ADT: typings.hl7.eventsAdtDoteventMod.ADT
      
      var OMG: typings.hl7.eventsOmgDoteventMod.OMG
      
      var ORM: typings.hl7.eventsOrmDoteventMod.ORM
      
      var ORU: typings.hl7.eventsOruDoteventMod.ORU
      
      var SIU: typings.hl7.eventsSiuDoteventMod.SIU
    }
    object TriggerEvent {
      
      inline def apply(ADT: ADT, OMG: OMG, ORM: ORM, ORU: ORU, SIU: SIU): TriggerEvent = {
        val __obj = js.Dynamic.literal(ADT = ADT.asInstanceOf[js.Any], OMG = OMG.asInstanceOf[js.Any], ORM = ORM.asInstanceOf[js.Any], ORU = ORU.asInstanceOf[js.Any], SIU = SIU.asInstanceOf[js.Any])
        __obj.asInstanceOf[TriggerEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TriggerEvent] (val x: Self) extends AnyVal {
        
        inline def setADT(value: ADT): Self = StObject.set(x, "ADT", value.asInstanceOf[js.Any])
        
        inline def setOMG(value: OMG): Self = StObject.set(x, "OMG", value.asInstanceOf[js.Any])
        
        inline def setORM(value: ORM): Self = StObject.set(x, "ORM", value.asInstanceOf[js.Any])
        
        inline def setORU(value: ORU): Self = StObject.set(x, "ORU", value.asInstanceOf[js.Any])
        
        inline def setSIU(value: SIU): Self = StObject.set(x, "SIU", value.asInstanceOf[js.Any])
      }
    }
  }
}
