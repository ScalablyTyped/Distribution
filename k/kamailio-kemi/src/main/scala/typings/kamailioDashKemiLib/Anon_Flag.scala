package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flag extends js.Object {
  def sst_check_min(flag: scala.Double): scala.Double
}

object Anon_Flag {
  @scala.inline
  def apply(sst_check_min: scala.Double => scala.Double): Anon_Flag = {
    val __obj = js.Dynamic.literal(sst_check_min = js.Any.fromFunction1(sst_check_min))
  
    __obj.asInstanceOf[Anon_Flag]
  }
}

