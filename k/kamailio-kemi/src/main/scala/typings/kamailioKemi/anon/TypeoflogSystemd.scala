package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflogSystemd extends js.Object {
  def sd_journal_print(slev: String, stxt: String): Double
  def sd_journal_send_xvap(xname: String): Double
}

object TypeoflogSystemd {
  @scala.inline
  def apply(sd_journal_print: (String, String) => Double, sd_journal_send_xvap: String => Double): TypeoflogSystemd = {
    val __obj = js.Dynamic.literal(sd_journal_print = js.Any.fromFunction2(sd_journal_print), sd_journal_send_xvap = js.Any.fromFunction1(sd_journal_send_xvap))
    __obj.asInstanceOf[TypeoflogSystemd]
  }
}

