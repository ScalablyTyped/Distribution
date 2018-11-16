package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "VirtualConsole")
@js.native
class VirtualConsole ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_Console(method: jsdomLib.jsdomLibStrings.Console, callback: nodeLib.NodeJSNs.ConsoleConstructor): this.type = js.native
  @JSName("on")
  def on_jsdomError(
    event: jsdomLib.jsdomLibStrings.jsdomError,
    callback: js.Function1[/* e */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def sendTo(console: nodeLib.Console): this.type = js.native
  def sendTo(console: nodeLib.Console, options: VirtualConsoleSendToOptions): this.type = js.native
}

