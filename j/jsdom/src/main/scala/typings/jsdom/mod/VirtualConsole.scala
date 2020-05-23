package typings.jsdom.mod

import typings.jsdom.jsdomStrings.jsdomError
import typings.jsdom.jsdomStrings.memory
import typings.node.eventsMod.EventEmitter
import typings.std.Console
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdom", "VirtualConsole")
@js.native
class VirtualConsole () extends EventEmitter {
  @JSName("on")
  def on_jsdomError(event: jsdomError, callback: js.Function1[/* e */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_memory(method: memory, callback: js.Any): this.type = js.native
  def sendTo(console: Console): this.type = js.native
  def sendTo(console: Console, options: VirtualConsoleSendToOptions): this.type = js.native
}

