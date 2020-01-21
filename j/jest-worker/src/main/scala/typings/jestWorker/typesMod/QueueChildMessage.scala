package typings.jestWorker.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueChildMessage extends js.Object {
  @JSName("onEnd")
  var onEnd_Original: OnEnd = js.native
  @JSName("onStart")
  var onStart_Original: OnStart = js.native
  var request: ChildMessage = js.native
  def onEnd(err: Null, result: js.Any): Unit = js.native
  def onEnd(err: Error, result: js.Any): Unit = js.native
  def onStart(worker: WorkerInterface): Unit = js.native
}

