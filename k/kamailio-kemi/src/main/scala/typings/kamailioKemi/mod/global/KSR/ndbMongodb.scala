package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ndbMongodb {
  
  @JSGlobal("KSR.ndb_mongodb")
  @js.native
  val ^ : js.Any = js.native
  
  inline def exec(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(ssrv.asInstanceOf[js.Any], sdname.asInstanceOf[js.Any], scname.asInstanceOf[js.Any], scmd.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def execSimple(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("exec_simple")(ssrv.asInstanceOf[js.Any], sdname.asInstanceOf[js.Any], scname.asInstanceOf[js.Any], scmd.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def find(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(ssrv.asInstanceOf[js.Any], sdname.asInstanceOf[js.Any], scname.asInstanceOf[js.Any], scmd.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findOne(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("find_one")(ssrv.asInstanceOf[js.Any], sdname.asInstanceOf[js.Any], scname.asInstanceOf[js.Any], scmd.asInstanceOf[js.Any], sres.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def freeReply(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("free_reply")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextReply(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("next_reply")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
}
