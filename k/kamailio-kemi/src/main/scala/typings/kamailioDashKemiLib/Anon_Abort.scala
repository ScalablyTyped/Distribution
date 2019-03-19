package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  def abort(): scala.Double
  def core_hash(s1: java.lang.String, s2: java.lang.String, sz: scala.Double): scala.Double
  def lock(lkey: java.lang.String): scala.Double
  def pkg_status(): scala.Double
  def pkg_summary(): scala.Double
  def rand_event(): scala.Double
  def rand_get_prob(): scala.Double
  def rand_reset_prob(): scala.Double
  def rand_set_prob(percent_par: scala.Double): scala.Double
  def shm_status(): scala.Double
  def shm_summary(): scala.Double
  def trylock(lkey: java.lang.String): scala.Double
  def unlock(lkey: java.lang.String): scala.Double
}

object Anon_Abort {
  @scala.inline
  def apply(
    abort: () => scala.Double,
    core_hash: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    lock: java.lang.String => scala.Double,
    pkg_status: () => scala.Double,
    pkg_summary: () => scala.Double,
    rand_event: () => scala.Double,
    rand_get_prob: () => scala.Double,
    rand_reset_prob: () => scala.Double,
    rand_set_prob: scala.Double => scala.Double,
    shm_status: () => scala.Double,
    shm_summary: () => scala.Double,
    trylock: java.lang.String => scala.Double,
    unlock: java.lang.String => scala.Double
  ): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), core_hash = js.Any.fromFunction3(core_hash), lock = js.Any.fromFunction1(lock), pkg_status = js.Any.fromFunction0(pkg_status), pkg_summary = js.Any.fromFunction0(pkg_summary), rand_event = js.Any.fromFunction0(rand_event), rand_get_prob = js.Any.fromFunction0(rand_get_prob), rand_reset_prob = js.Any.fromFunction0(rand_reset_prob), rand_set_prob = js.Any.fromFunction1(rand_set_prob), shm_status = js.Any.fromFunction0(shm_status), shm_summary = js.Any.fromFunction0(shm_summary), trylock = js.Any.fromFunction1(trylock), unlock = js.Any.fromFunction1(unlock))
  
    __obj.asInstanceOf[Anon_Abort]
  }
}

