package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsd {
  
  @JSGlobal("KSR.statsd.statsd_decr")
  @js.native
  def statsdDecr(key: String): Double = js.native
  
  @JSGlobal("KSR.statsd.statsd_gauge")
  @js.native
  def statsdGauge(key: String, `val`: String): Double = js.native
  
  @JSGlobal("KSR.statsd.statsd_incr")
  @js.native
  def statsdIncr(key: String): Double = js.native
  
  @JSGlobal("KSR.statsd.statsd_set")
  @js.native
  def statsdSet(key: String, `val`: String): Double = js.native
  
  @JSGlobal("KSR.statsd.statsd_start")
  @js.native
  def statsdStart(key: String): Double = js.native
  
  @JSGlobal("KSR.statsd.statsd_stop")
  @js.native
  def statsdStop(key: String): Double = js.native
}
