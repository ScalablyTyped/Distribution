package typings.atIonicCliDashFramework.libOutputMod

import typings.atIonicCliDashFramework.libTasksMod.TaskChain
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputStrategy extends js.Object {
  val stream: WritableStream
  def createTaskChain(): TaskChain
}

object OutputStrategy {
  @scala.inline
  def apply(createTaskChain: () => TaskChain, stream: WritableStream): OutputStrategy = {
    val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream)
  
    __obj.asInstanceOf[OutputStrategy]
  }
}

