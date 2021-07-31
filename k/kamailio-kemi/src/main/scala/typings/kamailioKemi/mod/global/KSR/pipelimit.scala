package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelimit {
  
  @JSGlobal("KSR.pipelimit")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def plCheck(pipeid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pl_check")(pipeid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def plCheckLimit(pipeid: String, alg: String, limit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pl_check_limit")(pipeid.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def plDrop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pl_drop")().asInstanceOf[Double]
  
  @scala.inline
  def plDropRange(rmin: Double, rmax: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pl_drop_range")(rmin.asInstanceOf[js.Any], rmax.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def plDropRetry(rafter: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pl_drop_retry")(rafter.asInstanceOf[js.Any]).asInstanceOf[Double]
}
