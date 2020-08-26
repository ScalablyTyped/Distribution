package typings.ionic.appMod

import typings.ionic.anon.Branches
import typings.ionic.anon.PartialPaginateArgsRespon
import typings.ionic.definitionsMod.App
import typings.ionic.definitionsMod.AppAssociation
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientCreate
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/app", "AppClient")
@js.native
class AppClient protected ()
  extends ResourceClient
     with ResourceClientLoad[App]
     with ResourceClientCreate[App, AppCreateDetails]
     with ResourceClientPaginate[App] {
  def this(token: String, e: AppClientDeps) = this()
  val e: AppClientDeps = js.native
  val token: String = js.native
  def createAssociation(id: String, association: Branches): js.Promise[AppAssociation] = js.native
  def deleteAssociation(id: String): js.Promise[Unit] = js.native
  def load(id: String): js.Promise[App] = js.native
  def paginate(args: js.UndefOr[scala.Nothing], orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
  def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
  def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
}

