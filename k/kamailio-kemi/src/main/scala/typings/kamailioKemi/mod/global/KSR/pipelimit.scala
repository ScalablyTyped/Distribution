package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelimit {
  
  @JSGlobal("KSR.pipelimit.pl_check")
  @js.native
  def plCheck(pipeid: String): Double = js.native
  
  @JSGlobal("KSR.pipelimit.pl_check_limit")
  @js.native
  def plCheckLimit(pipeid: String, alg: String, limit: Double): Double = js.native
  
  @JSGlobal("KSR.pipelimit.pl_drop")
  @js.native
  def plDrop(): Double = js.native
  
  @JSGlobal("KSR.pipelimit.pl_drop_range")
  @js.native
  def plDropRange(rmin: Double, rmax: Double): Double = js.native
  
  @JSGlobal("KSR.pipelimit.pl_drop_retry")
  @js.native
  def plDropRetry(rafter: Double): Double = js.native
}
