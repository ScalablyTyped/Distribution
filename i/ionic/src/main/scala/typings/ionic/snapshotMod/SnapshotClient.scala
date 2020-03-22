package typings.ionic.snapshotMod

import typings.ionic.AnonIdString
import typings.ionic.PartialPaginateArgsResponGuard
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.Snapshot
import typings.ionic.httpMod.ResourceClient
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
  var app: AnonIdString = js.native
  var client: IClient = js.native
  var token: String = js.native
  def load(id: String): js.Promise[Snapshot] = js.native
  def paginate(args: PartialPaginateArgsResponGuard): IPaginator[Response[js.Array[Snapshot]], PaginatorState] = js.native
}

