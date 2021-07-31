package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counters {
  
  @JSGlobal("KSR.counters")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(sname: String, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(sname.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def inc(sname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("inc")(sname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def reset(sname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(sname.asInstanceOf[js.Any]).asInstanceOf[Double]
}
