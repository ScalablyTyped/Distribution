package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/output", "BottomBarOutputStrategy")
@js.native
class BottomBarOutputStrategy protected ()
  extends OutputStrategy
     with RedrawLine {
  def this(hasBottomBarInputOutputColors: BottomBarOutputStrategyOptions) = this()
  val BottomBar: inquirerLib.Anon_BottomBar = js.native
  var bottomBar: js.UndefOr[inquirerLib.inquirerMod.uiNs.BottomBar] = js.native
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  val rawinput: nodeLib.NodeJSNs.ReadableStream = js.native
  val rawoutput: nodeLib.NodeJSNs.WritableStream = js.native
  /* CompleteClass */
  override val stream: nodeLib.NodeJSNs.WritableStream = js.native
  def close(): scala.Unit = js.native
  /* CompleteClass */
  override def createTaskChain(): atIonicCliDashFrameworkLib.libTasksMod.TaskChain = js.native
  def get(): inquirerLib.Anon_BottomBar = js.native
  def open(): scala.Unit = js.native
}

