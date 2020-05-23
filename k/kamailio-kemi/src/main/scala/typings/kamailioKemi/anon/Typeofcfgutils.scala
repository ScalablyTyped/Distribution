package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcfgutils extends js.Object {
  def abort(): Double
  def core_hash(s1: String, s2: String, sz: Double): Double
  def lock(lkey: String): Double
  def pkg_status(): Double
  def pkg_summary(): Double
  def rand_event(): Double
  def rand_get_prob(): Double
  def rand_reset_prob(): Double
  def rand_set_prob(percent_par: Double): Double
  def shm_status(): Double
  def shm_summary(): Double
  def trylock(lkey: String): Double
  def unlock(lkey: String): Double
}

object Typeofcfgutils {
  @scala.inline
  def apply(
    abort: () => Double,
    core_hash: (String, String, Double) => Double,
    lock: String => Double,
    pkg_status: () => Double,
    pkg_summary: () => Double,
    rand_event: () => Double,
    rand_get_prob: () => Double,
    rand_reset_prob: () => Double,
    rand_set_prob: Double => Double,
    shm_status: () => Double,
    shm_summary: () => Double,
    trylock: String => Double,
    unlock: String => Double
  ): Typeofcfgutils = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), core_hash = js.Any.fromFunction3(core_hash), lock = js.Any.fromFunction1(lock), pkg_status = js.Any.fromFunction0(pkg_status), pkg_summary = js.Any.fromFunction0(pkg_summary), rand_event = js.Any.fromFunction0(rand_event), rand_get_prob = js.Any.fromFunction0(rand_get_prob), rand_reset_prob = js.Any.fromFunction0(rand_reset_prob), rand_set_prob = js.Any.fromFunction1(rand_set_prob), shm_status = js.Any.fromFunction0(shm_status), shm_summary = js.Any.fromFunction0(shm_summary), trylock = js.Any.fromFunction1(trylock), unlock = js.Any.fromFunction1(unlock))
    __obj.asInstanceOf[Typeofcfgutils]
  }
}

