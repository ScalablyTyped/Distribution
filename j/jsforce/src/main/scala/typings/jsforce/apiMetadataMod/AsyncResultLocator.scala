package typings.jsforce.apiMetadataMod

import typings.jsforce.connectionMod.Callback
import typings.node.eventsMod.EventEmitter
import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/metadata", "AsyncResultLocator")
@js.native
class AsyncResultLocator[T] ()
  extends EventEmitter
     with PromiseLike[T] {
  def check(): js.Promise[T] = js.native
  def check(callback: Callback[T]): js.Promise[T] = js.native
  def complete(): js.Promise[T] = js.native
  def complete(callback: Callback[T]): js.Promise[T] = js.native
  def `finally`(): js.Promise[T] = js.native
  def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
  def poll(interval: Double, timeout: Double): Unit = js.native
}

