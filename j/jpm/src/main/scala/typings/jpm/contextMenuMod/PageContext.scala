package typings.jpm.contextMenuMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageContext extends Context {
  def apply(): js.Object = js.native
}

@JSImport("sdk/context-menu", "PageContext")
@js.native
object PageContext extends TopLevel[PageContext]

