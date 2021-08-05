package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acc {
  
  @JSGlobal("KSR.acc")
  @js.native
  val ^ : js.Any = js.native
  
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  inline def accDbRequest(comment: String, dbtable: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("acc_db_request")(comment.asInstanceOf[js.Any], dbtable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  inline def accLogRequest(comment: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acc_log_request")(comment.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  inline def accRequest(comment: String, dbtable: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("acc_request")(comment.asInstanceOf[js.Any], dbtable.asInstanceOf[js.Any])).asInstanceOf[Double]
}
