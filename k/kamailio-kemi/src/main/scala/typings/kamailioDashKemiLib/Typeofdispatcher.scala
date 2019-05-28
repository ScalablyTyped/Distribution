package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdispatcher extends js.Object {
  def ds_is_from_list(group: scala.Double): scala.Double
  def ds_is_from_list_mode(vset: scala.Double, vmode: scala.Double): scala.Double
  def ds_is_from_list_uri(vset: scala.Double, vmode: scala.Double, vuri: java.lang.String): scala.Double
  def ds_is_from_lists(): scala.Double
  def ds_list_exists(set: scala.Double): scala.Double
  def ds_load_unset(): scala.Double
  def ds_load_update(): scala.Double
  def ds_mark_dst(): scala.Double
  def ds_mark_dst_state(sval: java.lang.String): scala.Double
  def ds_next_domain(): scala.Double
  def ds_next_dst(): scala.Double
  def ds_reload(): scala.Double
  def ds_select(set: scala.Double, alg: scala.Double): scala.Double
  def ds_select_domain(set: scala.Double, alg: scala.Double): scala.Double
  def ds_select_domain_limit(set: scala.Double, alg: scala.Double, limit: scala.Double): scala.Double
  def ds_select_dst(set: scala.Double, alg: scala.Double): scala.Double
  def ds_select_dst_limit(set: scala.Double, alg: scala.Double, limit: scala.Double): scala.Double
  def ds_select_limit(set: scala.Double, alg: scala.Double, limit: scala.Double): scala.Double
  def ds_select_routes(srules: java.lang.String, smode: java.lang.String): scala.Double
  def ds_select_routes_limit(srules: java.lang.String, smode: java.lang.String, rlimit: scala.Double): scala.Double
  def ds_set_domain(): scala.Double
  def ds_set_dst(): scala.Double
}

object Typeofdispatcher {
  @scala.inline
  def apply(
    ds_is_from_list: scala.Double => scala.Double,
    ds_is_from_list_mode: (scala.Double, scala.Double) => scala.Double,
    ds_is_from_list_uri: (scala.Double, scala.Double, java.lang.String) => scala.Double,
    ds_is_from_lists: () => scala.Double,
    ds_list_exists: scala.Double => scala.Double,
    ds_load_unset: () => scala.Double,
    ds_load_update: () => scala.Double,
    ds_mark_dst: () => scala.Double,
    ds_mark_dst_state: java.lang.String => scala.Double,
    ds_next_domain: () => scala.Double,
    ds_next_dst: () => scala.Double,
    ds_reload: () => scala.Double,
    ds_select: (scala.Double, scala.Double) => scala.Double,
    ds_select_domain: (scala.Double, scala.Double) => scala.Double,
    ds_select_domain_limit: (scala.Double, scala.Double, scala.Double) => scala.Double,
    ds_select_dst: (scala.Double, scala.Double) => scala.Double,
    ds_select_dst_limit: (scala.Double, scala.Double, scala.Double) => scala.Double,
    ds_select_limit: (scala.Double, scala.Double, scala.Double) => scala.Double,
    ds_select_routes: (java.lang.String, java.lang.String) => scala.Double,
    ds_select_routes_limit: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    ds_set_domain: () => scala.Double,
    ds_set_dst: () => scala.Double
  ): Typeofdispatcher = {
    val __obj = js.Dynamic.literal(ds_is_from_list = js.Any.fromFunction1(ds_is_from_list), ds_is_from_list_mode = js.Any.fromFunction2(ds_is_from_list_mode), ds_is_from_list_uri = js.Any.fromFunction3(ds_is_from_list_uri), ds_is_from_lists = js.Any.fromFunction0(ds_is_from_lists), ds_list_exists = js.Any.fromFunction1(ds_list_exists), ds_load_unset = js.Any.fromFunction0(ds_load_unset), ds_load_update = js.Any.fromFunction0(ds_load_update), ds_mark_dst = js.Any.fromFunction0(ds_mark_dst), ds_mark_dst_state = js.Any.fromFunction1(ds_mark_dst_state), ds_next_domain = js.Any.fromFunction0(ds_next_domain), ds_next_dst = js.Any.fromFunction0(ds_next_dst), ds_reload = js.Any.fromFunction0(ds_reload), ds_select = js.Any.fromFunction2(ds_select), ds_select_domain = js.Any.fromFunction2(ds_select_domain), ds_select_domain_limit = js.Any.fromFunction3(ds_select_domain_limit), ds_select_dst = js.Any.fromFunction2(ds_select_dst), ds_select_dst_limit = js.Any.fromFunction3(ds_select_dst_limit), ds_select_limit = js.Any.fromFunction3(ds_select_limit), ds_select_routes = js.Any.fromFunction2(ds_select_routes), ds_select_routes_limit = js.Any.fromFunction3(ds_select_routes_limit), ds_set_domain = js.Any.fromFunction0(ds_set_domain), ds_set_dst = js.Any.fromFunction0(ds_set_dst))
  
    __obj.asInstanceOf[Typeofdispatcher]
  }
}

