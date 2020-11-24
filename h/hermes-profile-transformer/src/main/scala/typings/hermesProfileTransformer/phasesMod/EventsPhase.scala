package typings.hermesProfileTransformer.phasesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventsPhase extends js.Object
@JSImport("hermes-profile-transformer/dist/types/Phases", "EventsPhase")
@js.native
object EventsPhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventsPhase with String] = js.native
  
  @js.native
  sealed trait ASYNC_EVENTS_END extends EventsPhase
  /* "F" */ @js.native
  object ASYNC_EVENTS_END extends TopLevel[ASYNC_EVENTS_END with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_NESTABLE_END extends EventsPhase
  /* "e" */ @js.native
  object ASYNC_EVENTS_NESTABLE_END extends TopLevel[ASYNC_EVENTS_NESTABLE_END with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_NESTABLE_INSTANT extends EventsPhase
  /* "n" */ @js.native
  object ASYNC_EVENTS_NESTABLE_INSTANT extends TopLevel[ASYNC_EVENTS_NESTABLE_INSTANT with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_NESTABLE_START extends EventsPhase
  /* "b" */ @js.native
  object ASYNC_EVENTS_NESTABLE_START extends TopLevel[ASYNC_EVENTS_NESTABLE_START with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_START extends EventsPhase
  /* "S" */ @js.native
  object ASYNC_EVENTS_START extends TopLevel[ASYNC_EVENTS_START with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_STEP_INTO extends EventsPhase
  /* "T" */ @js.native
  object ASYNC_EVENTS_STEP_INTO extends TopLevel[ASYNC_EVENTS_STEP_INTO with String]
  
  @js.native
  sealed trait ASYNC_EVENTS_STEP_PAST extends EventsPhase
  /* "p" */ @js.native
  object ASYNC_EVENTS_STEP_PAST extends TopLevel[ASYNC_EVENTS_STEP_PAST with String]
  
  @js.native
  sealed trait CLOCK_SYNC_EVENTS extends EventsPhase
  /* "c" */ @js.native
  object CLOCK_SYNC_EVENTS extends TopLevel[CLOCK_SYNC_EVENTS with String]
  
  @js.native
  sealed trait COMPLETE_EVENTS extends EventsPhase
  /* "X" */ @js.native
  object COMPLETE_EVENTS extends TopLevel[COMPLETE_EVENTS with String]
  
  @js.native
  sealed trait CONTEXT_EVENTS_ENTER extends EventsPhase
  /* "(" */ @js.native
  object CONTEXT_EVENTS_ENTER extends TopLevel[CONTEXT_EVENTS_ENTER with String]
  
  @js.native
  sealed trait CONTEXT_EVENTS_LEAVE extends EventsPhase
  /* ")" */ @js.native
  object CONTEXT_EVENTS_LEAVE extends TopLevel[CONTEXT_EVENTS_LEAVE with String]
  
  @js.native
  sealed trait COUNTER_EVENTS extends EventsPhase
  /* "C" */ @js.native
  object COUNTER_EVENTS extends TopLevel[COUNTER_EVENTS with String]
  
  @js.native
  sealed trait DURATION_EVENTS_BEGIN extends EventsPhase
  /* "B" */ @js.native
  object DURATION_EVENTS_BEGIN extends TopLevel[DURATION_EVENTS_BEGIN with String]
  
  @js.native
  sealed trait DURATION_EVENTS_END extends EventsPhase
  /* "E" */ @js.native
  object DURATION_EVENTS_END extends TopLevel[DURATION_EVENTS_END with String]
  
  @js.native
  sealed trait FLOW_EVENTS_END extends EventsPhase
  /* "f" */ @js.native
  object FLOW_EVENTS_END extends TopLevel[FLOW_EVENTS_END with String]
  
  @js.native
  sealed trait FLOW_EVENTS_START extends EventsPhase
  /* "s" */ @js.native
  object FLOW_EVENTS_START extends TopLevel[FLOW_EVENTS_START with String]
  
  @js.native
  sealed trait FLOW_EVENTS_STEP extends EventsPhase
  /* "t" */ @js.native
  object FLOW_EVENTS_STEP extends TopLevel[FLOW_EVENTS_STEP with String]
  
  @js.native
  sealed trait INSTANT_EVENTS extends EventsPhase
  /* "I" */ @js.native
  object INSTANT_EVENTS extends TopLevel[INSTANT_EVENTS with String]
  
  @js.native
  sealed trait LINKED_ID_EVENTS extends EventsPhase
  /* "=" */ @js.native
  object LINKED_ID_EVENTS extends TopLevel[LINKED_ID_EVENTS with String]
  
  @js.native
  sealed trait MARK_EVENTS extends EventsPhase
  /* "R" */ @js.native
  object MARK_EVENTS extends TopLevel[MARK_EVENTS with String]
  
  @js.native
  sealed trait MEMORY_DUMP_EVENTS_GLOBAL extends EventsPhase
  /* "V" */ @js.native
  object MEMORY_DUMP_EVENTS_GLOBAL extends TopLevel[MEMORY_DUMP_EVENTS_GLOBAL with String]
  
  @js.native
  sealed trait MEMORY_DUMP_EVENTS_PROCESS extends EventsPhase
  /* "v" */ @js.native
  object MEMORY_DUMP_EVENTS_PROCESS extends TopLevel[MEMORY_DUMP_EVENTS_PROCESS with String]
  
  @js.native
  sealed trait METADATA_EVENTS extends EventsPhase
  /* "M" */ @js.native
  object METADATA_EVENTS extends TopLevel[METADATA_EVENTS with String]
  
  @js.native
  sealed trait OBJECT_EVENTS_CREATED extends EventsPhase
  /* "N" */ @js.native
  object OBJECT_EVENTS_CREATED extends TopLevel[OBJECT_EVENTS_CREATED with String]
  
  @js.native
  sealed trait OBJECT_EVENTS_DESTROYED extends EventsPhase
  /* "D" */ @js.native
  object OBJECT_EVENTS_DESTROYED extends TopLevel[OBJECT_EVENTS_DESTROYED with String]
  
  @js.native
  sealed trait OBJECT_EVENTS_SNAPSHOT extends EventsPhase
  /* "O" */ @js.native
  object OBJECT_EVENTS_SNAPSHOT extends TopLevel[OBJECT_EVENTS_SNAPSHOT with String]
  
  @js.native
  sealed trait SAMPLE_EVENTS extends EventsPhase
  /* "P" */ @js.native
  object SAMPLE_EVENTS extends TopLevel[SAMPLE_EVENTS with String]
}
