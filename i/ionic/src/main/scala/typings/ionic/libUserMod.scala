package typings.ionic

import typings.ionic.definitionsMod.GithubBranch
import typings.ionic.definitionsMod.GithubRepo
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IPaginator
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.Response
import typings.ionic.definitionsMod.TokenPaginatorState
import typings.ionic.definitionsMod.User
import typings.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUserMod {
  
  @JSImport("ionic/lib/user", "UserClient")
  @js.native
  open class UserClient protected ()
    extends ResourceClient
       with ResourceClientLoad[User] {
    def this(token: String, e: UserClientDeps) = this()
    
    val e: UserClientDeps = js.native
    
    def load(id: Double): js.Promise[User] = js.native
    
    def loadSelf(): js.Promise[User] = js.native
    
    def oAuthGithubLogin(id: Double): js.Promise[String] = js.native
    
    def paginateGithubBranches(userId: Double, repoId: Double): IPaginator[Response[js.Array[GithubBranch]], TokenPaginatorState] = js.native
    
    def paginateGithubRepositories(id: Double): IPaginator[Response[js.Array[GithubRepo]], TokenPaginatorState] = js.native
    
    val token: String = js.native
  }
  
  trait UserClientDeps extends StObject {
    
    val client: IClient
  }
  object UserClientDeps {
    
    inline def apply(client: IClient): UserClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserClientDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserClientDeps] (val x: Self) extends AnyVal {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
