package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acc {
  
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  @JSGlobal("KSR.acc.acc_db_request")
  @js.native
  def accDbRequest(comment: String, dbtable: String): Double = js.native
  
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  @JSGlobal("KSR.acc.acc_log_request")
  @js.native
  def accLogRequest(comment: String): Double = js.native
  
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  @JSGlobal("KSR.acc.acc_request")
  @js.native
  def accRequest(comment: String, dbtable: String): Double = js.native
}
