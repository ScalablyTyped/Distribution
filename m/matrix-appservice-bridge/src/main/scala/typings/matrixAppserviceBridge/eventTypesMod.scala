package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.anon.Age
import typings.matrixAppserviceBridge.anon.Currentlyactive
import typings.matrixAppserviceBridge.anon.Mread
import typings.matrixAppserviceBridge.anon.Userids
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotpresence
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDotreceipt
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mDottyping
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.eventTypesMod.TypingEvent
    - typings.matrixAppserviceBridge.eventTypesMod.ReadReceiptEvent
    - typings.matrixAppserviceBridge.eventTypesMod.PresenceEvent
  */
  trait EphemeralEvent extends StObject
  object EphemeralEvent {
    
    inline def PresenceEvent(content: Currentlyactive, sender: String): typings.matrixAppserviceBridge.eventTypesMod.PresenceEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.presence")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.eventTypesMod.PresenceEvent]
    }
    
    inline def ReadReceiptEvent(content: StringDictionary[Mread], room_id: String): typings.matrixAppserviceBridge.eventTypesMod.ReadReceiptEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.receipt")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.eventTypesMod.ReadReceiptEvent]
    }
    
    inline def TypingEvent(content: Userids, room_id: String): typings.matrixAppserviceBridge.eventTypesMod.TypingEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.typing")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.eventTypesMod.TypingEvent]
    }
  }
  
  trait PresenceEvent
    extends StObject
       with EphemeralEvent {
    
    var content: Currentlyactive
    
    var sender: String
    
    var `type`: mDotpresence
  }
  object PresenceEvent {
    
    inline def apply(content: Currentlyactive, sender: String): PresenceEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.presence")
      __obj.asInstanceOf[PresenceEvent]
    }
    
    extension [Self <: PresenceEvent](x: Self) {
      
      inline def setContent(value: Currentlyactive): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setType(value: mDotpresence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadReceiptEvent
    extends StObject
       with EphemeralEvent {
    
    var content: StringDictionary[Mread]
    
    var room_id: String
    
    var `type`: mDotreceipt
  }
  object ReadReceiptEvent {
    
    inline def apply(content: StringDictionary[Mread], room_id: String): ReadReceiptEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.receipt")
      __obj.asInstanceOf[ReadReceiptEvent]
    }
    
    extension [Self <: ReadReceiptEvent](x: Self) {
      
      inline def setContent(value: StringDictionary[Mread]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: mDotreceipt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypingEvent
    extends StObject
       with EphemeralEvent {
    
    var content: Userids
    
    var room_id: String
    
    var `type`: mDottyping
  }
  object TypingEvent {
    
    inline def apply(content: Userids, room_id: String): TypingEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.typing")
      __obj.asInstanceOf[TypingEvent]
    }
    
    extension [Self <: TypingEvent](x: Self) {
      
      inline def setContent(value: Userids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: mDottyping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait WeakEvent extends StObject {
    
    var content: Record[String, js.Any]
    
    var event_id: String
    
    var origin_server_ts: Double
    
    var room_id: String
    
    var sender: String
    
    var state_key: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var unsigned: js.UndefOr[Age] = js.undefined
  }
  object WeakEvent {
    
    inline def apply(
      content: Record[String, js.Any],
      event_id: String,
      origin_server_ts: Double,
      room_id: String,
      sender: String,
      `type`: String
    ): WeakEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], origin_server_ts = origin_server_ts.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeakEvent]
    }
    
    extension [Self <: WeakEvent](x: Self) {
      
      inline def setContent(value: Record[String, js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setOrigin_server_ts(value: Double): Self = StObject.set(x, "origin_server_ts", value.asInstanceOf[js.Any])
      
      inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
      
      inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
      
      inline def setState_keyUndefined: Self = StObject.set(x, "state_key", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnsigned(value: Age): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
      
      inline def setUnsignedUndefined: Self = StObject.set(x, "unsigned", js.undefined)
    }
  }
}
