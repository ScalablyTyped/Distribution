package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcfgutils extends js.Object {
  def abort(): Double = js.native
  def core_hash(s1: String, s2: String, sz: Double): Double = js.native
  def lock(lkey: String): Double = js.native
  def pkg_status(): Double = js.native
  def pkg_summary(): Double = js.native
  def rand_event(): Double = js.native
  def rand_get_prob(): Double = js.native
  def rand_reset_prob(): Double = js.native
  def rand_set_prob(percent_par: Double): Double = js.native
  def shm_status(): Double = js.native
  def shm_summary(): Double = js.native
  def trylock(lkey: String): Double = js.native
  def unlock(lkey: String): Double = js.native
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
  @scala.inline
  implicit class TypeofcfgutilsOps[Self <: Typeofcfgutils] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Double): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setCore_hash(value: (String, String, Double) => Double): Self = this.set("core_hash", js.Any.fromFunction3(value))
    @scala.inline
    def setLock(value: String => Double): Self = this.set("lock", js.Any.fromFunction1(value))
    @scala.inline
    def setPkg_status(value: () => Double): Self = this.set("pkg_status", js.Any.fromFunction0(value))
    @scala.inline
    def setPkg_summary(value: () => Double): Self = this.set("pkg_summary", js.Any.fromFunction0(value))
    @scala.inline
    def setRand_event(value: () => Double): Self = this.set("rand_event", js.Any.fromFunction0(value))
    @scala.inline
    def setRand_get_prob(value: () => Double): Self = this.set("rand_get_prob", js.Any.fromFunction0(value))
    @scala.inline
    def setRand_reset_prob(value: () => Double): Self = this.set("rand_reset_prob", js.Any.fromFunction0(value))
    @scala.inline
    def setRand_set_prob(value: Double => Double): Self = this.set("rand_set_prob", js.Any.fromFunction1(value))
    @scala.inline
    def setShm_status(value: () => Double): Self = this.set("shm_status", js.Any.fromFunction0(value))
    @scala.inline
    def setShm_summary(value: () => Double): Self = this.set("shm_summary", js.Any.fromFunction0(value))
    @scala.inline
    def setTrylock(value: String => Double): Self = this.set("trylock", js.Any.fromFunction1(value))
    @scala.inline
    def setUnlock(value: String => Double): Self = this.set("unlock", js.Any.fromFunction1(value))
  }
  
}

