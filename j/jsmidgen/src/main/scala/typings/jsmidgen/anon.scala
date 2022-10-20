package typings.jsmidgen

import typings.jsmidgen.mod.Event
import typings.jsmidgen.mod.MetaEvent
import typings.jsmidgen.mod.MetaEventType
import typings.jsmidgen.mod.MidiChannel
import typings.jsmidgen.mod.MidiEventType
import typings.jsmidgen.mod.MidiParameterValue
import typings.jsmidgen.mod.Track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Channel extends StObject {
    
    var channel: MidiChannel
    
    var param1: MidiParameterValue
    
    var param2: js.UndefOr[MidiParameterValue] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var `type`: MidiEventType
  }
  object Channel {
    
    inline def apply(channel: MidiChannel, param1: MidiParameterValue, `type`: MidiEventType): Channel = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], param1 = param1.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setChannel(value: MidiChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setParam1(value: MidiParameterValue): Self = StObject.set(x, "param1", value.asInstanceOf[js.Any])
      
      inline def setParam2(value: MidiParameterValue): Self = StObject.set(x, "param2", value.asInstanceOf[js.Any])
      
      inline def setParam2Undefined: Self = StObject.set(x, "param2", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: MidiEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[String | js.Array[Double]] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var `type`: MetaEventType
  }
  object Data {
    
    inline def apply(`type`: MetaEventType): Data = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String | js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: MetaEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var events: js.UndefOr[js.Array[Event | MetaEvent]] = js.undefined
  }
  object Events {
    
    inline def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setEvents(value: js.Array[Event | MetaEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: (Event | MetaEvent)*): Self = StObject.set(x, "events", js.Array(value*))
    }
  }
  
  trait Ticks extends StObject {
    
    var ticks: js.UndefOr[Double] = js.undefined
    
    var tracks: js.UndefOr[js.Array[Track]] = js.undefined
  }
  object Ticks {
    
    inline def apply(): Ticks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ticks]
    }
    
    extension [Self <: Ticks](x: Self) {
      
      inline def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTracks(value: js.Array[Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
      
      inline def setTracksVarargs(value: Track*): Self = StObject.set(x, "tracks", js.Array(value*))
    }
  }
}
