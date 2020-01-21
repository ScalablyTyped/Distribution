package typings.libxmljs.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "SaxPushParser")
@js.native
class SaxPushParser () extends EventEmitter {
  def push(source: String): Boolean = js.native
}

