package typings.ionic.libAppMod

import typings.ionic.Anon_Branches
import typings.ionic.definitionsMod.App
import typings.ionic.definitionsMod.AppAssociation
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.PaginateArgs
import typings.ionic.definitionsMod.PaginatorState
import typings.ionic.definitionsMod.ResourceClientCreate
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.ResourceClientPaginate
import typings.ionic.definitionsMod.Response
import typings.ionic.libHttpMod.ResourceClient
import typings.std.Partial
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
  /* CompleteClass */
  override def create(details: AppCreateDetails): js.Promise[App] = js.native
  def createAssociation(id: String, association: Anon_Branches): js.Promise[AppAssociation] = js.native
  def deleteAssociation(id: String): js.Promise[Unit] = js.native
  def load(id: String): js.Promise[App] = js.native
  def paginate(args: Partial[PaginateArgs[Response[js.Array[App]]]], orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
}

