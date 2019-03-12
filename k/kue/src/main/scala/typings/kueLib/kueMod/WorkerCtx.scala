package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerCtx extends js.Object {
  def pause(): scala.Unit = js.native
  def pause(fn: DoneCallback): scala.Unit = js.native
  def pause(timeout: scala.Double): scala.Unit = js.native
  def pause(timeout: scala.Double, fn: DoneCallback): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
}

