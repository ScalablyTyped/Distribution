package typings.hermesProfileTransformer.eventInterfacesMod

import typings.hermesProfileTransformer.phasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryDumpGlobal
  extends MemoryDumpEvent
     with SharedEventProperties {
  
  var id: String = js.native
  
  @JSName("ph")
  var ph_MemoryDumpGlobal: MEMORY_DUMP_EVENTS_GLOBAL = js.native
}
object MemoryDumpGlobal {
  
  @scala.inline
  def apply(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDumpGlobal]
  }
  
  @scala.inline
  implicit class MemoryDumpGlobalOps[Self <: MemoryDumpGlobal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: MEMORY_DUMP_EVENTS_GLOBAL): Self = this.set("ph", value.asInstanceOf[js.Any])
  }
}
