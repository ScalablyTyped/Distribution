package typings.logkitty.apiMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/api", "logkitty")
@js.native
object logkitty extends js.Object {
  def apply(options: LogkittyOptions): EventEmitter = js.native
}

