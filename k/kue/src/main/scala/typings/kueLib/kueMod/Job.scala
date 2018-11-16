package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "Job")
@js.native
class Job protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, data: js.Any) = this()
  var _error: java.lang.String = js.native
  var _max_attempts: js.Any = js.native
  var client: redisLib.redisMod.RedisClient = js.native
  // Should always be a number however currently it is a number when creating and a string when loading
  // https://github.com/Automattic/kue/issues/1081
  var created_at: java.lang.String | scala.Double = js.native
  var data: js.Any = js.native
  var failed_at: java.lang.String | scala.Double = js.native
  var id: scala.Double = js.native
  var promote_at: java.lang.String | scala.Double = js.native
  var result: js.Any = js.native
  var started_at: java.lang.String | scala.Double = js.native
  var `type`: java.lang.String = js.native
  var updated_at: java.lang.String | scala.Double = js.native
  var workerId: java.lang.String = js.native
  /* private */ def _getBackoffImpl(): scala.Unit = js.native
  def active(): Job = js.native
  def active(fn: js.Function): Job = js.native
  def attempt(fn: js.Function): Job = js.native
  def attempts(n: scala.Double): Job = js.native
  def backoff(param: js.Any): Job = js.native
  def complete(): Job = js.native
  def complete(fn: js.Function): Job = js.native
  def delay(ms: scala.Double): Job = js.native
  def delay(ms: stdLib.Date): Job = js.native
  def delayed(): Job = js.native
  def delayed(fn: js.Function): Job = js.native
  def error(err: nodeLib.Error): Job = js.native
  def events(events: scala.Boolean): Job = js.native
  def failed(): Job = js.native
  def failed(fn: js.Function): Job = js.native
  def get(key: java.lang.String): Job = js.native
  def get(key: java.lang.String, fn: js.Function): Job = js.native
  def get(key: java.lang.String, jobType: java.lang.String): Job = js.native
  def get(key: java.lang.String, jobType: java.lang.String, fn: js.Function): Job = js.native
  def inactive(): Job = js.native
  def inactive(fn: js.Function): Job = js.native
  def log(str: java.lang.String): Job = js.native
  def priority(): scala.Double | java.lang.String = js.native
  def priority(level: java.lang.String): Job = js.native
  def priority(level: scala.Double): Job = js.native
  def progress(complete: scala.Double, total: scala.Double): Job = js.native
  def progress(complete: scala.Double, total: scala.Double, data: js.Any): Job = js.native
  def reattempt(attempt: scala.Double): scala.Unit = js.native
  def reattempt(attempt: scala.Double, fn: js.Function): scala.Unit = js.native
  def remove(): Job = js.native
  def remove(fn: js.Function): Job = js.native
  def removeOnComplete(param: js.Any): Job = js.native
  def save(): Job = js.native
  def save(fn: js.Function): Job = js.native
  def searchKeys(keys: java.lang.String): Job = js.native
  def searchKeys(keys: js.Array[java.lang.String]): Job = js.native
  def set(key: java.lang.String, `val`: java.lang.String): Job = js.native
  def set(key: java.lang.String, `val`: java.lang.String, fn: js.Function): Job = js.native
  def state(state: java.lang.String): Job = js.native
  def state(state: java.lang.String, fn: js.Function): Job = js.native
  def subscribe(): Job = js.native
  def subscribe(fn: js.Function): Job = js.native
  def toJSON(): js.Object = js.native
  def ttl(param: js.Any): Job = js.native
  def update(): Job = js.native
  def update(fn: js.Function): Job = js.native
}

@JSImport("kue", "Job")
@js.native
object Job extends js.Object {
  var disableSearch: scala.Boolean = js.native
  var jobEvents: scala.Boolean = js.native
  var priorities: kueLib.kueMod.Priorities = js.native
  def get(id: scala.Double, `type`: java.lang.String): scala.Unit = js.native
  def get(id: scala.Double, `type`: java.lang.String, fn: kueLib.kueMod.JobCallback): scala.Unit = js.native
  def get(id: scala.Double, `type`: kueLib.kueMod.JobCallback): scala.Unit = js.native
  def get(id: scala.Double, `type`: kueLib.kueMod.JobCallback, fn: kueLib.kueMod.JobCallback): scala.Unit = js.native
  def log(id: scala.Double, fn: js.Function): scala.Unit = js.native
  def range(from: scala.Double, to: scala.Double, order: java.lang.String, fn: js.Function): scala.Unit = js.native
  def rangeByState(
    state: java.lang.String,
    from: scala.Double,
    to: scala.Double,
    order: java.lang.String,
    fn: js.Function
  ): scala.Unit = js.native
  def rangeByType(
    `type`: java.lang.String,
    state: java.lang.String,
    from: scala.Double,
    to: scala.Double,
    order: java.lang.String,
    fn: js.Function
  ): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def remove(id: scala.Double, fn: js.Function): scala.Unit = js.native
  def removeBadJob(id: scala.Double): scala.Unit = js.native
}

