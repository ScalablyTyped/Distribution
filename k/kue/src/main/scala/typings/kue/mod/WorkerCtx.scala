package typings.kue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerCtx extends js.Object {
  def pause(): Unit = js.native
  def pause(fn: DoneCallback): Unit = js.native
  def pause(timeout: Double): Unit = js.native
  def pause(timeout: Double, fn: DoneCallback): Unit = js.native
  def resume(): Unit = js.native
  def shutdown(): Unit = js.native
}

