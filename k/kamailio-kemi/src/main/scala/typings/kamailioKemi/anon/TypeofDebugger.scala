package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDebugger extends js.Object {
  
  def dbg_pv_dump(): Double = js.native
  
  def dbg_pv_dump_ex(mask: Double, level: Double): Double = js.native
}
object TypeofDebugger {
  
  @scala.inline
  def apply(dbg_pv_dump: () => Double, dbg_pv_dump_ex: (Double, Double) => Double): TypeofDebugger = {
    val __obj = js.Dynamic.literal(dbg_pv_dump = js.Any.fromFunction0(dbg_pv_dump), dbg_pv_dump_ex = js.Any.fromFunction2(dbg_pv_dump_ex))
    __obj.asInstanceOf[TypeofDebugger]
  }
  
  @scala.inline
  implicit class TypeofDebuggerOps[Self <: TypeofDebugger] (val x: Self) extends AnyVal {
    
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
    def setDbg_pv_dump(value: () => Double): Self = this.set("dbg_pv_dump", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDbg_pv_dump_ex(value: (Double, Double) => Double): Self = this.set("dbg_pv_dump_ex", js.Any.fromFunction2(value))
  }
}
