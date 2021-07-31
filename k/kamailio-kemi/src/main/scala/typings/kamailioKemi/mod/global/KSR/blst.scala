package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blst {
  
  @JSGlobal("KSR.blst")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def blstAdd(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_add")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def blstAddDefault(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_add_default")().asInstanceOf[Double]
  
  @scala.inline
  def blstAddRetryAfter(t_min: Double, t_max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("blst_add_retry_after")(t_min.asInstanceOf[js.Any], t_max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def blstClearIgnore(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_clear_ignore")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def blstClearIgnoreAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_clear_ignore_all")().asInstanceOf[Double]
  
  @scala.inline
  def blstDel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_del")().asInstanceOf[Double]
  
  @scala.inline
  def blstIsBlacklisted(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_is_blacklisted")().asInstanceOf[Double]
  
  @scala.inline
  def blstRplClearIgnore(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_rpl_clear_ignore")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def blstRplClearIgnoreAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_rpl_clear_ignore_all")().asInstanceOf[Double]
  
  @scala.inline
  def blstRplSetIgnore(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_rpl_set_ignore")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def blstRplSetIgnoreAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_rpl_set_ignore_all")().asInstanceOf[Double]
  
  @scala.inline
  def blstSetIgnore(mask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_set_ignore")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def blstSetIgnoreAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blst_set_ignore_all")().asInstanceOf[Double]
}
