package typings.libxmljs.libxmljsMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "SaxParser")
@js.native
class SaxParser () extends EventEmitter {
  def parseString(source: String): Boolean = js.native
}

