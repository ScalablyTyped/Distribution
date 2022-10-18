package typings.hermesProfileTransformer.distTypesEventInterfacesMod

import typings.hermesProfileTransformer.anon.Issuets
import typings.hermesProfileTransformer.anon.Linkedid
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COMPLETE_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COUNTER_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.INSTANT_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.LINKED_ID_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MARK_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.METADATA_EVENTS
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import typings.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.SAMPLE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent
  - typings.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent
*/
trait Event extends StObject
object Event {
  
  inline def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd]
  }
  
  inline def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant]
  }
  
  inline def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart]
  }
  
  inline def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent]
  }
  
  inline def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent]
  }
  
  inline def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter]
  }
  
  inline def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave]
  }
  
  inline def CounterEvent(ph: COUNTER_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent]
  }
  
  inline def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin]
  }
  
  inline def DurationEventEnd(ph: DURATION_EVENTS_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd]
  }
  
  inline def FlowEventEnd(ph: FLOW_EVENTS_END): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd]
  }
  
  inline def FlowEventStart(ph: FLOW_EVENTS_START): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart]
  }
  
  inline def FlowEventStep(ph: FLOW_EVENTS_STEP): typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep]
  }
  
  inline def InstantEvent(ph: INSTANT_EVENTS, s: String): typings.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent]
  }
  
  inline def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent]
  }
  
  inline def MarkEvent(ph: MARK_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent]
  }
  
  inline def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typings.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal]
  }
  
  inline def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess]
  }
  
  inline def MetadataEvent(ph: METADATA_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent]
  }
  
  inline def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated]
  }
  
  inline def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed]
  }
  
  inline def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot]
  }
  
  inline def SampleEvent(ph: SAMPLE_EVENTS): typings.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent]
  }
}
