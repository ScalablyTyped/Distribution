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

object libComponentsEventTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.libComponentsEventTypesMod.TypingEvent
    - typings.matrixAppserviceBridge.libComponentsEventTypesMod.ReadReceiptEvent
    - typings.matrixAppserviceBridge.libComponentsEventTypesMod.PresenceEvent
  */
  trait EphemeralEvent extends StObject
  object EphemeralEvent {
    
    inline def PresenceEvent(content: Currentlyactive, sender: String): typings.matrixAppserviceBridge.libComponentsEventTypesMod.PresenceEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.presence")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.libComponentsEventTypesMod.PresenceEvent]
    }
    
    inline def ReadReceiptEvent(content: StringDictionary[Mread], room_id: String): typings.matrixAppserviceBridge.libComponentsEventTypesMod.ReadReceiptEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.receipt")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.libComponentsEventTypesMod.ReadReceiptEvent]
    }
    
    inline def TypingEvent(content: Userids, room_id: String): typings.matrixAppserviceBridge.libComponentsEventTypesMod.TypingEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("m.typing")
      __obj.asInstanceOf[typings.matrixAppserviceBridge.libComponentsEventTypesMod.TypingEvent]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PresenceEvent] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadReceiptEvent] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypingEvent] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Userids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
      
      inline def setType(value: mDottyping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait WeakEvent extends StObject {
    
    var content: Record[String, Any]
    
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
      content: Record[String, Any],
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakEvent] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Record[String, Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
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
  
  trait WeakStateEvent
    extends StObject
       with WeakEvent {
    
    @JSName("state_key")
    var state_key_WeakStateEvent: String
  }
  object WeakStateEvent {
    
    inline def apply(
      content: Record[String, Any],
      event_id: String,
      origin_server_ts: Double,
      room_id: String,
      sender: String,
      state_key: String,
      `type`: String
    ): WeakStateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], origin_server_ts = origin_server_ts.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeakStateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakStateEvent] (val x: Self) extends AnyVal {
      
      inline def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
    }
  }
}
