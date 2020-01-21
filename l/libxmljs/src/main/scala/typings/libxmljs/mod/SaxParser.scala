package typings.libxmljs.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "SaxParser")
@js.native
class SaxParser () extends EventEmitter {
  def parseString(source: String): Boolean = js.native
}

