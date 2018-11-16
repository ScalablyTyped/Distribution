package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutputStrategy extends js.Object {
  val stream: nodeLib.NodeJSNs.WritableStream
  def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain
}

