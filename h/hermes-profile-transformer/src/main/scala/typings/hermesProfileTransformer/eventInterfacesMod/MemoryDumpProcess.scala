package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryDumpProcess
  extends MemoryDumpEvent
     with SharedEventProperties {
  
  var id: String = js.native
  
  @JSName("ph")
  var ph_MemoryDumpProcess: MEMORY_DUMP_EVENTS_PROCESS = js.native
}
object MemoryDumpProcess {
  
  @scala.inline
  def apply(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDumpProcess]
  }
  
  @scala.inline
  implicit class MemoryDumpProcessMutableBuilder[Self <: MemoryDumpProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: MEMORY_DUMP_EVENTS_PROCESS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
