package typings.jestWorker.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueChildMessage extends js.Object {
  
  def onEnd(err: Null, result: js.Any): Unit = js.native
  def onEnd(err: Error, result: js.Any): Unit = js.native
  @JSName("onEnd")
  var onEnd_Original: OnEnd = js.native
  
  def onStart(worker: WorkerInterface): Unit = js.native
  @JSName("onStart")
  var onStart_Original: OnStart = js.native
  
  var request: ChildMessage = js.native
}
