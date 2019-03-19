package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bmlogtimer extends js.Object {
  def bm_log_timer(tname: java.lang.String): scala.Double
  def bm_start_timer(tname: java.lang.String): scala.Double
}

object Anon_Bmlogtimer {
  @scala.inline
  def apply(bm_log_timer: java.lang.String => scala.Double, bm_start_timer: java.lang.String => scala.Double): Anon_Bmlogtimer = {
    val __obj = js.Dynamic.literal(bm_log_timer = js.Any.fromFunction1(bm_log_timer), bm_start_timer = js.Any.fromFunction1(bm_start_timer))
  
    __obj.asInstanceOf[Anon_Bmlogtimer]
  }
}

