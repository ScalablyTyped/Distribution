package typings.grammarkdown.nodeMod

import typings.grammarkdown.hostMod.CoreSyncHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/hosts/node", "NodeSyncHost")
@js.native
class NodeSyncHost () extends CoreSyncHost {
  def this(options: NodeSyncHostOptions) = this()
}
