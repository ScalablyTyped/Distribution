package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", "Queue")
@js.native
class Queue protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: js.Object) = this()
  var client: redisLib.redisMod.RedisClient = js.native
  var id: java.lang.String = js.native
  var name: java.lang.String = js.native
  var promoter: js.Any = js.native
  var shuttingDown: scala.Boolean = js.native
  var testMode: TestMode = js.native
  var workers: js.Array[Worker] = js.native
  def active(fn: js.Function): Queue = js.native
  def activeCount(`type`: java.lang.String, fn: js.Function): Queue = js.native
  def card(state: java.lang.String, fn: js.Function): Queue = js.native
  def cardByType(`type`: java.lang.String, state: java.lang.String, fn: js.Function): Queue = js.native
  def checkActiveJobTtl(ttlOptions: js.Object): scala.Unit = js.native
  def checkJobPromotion(ms: scala.Double): scala.Unit = js.native
  def complete(fn: js.Function): Queue = js.native
  def completeCount(`type`: java.lang.String, fn: js.Function): Queue = js.native
  def create(`type`: java.lang.String, data: js.Object): Job = js.native
  def createJob(`type`: java.lang.String, data: js.Object): Job = js.native
  def delayed(fn: js.Function): Queue = js.native
  def delayedCount(`type`: java.lang.String, fn: js.Function): Queue = js.native
  def failed(fn: js.Function): Queue = js.native
  def failedCount(`type`: java.lang.String, fn: js.Function): Queue = js.native
  def inactive(fn: js.Function): Queue = js.native
  def inactiveCount(`type`: java.lang.String, fn: js.Function): Queue = js.native
  def process(`type`: java.lang.String): scala.Unit = js.native
  def process(`type`: java.lang.String, n: ProcessCallback): scala.Unit = js.native
  def process(`type`: java.lang.String, n: ProcessCallback, fn: ProcessCallback): scala.Unit = js.native
  def process(`type`: java.lang.String, n: scala.Double): scala.Unit = js.native
  def process(`type`: java.lang.String, n: scala.Double, fn: ProcessCallback): scala.Unit = js.native
  def promote(): scala.Unit = js.native
  def promote(ms: scala.Double): scala.Unit = js.native
  def setting(name: java.lang.String, fn: js.Function): Queue = js.native
  def setupTimer(): scala.Unit = js.native
  def shutdown(timeout: scala.Double, fn: js.Function): Queue = js.native
  def shutdown(timeout: scala.Double, `type`: java.lang.String, fn: js.Function): Queue = js.native
  def state(string: java.lang.String, fn: js.Function): Queue = js.native
  def types(fn: js.Function): Queue = js.native
  def watchStuckJobs(ms: scala.Double): scala.Unit = js.native
  def workTime(fn: js.Function): Queue = js.native
}

/* static members */
@JSImport("kue", "Queue")
@js.native
object Queue extends js.Object {
  var singleton: kueLib.kueMod.Queue = js.native
}

