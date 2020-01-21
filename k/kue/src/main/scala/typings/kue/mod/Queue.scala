package typings.kue.mod

import typings.node.eventsMod.EventEmitter
import typings.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "Queue")
@js.native
class Queue protected () extends EventEmitter {
  def this(options: js.Object) = this()
  var client: RedisClient = js.native
  var id: String = js.native
  var name: String = js.native
  var promoter: js.Any = js.native
  var shuttingDown: Boolean = js.native
  var testMode: TestMode = js.native
  var workers: js.Array[Worker] = js.native
  def active(fn: js.Function): Queue = js.native
  def activeCount(`type`: String, fn: js.Function): Queue = js.native
  def card(state: String, fn: js.Function): Queue = js.native
  def cardByType(`type`: String, state: String, fn: js.Function): Queue = js.native
  def checkActiveJobTtl(ttlOptions: js.Object): Unit = js.native
  def checkJobPromotion(ms: Double): Unit = js.native
  def complete(fn: js.Function): Queue = js.native
  def completeCount(`type`: String, fn: js.Function): Queue = js.native
  def create(`type`: String, data: js.Object): Job = js.native
  def createJob(`type`: String, data: js.Object): Job = js.native
  def delayed(fn: js.Function): Queue = js.native
  def delayedCount(`type`: String, fn: js.Function): Queue = js.native
  def failed(fn: js.Function): Queue = js.native
  def failedCount(`type`: String, fn: js.Function): Queue = js.native
  def inactive(fn: js.Function): Queue = js.native
  def inactiveCount(`type`: String, fn: js.Function): Queue = js.native
  def process(`type`: String): Unit = js.native
  def process(`type`: String, fn: ProcessCallback): Unit = js.native
  def process(`type`: String, n: Double): Unit = js.native
  def process(`type`: String, n: Double, fn: ProcessCallback): Unit = js.native
  def promote(): Unit = js.native
  def promote(ms: Double): Unit = js.native
  def setting(name: String, fn: js.Function): Queue = js.native
  def setupTimer(): Unit = js.native
  def shutdown(timeout: Double, fn: js.Function): Queue = js.native
  def shutdown(timeout: Double, `type`: String, fn: js.Function): Queue = js.native
  def state(string: String, fn: js.Function): Queue = js.native
  def types(fn: js.Function): Queue = js.native
  def watchStuckJobs(): Unit = js.native
  def watchStuckJobs(ms: Double): Unit = js.native
  def workTime(fn: js.Function): Queue = js.native
}

/* static members */
@JSImport("kue", "Queue")
@js.native
object Queue extends js.Object {
  var singleton: Queue = js.native
}

