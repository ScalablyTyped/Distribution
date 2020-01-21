package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofexec extends js.Object {
  def exec_avp(cmd: String): Double
  def exec_dset(cmd: String): Double
  def exec_msg(cmd: String): Double
}

object Typeofexec {
  @scala.inline
  def apply(exec_avp: String => Double, exec_dset: String => Double, exec_msg: String => Double): Typeofexec = {
    val __obj = js.Dynamic.literal(exec_avp = js.Any.fromFunction1(exec_avp), exec_dset = js.Any.fromFunction1(exec_dset), exec_msg = js.Any.fromFunction1(exec_msg))
  
    __obj.asInstanceOf[Typeofexec]
  }
}

