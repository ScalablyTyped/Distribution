package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcher {
  
  @JSGlobal("KSR.dispatcher")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dsIsFromList(group: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_is_from_list")(group.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dsIsFromListMode(vset: Double, vmode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_is_from_list_mode")(vset.asInstanceOf[js.Any], vmode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsIsFromListUri(vset: Double, vmode: Double, vuri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_is_from_list_uri")(vset.asInstanceOf[js.Any], vmode.asInstanceOf[js.Any], vuri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsIsFromLists(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_is_from_lists")().asInstanceOf[Double]
  
  @scala.inline
  def dsListExists(set: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_list_exists")(set.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dsLoadUnset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_load_unset")().asInstanceOf[Double]
  
  @scala.inline
  def dsLoadUpdate(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_load_update")().asInstanceOf[Double]
  
  @scala.inline
  def dsMarkDst(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_mark_dst")().asInstanceOf[Double]
  
  @scala.inline
  def dsMarkDstState(sval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_mark_dst_state")(sval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dsNextDomain(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_next_domain")().asInstanceOf[Double]
  
  @scala.inline
  def dsNextDst(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_next_dst")().asInstanceOf[Double]
  
  @scala.inline
  def dsReload(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_reload")().asInstanceOf[Double]
  
  @scala.inline
  def dsSelect(set: Double, alg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectDomain(set: Double, alg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_domain")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectDomainLimit(set: Double, alg: Double, limit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_domain_limit")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectDst(set: Double, alg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_dst")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectDstLimit(set: Double, alg: Double, limit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_dst_limit")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectLimit(set: Double, alg: Double, limit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_limit")(set.asInstanceOf[js.Any], alg.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectRoutes(srules: String, smode: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_routes")(srules.asInstanceOf[js.Any], smode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSelectRoutesLimit(srules: String, smode: String, rlimit: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ds_select_routes_limit")(srules.asInstanceOf[js.Any], smode.asInstanceOf[js.Any], rlimit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dsSetDomain(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_set_domain")().asInstanceOf[Double]
  
  @scala.inline
  def dsSetDst(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ds_set_dst")().asInstanceOf[Double]
}
