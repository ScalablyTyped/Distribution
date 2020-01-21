package typings.jpm.contextMenuMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLContext extends Context {
  def apply(matchPattern: String): js.Object = js.native
}

@JSImport("sdk/context-menu", "URLContext")
@js.native
object URLContext extends TopLevel[URLContext]

