package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/output", "LogUpdateOutputStrategy")
@js.native
class LogUpdateOutputStrategy protected ()
  extends OutputStrategy
     with RedrawLine {
  def this(hasLogUpdateStreamColors: LogUpdateOutputStrategyOptions) = this()
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  val logUpdate: js.Any = js.native
  /* CompleteClass */
  override val stream: nodeLib.NodeJSNs.WritableStream = js.native
  /* CompleteClass */
  override def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain = js.native
}

