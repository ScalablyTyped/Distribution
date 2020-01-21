package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdispatcher extends js.Object {
  def ds_is_from_list(group: Double): Double
  def ds_is_from_list_mode(vset: Double, vmode: Double): Double
  def ds_is_from_list_uri(vset: Double, vmode: Double, vuri: String): Double
  def ds_is_from_lists(): Double
  def ds_list_exists(set: Double): Double
  def ds_load_unset(): Double
  def ds_load_update(): Double
  def ds_mark_dst(): Double
  def ds_mark_dst_state(sval: String): Double
  def ds_next_domain(): Double
  def ds_next_dst(): Double
  def ds_reload(): Double
  def ds_select(set: Double, alg: Double): Double
  def ds_select_domain(set: Double, alg: Double): Double
  def ds_select_domain_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_dst(set: Double, alg: Double): Double
  def ds_select_dst_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_limit(set: Double, alg: Double, limit: Double): Double
  def ds_select_routes(srules: String, smode: String): Double
  def ds_select_routes_limit(srules: String, smode: String, rlimit: Double): Double
  def ds_set_domain(): Double
  def ds_set_dst(): Double
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
}

