package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cnxcc {
  
  @JSGlobal("KSR.cnxcc")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getChannelCount(sclient: String, pvname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_channel_count")(sclient.asInstanceOf[js.Any], pvname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setMaxChannels(sclient: String, max_chan: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_max_channels")(sclient.asInstanceOf[js.Any], max_chan.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setMaxCredit(sclient: String, scredit: String, scps: String, initp: Double, finishp: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_max_credit")(sclient.asInstanceOf[js.Any], scredit.asInstanceOf[js.Any], scps.asInstanceOf[js.Any], initp.asInstanceOf[js.Any], finishp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def setMaxTime(sclient: String, max_secs: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_max_time")(sclient.asInstanceOf[js.Any], max_secs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def terminateAll(sclient: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate_all")(sclient.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def updateMaxTime(sclient: String, secs: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("update_max_time")(sclient.asInstanceOf[js.Any], secs.asInstanceOf[js.Any])).asInstanceOf[Double]
}
