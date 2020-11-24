package typings.kue.mod

import typings.node.eventsMod.EventEmitter
import typings.redis.mod.RedisClient
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kue", "Job")
@js.native
class Job protected () extends EventEmitter {
  def this(`type`: String) = this()
  def this(`type`: String, data: js.Any) = this()
  
  var _error: String = js.native
  
  /* private */ def _getBackoffImpl(): Unit = js.native
  
  var _max_attempts: js.Any = js.native
  
  def active(): Job = js.native
  def active(fn: js.Function): Job = js.native
  
  def attempt(fn: js.Function): Job = js.native
  
  def attempts(n: Double): Job = js.native
  
  def backoff(param: js.Any): Job = js.native
  
  var client: RedisClient = js.native
  
  def complete(): Job = js.native
  def complete(fn: js.Function): Job = js.native
  
  // Should always be a number however currently it is a number when creating and a string when loading
  // https://github.com/Automattic/kue/issues/1081
  var created_at: String | Double = js.native
  
  var data: js.Any = js.native
  
  def delay(ms: Double): Job = js.native
  def delay(ms: Date): Job = js.native
  
  def delayed(): Job = js.native
  def delayed(fn: js.Function): Job = js.native
  
  def error(err: Error): Job = js.native
  
  def events(events: Boolean): Job = js.native
  
  def failed(): Job = js.native
  def failed(fn: js.Function): Job = js.native
  
  var failed_at: String | Double = js.native
  
  def get(key: String): Job = js.native
  def get(key: String, fn: js.Function): Job = js.native
  def get(key: String, jobType: String): Job = js.native
  def get(key: String, jobType: String, fn: js.Function): Job = js.native
  
  var id: Double = js.native
  
  def inactive(): Job = js.native
  def inactive(fn: js.Function): Job = js.native
  
  def log(str: String): Job = js.native
  
  def priority(): Double | String = js.native
  def priority(level: String): Job = js.native
  def priority(level: Double): Job = js.native
  
  def progress(complete: Double, total: Double): Job = js.native
  def progress(complete: Double, total: Double, data: js.Any): Job = js.native
  
  var promote_at: String | Double = js.native
  
  def reattempt(attempt: Double): Unit = js.native
  def reattempt(attempt: Double, fn: js.Function): Unit = js.native
  
  def remove(): Job = js.native
  def remove(fn: js.Function): Job = js.native
  
  def removeOnComplete(param: js.Any): Job = js.native
  
  var result: js.Any = js.native
  
  def save(): Job = js.native
  def save(fn: js.Function): Job = js.native
  
  def searchKeys(keys: String): Job = js.native
  def searchKeys(keys: js.Array[String]): Job = js.native
  
  def set(key: String, `val`: String): Job = js.native
  def set(key: String, `val`: String, fn: js.Function): Job = js.native
  
  var started_at: String | Double = js.native
  
  def state(state: String): Job = js.native
  def state(state: String, fn: js.Function): Job = js.native
  
  def subscribe(): Job = js.native
  def subscribe(fn: js.Function): Job = js.native
  
  def toJSON(): js.Object = js.native
  
  def ttl(param: js.Any): Job = js.native
  
  var `type`: String = js.native
  
  def update(): Job = js.native
  def update(fn: js.Function): Job = js.native
  
  var updated_at: String | Double = js.native
  
  var workerId: String = js.native
}
/* static members */
@JSImport("kue", "Job")
@js.native
object Job extends js.Object {
  
  var disableSearch: Boolean = js.native
  
  def get(id: Double, `type`: String): Unit = js.native
  def get(id: Double, `type`: String, fn: JobCallback): Unit = js.native
  def get(id: Double, `type`: JobCallback): Unit = js.native
  def get(id: Double, `type`: JobCallback, fn: JobCallback): Unit = js.native
  
  var jobEvents: Boolean = js.native
  
  def log(id: Double, fn: js.Function): Unit = js.native
  
  var priorities: Priorities = js.native
  
  def range(from: Double, to: Double, order: String, fn: js.Function): Unit = js.native
  
  def rangeByState(state: String, from: Double, to: Double, order: String, fn: js.Function): Unit = js.native
  
  def rangeByType(`type`: String, state: String, from: Double, to: Double, order: String, fn: js.Function): Unit = js.native
  
  def remove(id: Double): Unit = js.native
  def remove(id: Double, fn: js.Function): Unit = js.native
  
  def removeBadJob(id: Double): Unit = js.native
}
