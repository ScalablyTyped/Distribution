package typings.ionic.libUserMod

import typings.ionic.definitionsMod.GithubBranch
import typings.ionic.definitionsMod.GithubRepo
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.TokenPaginatorState
import typings.ionic.definitionsMod.User
import typings.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/user", "UserClient")
@js.native
class UserClient protected ()
  extends ResourceClient
     with ResourceClientLoad[User] {
  def this(token: String, e: UserClientDeps) = this()
  val e: UserClientDeps = js.native
  val token: String = js.native
  def load(id: Double): js.Promise[User] = js.native
  def loadSelf(): js.Promise[User] = js.native
  def oAuthGithubLogin(id: Double): js.Promise[String] = js.native
  def paginateGithubBranches(userId: Double, repoId: Double): IPaginator[Response[js.Array[GithubBranch]], TokenPaginatorState] = js.native
  def paginateGithubRepositories(id: Double): IPaginator[Response[js.Array[GithubRepo]], TokenPaginatorState] = js.native
}

