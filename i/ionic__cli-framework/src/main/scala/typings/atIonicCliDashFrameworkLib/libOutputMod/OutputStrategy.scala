package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputStrategy extends js.Object {
  val stream: nodeLib.NodeJSNs.WritableStream
  def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain
}

object OutputStrategy {
  @scala.inline
  def apply(
    createTaskChain: () => atIonicCliDashFrameworkLib.libTasksMod.TaskChain,
    stream: nodeLib.NodeJSNs.WritableStream
  ): OutputStrategy = {
    val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream)
  
    __obj.asInstanceOf[OutputStrategy]
  }
}

