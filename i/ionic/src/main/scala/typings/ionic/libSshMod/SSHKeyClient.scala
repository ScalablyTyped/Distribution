package typings.ionic.libSshMod

import typings.ionic.anon.IdNumber
import typings.ionic.anon.PartialPaginateArgsResponMax
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientCreate
import typings.ionic.definitionsMod.ResourceClientDelete
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.SSHKey
import typings.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/ssh", "SSHKeyClient")
@js.native
class SSHKeyClient protected ()
  extends ResourceClient
     with ResourceClientLoad[SSHKey]
     with ResourceClientDelete
     with ResourceClientCreate[SSHKey, SSHKeyCreateDetails]
     with ResourceClientPaginate[SSHKey] {
  def this(hasClientTokenUser: SSHKeyClientDeps) = this()
  var client: IClient = js.native
  var token: String = js.native
  var user: IdNumber = js.native
  /* CompleteClass */
  override def create(details: SSHKeyCreateDetails): js.Promise[SSHKey] = js.native
  def load(id: String): js.Promise[SSHKey] = js.native
  def paginate(args: PartialPaginateArgsResponMax): IPaginator[Response[js.Array[SSHKey]], PaginatorState] = js.native
}

