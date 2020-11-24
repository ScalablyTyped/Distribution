package typings.ionic.snapshotMod

import typings.ionic.anon.IdString
import typings.ionic.anon.PartialPaginateArgsResponGuard
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/snapshot", "SnapshotClient")
@js.native
class SnapshotClient protected ()
  extends ResourceClient
     with ResourceClientLoad[Snapshot]
     with ResourceClientPaginate[Snapshot] {
  def this(hasClientAppToken: SnapshotClientDeps) = this()
  
  var app: IdString = js.native
  
  var client: IClient = js.native
  
  def load(id: String): js.Promise[Snapshot] = js.native
  
  def paginate(args: PartialPaginateArgsResponGuard): IPaginator[Response[js.Array[Snapshot]], PaginatorState] = js.native
  
  var token: String = js.native
}
