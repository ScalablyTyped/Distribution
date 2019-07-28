package typings.jake.jakeNs

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec extends EventEmitter {
  def append(cmd: String): Unit = js.native
  def run(): Unit = js.native
}

