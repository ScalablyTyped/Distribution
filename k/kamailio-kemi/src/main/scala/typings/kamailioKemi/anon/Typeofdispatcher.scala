package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdispatcher extends js.Object {
  
  def ds_is_from_list(group: Double): Double = js.native
  
  def ds_is_from_list_mode(vset: Double, vmode: Double): Double = js.native
  
  def ds_is_from_list_uri(vset: Double, vmode: Double, vuri: String): Double = js.native
  
  def ds_is_from_lists(): Double = js.native
  
  def ds_list_exists(set: Double): Double = js.native
  
  def ds_load_unset(): Double = js.native
  
  def ds_load_update(): Double = js.native
  
  def ds_mark_dst(): Double = js.native
  
  def ds_mark_dst_state(sval: String): Double = js.native
  
  def ds_next_domain(): Double = js.native
  
  def ds_next_dst(): Double = js.native
  
  def ds_reload(): Double = js.native
  
  def ds_select(set: Double, alg: Double): Double = js.native
  
  def ds_select_domain(set: Double, alg: Double): Double = js.native
  
  def ds_select_domain_limit(set: Double, alg: Double, limit: Double): Double = js.native
  
  def ds_select_dst(set: Double, alg: Double): Double = js.native
  
  def ds_select_dst_limit(set: Double, alg: Double, limit: Double): Double = js.native
  
  def ds_select_limit(set: Double, alg: Double, limit: Double): Double = js.native
  
  def ds_select_routes(srules: String, smode: String): Double = js.native
  
  def ds_select_routes_limit(srules: String, smode: String, rlimit: Double): Double = js.native
  
  def ds_set_domain(): Double = js.native
  
  def ds_set_dst(): Double = js.native
}
object Typeofdispatcher {
  
  @scala.inline
  def apply(
    ds_is_from_list: Double => Double,
    ds_is_from_list_mode: (Double, Double) => Double,
    ds_is_from_list_uri: (Double, Double, String) => Double,
    ds_is_from_lists: () => Double,
    ds_list_exists: Double => Double,
    ds_load_unset: () => Double,
    ds_load_update: () => Double,
    ds_mark_dst: () => Double,
    ds_mark_dst_state: String => Double,
    ds_next_domain: () => Double,
    ds_next_dst: () => Double,
    ds_reload: () => Double,
    ds_select: (Double, Double) => Double,
    ds_select_domain: (Double, Double) => Double,
    ds_select_domain_limit: (Double, Double, Double) => Double,
    ds_select_dst: (Double, Double) => Double,
    ds_select_dst_limit: (Double, Double, Double) => Double,
    ds_select_limit: (Double, Double, Double) => Double,
    ds_select_routes: (String, String) => Double,
    ds_select_routes_limit: (String, String, Double) => Double,
    ds_set_domain: () => Double,
    ds_set_dst: () => Double
  ): Typeofdispatcher = {
    val __obj = js.Dynamic.literal(ds_is_from_list = js.Any.fromFunction1(ds_is_from_list), ds_is_from_list_mode = js.Any.fromFunction2(ds_is_from_list_mode), ds_is_from_list_uri = js.Any.fromFunction3(ds_is_from_list_uri), ds_is_from_lists = js.Any.fromFunction0(ds_is_from_lists), ds_list_exists = js.Any.fromFunction1(ds_list_exists), ds_load_unset = js.Any.fromFunction0(ds_load_unset), ds_load_update = js.Any.fromFunction0(ds_load_update), ds_mark_dst = js.Any.fromFunction0(ds_mark_dst), ds_mark_dst_state = js.Any.fromFunction1(ds_mark_dst_state), ds_next_domain = js.Any.fromFunction0(ds_next_domain), ds_next_dst = js.Any.fromFunction0(ds_next_dst), ds_reload = js.Any.fromFunction0(ds_reload), ds_select = js.Any.fromFunction2(ds_select), ds_select_domain = js.Any.fromFunction2(ds_select_domain), ds_select_domain_limit = js.Any.fromFunction3(ds_select_domain_limit), ds_select_dst = js.Any.fromFunction2(ds_select_dst), ds_select_dst_limit = js.Any.fromFunction3(ds_select_dst_limit), ds_select_limit = js.Any.fromFunction3(ds_select_limit), ds_select_routes = js.Any.fromFunction2(ds_select_routes), ds_select_routes_limit = js.Any.fromFunction3(ds_select_routes_limit), ds_set_domain = js.Any.fromFunction0(ds_set_domain), ds_set_dst = js.Any.fromFunction0(ds_set_dst))
    __obj.asInstanceOf[Typeofdispatcher]
  }
  
  @scala.inline
  implicit class TypeofdispatcherOps[Self <: Typeofdispatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDs_is_from_list(value: Double => Double): Self = this.set("ds_is_from_list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDs_is_from_list_mode(value: (Double, Double) => Double): Self = this.set("ds_is_from_list_mode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDs_is_from_list_uri(value: (Double, Double, String) => Double): Self = this.set("ds_is_from_list_uri", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDs_is_from_lists(value: () => Double): Self = this.set("ds_is_from_lists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_list_exists(value: Double => Double): Self = this.set("ds_list_exists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDs_load_unset(value: () => Double): Self = this.set("ds_load_unset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_load_update(value: () => Double): Self = this.set("ds_load_update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_mark_dst(value: () => Double): Self = this.set("ds_mark_dst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_mark_dst_state(value: String => Double): Self = this.set("ds_mark_dst_state", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDs_next_domain(value: () => Double): Self = this.set("ds_next_domain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_next_dst(value: () => Double): Self = this.set("ds_next_dst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_reload(value: () => Double): Self = this.set("ds_reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_select(value: (Double, Double) => Double): Self = this.set("ds_select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDs_select_domain(value: (Double, Double) => Double): Self = this.set("ds_select_domain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDs_select_domain_limit(value: (Double, Double, Double) => Double): Self = this.set("ds_select_domain_limit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDs_select_dst(value: (Double, Double) => Double): Self = this.set("ds_select_dst", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDs_select_dst_limit(value: (Double, Double, Double) => Double): Self = this.set("ds_select_dst_limit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDs_select_limit(value: (Double, Double, Double) => Double): Self = this.set("ds_select_limit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDs_select_routes(value: (String, String) => Double): Self = this.set("ds_select_routes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDs_select_routes_limit(value: (String, String, Double) => Double): Self = this.set("ds_select_routes_limit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDs_set_domain(value: () => Double): Self = this.set("ds_set_domain", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDs_set_dst(value: () => Double): Self = this.set("ds_set_dst", js.Any.fromFunction0(value))
  }
}
