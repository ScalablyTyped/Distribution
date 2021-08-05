package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.anon.Issuets
import typings.hermesProfileTransformer.anon.Linkedid
import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typings.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import typings.hermesProfileTransformer.phasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.COMPLETE_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typings.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import typings.hermesProfileTransformer.phasesMod.EventsPhase.COUNTER_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typings.hermesProfileTransformer.phasesMod.EventsPhase.DURATION_EVENTS_END
import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END
import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_START
import typings.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP
import typings.hermesProfileTransformer.phasesMod.EventsPhase.INSTANT_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.MARK_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.METADATA_EVENTS
import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typings.hermesProfileTransformer.phasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import typings.hermesProfileTransformer.phasesMod.EventsPhase.SAMPLE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.eventInterfacesMod.DurationEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.CompleteEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.MetadataEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.SampleEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.ObjectEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.ContextEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.AsyncEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.InstantEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.CounterEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.FlowEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.MarkEvent
  - typings.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent
*/
trait Event extends StObject
object Event {
  
  inline def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd]
  }
  
  inline def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant]
  }
  
  inline def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart]
  }
  
  inline def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ClockSyncEvent]
  }
  
  inline def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.CompleteEvent]
  }
  
  inline def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typings.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter]
  }
  
  inline def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typings.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave]
  }
  
  inline def CounterEvent(ph: COUNTER_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.CounterEvent]
  }
  
  inline def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typings.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.DurationEventBegin]
  }
  
  inline def DurationEventEnd(ph: DURATION_EVENTS_END): typings.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.DurationEventEnd]
  }
  
  inline def FlowEventEnd(ph: FLOW_EVENTS_END): typings.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd]
  }
  
  inline def FlowEventStart(ph: FLOW_EVENTS_START): typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStart]
  }
  
  inline def FlowEventStep(ph: FLOW_EVENTS_STEP): typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.FlowEventStep]
  }
  
  inline def InstantEvent(ph: INSTANT_EVENTS, s: String): typings.hermesProfileTransformer.eventInterfacesMod.InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.InstantEvent]
  }
  
  inline def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.LinkedIDEvent]
  }
  
  inline def MarkEvent(ph: MARK_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MarkEvent]
  }
  
  inline def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal]
  }
  
  inline def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess]
  }
  
  inline def MetadataEvent(ph: METADATA_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MetadataEvent]
  }
  
  inline def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventCreated]
  }
  
  inline def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventDestroyed]
  }
  
  inline def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.ObjectEventSnapshot]
  }
  
  inline def SampleEvent(ph: SAMPLE_EVENTS): typings.hermesProfileTransformer.eventInterfacesMod.SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.SampleEvent]
  }
}
