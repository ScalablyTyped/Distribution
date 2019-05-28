package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflog_systemd extends js.Object {
  def sd_journal_print(slev: java.lang.String, stxt: java.lang.String): scala.Double
  def sd_journal_send_xvap(xname: java.lang.String): scala.Double
}

object Typeoflog_systemd {
  @scala.inline
  def apply(
    sd_journal_print: (java.lang.String, java.lang.String) => scala.Double,
    sd_journal_send_xvap: java.lang.String => scala.Double
  ): Typeoflog_systemd = {
    val __obj = js.Dynamic.literal(sd_journal_print = js.Any.fromFunction2(sd_journal_print), sd_journal_send_xvap = js.Any.fromFunction1(sd_journal_send_xvap))
  
    __obj.asInstanceOf[Typeoflog_systemd]
  }
}

