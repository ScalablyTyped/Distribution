package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker
  extends nodeLib.eventsMod.EventEmitter {
  var client: redisLib.redisMod.RedisClient = js.native
  var job: Job = js.native
  var queue: Queue = js.native
  var `type`: java.lang.String = js.native
  def emitJobEvent(event: js.Object, job: Job, arg1: js.Any, arg2: js.Any): scala.Unit = js.native
  def error(err: stdLib.Error, job: Job): Worker = js.native
  def failed(job: Job, theErr: js.Object): Worker = js.native
  def failed(job: Job, theErr: js.Object, fn: js.Function): Worker = js.native
  /* private */ def getJob(fn: js.Function): scala.Unit = js.native
  def idle(): Worker = js.native
  def process(job: Job, fn: js.Function): Worker = js.native
  def resume(): scala.Boolean = js.native
  def shutdown(timeout: scala.Double, fn: js.Function): scala.Unit = js.native
  def start(fn: js.Function): Worker = js.native
  /* private */ def zpop(key: java.lang.String, fn: js.Function): scala.Unit = js.native
}

