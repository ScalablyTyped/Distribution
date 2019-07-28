package typings.kue.kueMod

import typings.node.eventsMod.EventEmitter
import typings.redis.redisMod.RedisClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends EventEmitter {
  var client: RedisClient = js.native
  var job: Job = js.native
  var queue: Queue = js.native
  var `type`: String = js.native
  def emitJobEvent(event: js.Object, job: Job, arg1: js.Any, arg2: js.Any): Unit = js.native
  def error(err: Error, job: Job): Worker = js.native
  def failed(job: Job, theErr: js.Object): Worker = js.native
  def failed(job: Job, theErr: js.Object, fn: js.Function): Worker = js.native
  /* private */ def getJob(fn: js.Function): Unit = js.native
  def idle(): Worker = js.native
  def process(job: Job, fn: js.Function): Worker = js.native
  def resume(): Boolean = js.native
  def shutdown(timeout: Double, fn: js.Function): Unit = js.native
  def start(fn: js.Function): Worker = js.native
  /* private */ def zpop(key: String, fn: js.Function): Unit = js.native
}

