package typings.grammarkdown.nodeMod

import typings.grammarkdown.hostMod.CoreAsyncHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/hosts/node", "NodeAsyncHost")
@js.native
class NodeAsyncHost () extends CoreAsyncHost {
  def this(options: NodeAsyncHostOptions) = this()
}
