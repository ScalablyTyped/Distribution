package typings.jpm.contextMenuMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorContext extends Context {
  def apply(selector: String): js.Object = js.native
}

@JSImport("sdk/context-menu", "SelectorContext")
@js.native
object SelectorContext extends TopLevel[SelectorContext]

