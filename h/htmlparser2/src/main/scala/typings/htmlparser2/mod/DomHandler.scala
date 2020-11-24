package typings.htmlparser2.mod

import typings.domhandler.mod.DomElement
import typings.domhandler.mod.DomHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("htmlparser2", "DomHandler")
@js.native
class DomHandler protected ()
  extends typings.domhandler.mod.DomHandler {
  def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
  def this(
    callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
    options: DomHandlerOptions
  ) = this()
}
