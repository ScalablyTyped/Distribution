package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cnxcc {
  
  @JSGlobal("KSR.cnxcc.get_channel_count")
  @js.native
  def getChannelCount(sclient: String, pvname: String): Double = js.native
  
  @JSGlobal("KSR.cnxcc.set_max_channels")
  @js.native
  def setMaxChannels(sclient: String, max_chan: Double): Double = js.native
  
  @JSGlobal("KSR.cnxcc.set_max_credit")
  @js.native
  def setMaxCredit(sclient: String, scredit: String, scps: String, initp: Double, finishp: Double): Double = js.native
  
  @JSGlobal("KSR.cnxcc.set_max_time")
  @js.native
  def setMaxTime(sclient: String, max_secs: Double): Double = js.native
  
  @JSGlobal("KSR.cnxcc.terminate_all")
  @js.native
  def terminateAll(sclient: String): Double = js.native
  
  @JSGlobal("KSR.cnxcc.update_max_time")
  @js.native
  def updateMaxTime(sclient: String, secs: Double): Double = js.native
}
