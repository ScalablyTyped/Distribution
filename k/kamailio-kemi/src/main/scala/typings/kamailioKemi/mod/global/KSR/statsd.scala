package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsd {
  
  @JSGlobal("KSR.statsd")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def statsdDecr(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("statsd_decr")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def statsdGauge(key: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("statsd_gauge")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def statsdIncr(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("statsd_incr")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def statsdSet(key: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("statsd_set")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def statsdStart(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("statsd_start")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def statsdStop(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("statsd_stop")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
}
