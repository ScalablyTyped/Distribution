package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDebugger extends js.Object {
  def dbg_pv_dump(): Double
  def dbg_pv_dump_ex(mask: Double, level: Double): Double
}

object TypeofDebugger {
  @scala.inline
  def apply(dbg_pv_dump: () => Double, dbg_pv_dump_ex: (Double, Double) => Double): TypeofDebugger = {
    val __obj = js.Dynamic.literal(dbg_pv_dump = js.Any.fromFunction0(dbg_pv_dump), dbg_pv_dump_ex = js.Any.fromFunction2(dbg_pv_dump_ex))
    __obj.asInstanceOf[TypeofDebugger]
  }
}

