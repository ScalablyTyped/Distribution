package typings.htmlparser2.htmlparser2Mod

import typings.domhandler.domhandlerMod.DomElement
import typings.domhandler.domhandlerMod.DomHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", "DomHandler")
@js.native
class DomHandler protected ()
  extends typings.domhandler.domhandlerMod.DomHandler {
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
  def this(
    callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
    options: DomHandlerOptions
  ) = this()
}

