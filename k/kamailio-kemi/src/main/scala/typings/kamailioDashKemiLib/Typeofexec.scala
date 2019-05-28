package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofexec extends js.Object {
  def exec_avp(cmd: java.lang.String): scala.Double
  def exec_dset(cmd: java.lang.String): scala.Double
  def exec_msg(cmd: java.lang.String): scala.Double
}

object Typeofexec {
  @scala.inline
  def apply(
    exec_avp: java.lang.String => scala.Double,
    exec_dset: java.lang.String => scala.Double,
    exec_msg: java.lang.String => scala.Double
  ): Typeofexec = {
    val __obj = js.Dynamic.literal(exec_avp = js.Any.fromFunction1(exec_avp), exec_dset = js.Any.fromFunction1(exec_dset), exec_msg = js.Any.fromFunction1(exec_msg))
  
    __obj.asInstanceOf[Typeofexec]
  }
}

