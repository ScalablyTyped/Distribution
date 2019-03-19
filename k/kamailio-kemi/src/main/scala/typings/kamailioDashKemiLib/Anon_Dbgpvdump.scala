package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dbgpvdump extends js.Object {
  def dbg_pv_dump(): scala.Double
  def dbg_pv_dump_ex(mask: scala.Double, level: scala.Double): scala.Double
}

object Anon_Dbgpvdump {
  @scala.inline
  def apply(dbg_pv_dump: () => scala.Double, dbg_pv_dump_ex: (scala.Double, scala.Double) => scala.Double): Anon_Dbgpvdump = {
    val __obj = js.Dynamic.literal(dbg_pv_dump = js.Any.fromFunction0(dbg_pv_dump), dbg_pv_dump_ex = js.Any.fromFunction2(dbg_pv_dump_ex))
  
    __obj.asInstanceOf[Anon_Dbgpvdump]
  }
}

