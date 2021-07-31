package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal
  - typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess
*/
trait MemoryDumpEvent
  extends StObject
     with Event
object MemoryDumpEvent {
  
  @scala.inline
  def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpGlobal]
  }
  
  @scala.inline
  def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hermesProfileTransformer.eventInterfacesMod.MemoryDumpProcess]
  }
}
