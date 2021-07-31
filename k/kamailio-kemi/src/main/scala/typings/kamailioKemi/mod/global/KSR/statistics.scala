package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statistics {
  
  @JSGlobal("KSR.statistics")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resetStat(sname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reset_stat")(sname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def updateStat(sname: String, sval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("update_stat")(sname.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
}
