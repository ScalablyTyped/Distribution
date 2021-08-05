package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryDumpGlobal
  extends StObject
     with SharedEventProperties
     with MemoryDumpEvent {
  
  var id: String
  
  @JSName("ph")
  var ph_MemoryDumpGlobal: MEMORY_DUMP_EVENTS_GLOBAL
}
object MemoryDumpGlobal {
  
  inline def apply(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDumpGlobal]
  }
  
  extension [Self <: MemoryDumpGlobal](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPh(value: MEMORY_DUMP_EVENTS_GLOBAL): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
