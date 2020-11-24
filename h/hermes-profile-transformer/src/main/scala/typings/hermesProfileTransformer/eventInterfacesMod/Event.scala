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
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait Event extends js.Object
object Event {
  
  @scala.inline
  def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def SampleEvent(ph: SAMPLE_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def CounterEvent(ph: COUNTER_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def InstantEvent(ph: INSTANT_EVENTS, s: String): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MarkEvent(ph: MARK_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MetadataEvent(ph: METADATA_EVENTS): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): Event = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def DurationEventEnd(ph: DURATION_EVENTS_END): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def FlowEventStart(ph: FLOW_EVENTS_START): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def FlowEventEnd(ph: FLOW_EVENTS_END): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): Event = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  def FlowEventStep(ph: FLOW_EVENTS_STEP): Event = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}
