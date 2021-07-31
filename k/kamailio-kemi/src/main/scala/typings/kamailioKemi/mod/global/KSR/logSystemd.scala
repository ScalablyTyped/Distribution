package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logSystemd {
  
  @JSGlobal("KSR.log_systemd")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sdJournalPrint(slev: String, stxt: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sd_journal_print")(slev.asInstanceOf[js.Any], stxt.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sdJournalSendXvap(xname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sd_journal_send_xvap")(xname.asInstanceOf[js.Any]).asInstanceOf[Double]
}
