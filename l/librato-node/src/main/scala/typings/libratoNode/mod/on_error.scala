package typings.libratoNode.mod

import typings.libratoNode.libratoNodeStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("librato-node", "on")
@js.native
object on_error extends js.Object {
  
  def apply(event: error, handler: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
