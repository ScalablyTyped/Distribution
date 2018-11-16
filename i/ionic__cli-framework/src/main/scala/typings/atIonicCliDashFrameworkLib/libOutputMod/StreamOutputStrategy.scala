package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/output", "StreamOutputStrategy")
@js.native
class StreamOutputStrategy protected () extends OutputStrategy {
  def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  /* CompleteClass */
  override val stream: nodeLib.NodeJSNs.WritableStream = js.native
  /* CompleteClass */
  override def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain = js.native
}

