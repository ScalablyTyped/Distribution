package typings.ionic.libSnapshotMod

import typings.ionic.Anon_IdString
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Snapshot
import typings.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/snapshot", "SnapshotClient")
@js.native
class SnapshotClient protected ()
  extends ResourceClient
     with ResourceClientLoad[Snapshot]
     with ResourceClientPaginate[Snapshot] {
  def this(hasClientAppToken: SnapshotClientDeps) = this()
  var app: Anon_IdString = js.native
  var client: IClient = js.native
  var token: String = js.native
  def load(id: String): js.Promise[Snapshot] = js.native
}

