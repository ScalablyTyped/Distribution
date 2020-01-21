package typings.jpm.contextMenuMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionContext extends Context {
  def apply(): js.Object = js.native
}

@JSImport("sdk/context-menu", "SelectionContext")
@js.native
object SelectionContext extends TopLevel[SelectionContext]

