package typings.koaPassport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  
  @js.native
  trait Context extends js.Object {
    
    def isAuthenticated(): Boolean = js.native
    
    def isUnauthenticated(): Boolean = js.native
    
    def logIn(user: js.Any): js.Promise[Unit] = js.native
    def logIn(user: js.Any, options: js.Any): js.Promise[Unit] = js.native
    @JSName("logIn")
    var logIn_Original: js.Function2[/* user */ js.Any, /* options */ js.UndefOr[js.Any], js.Promise[Unit]] = js.native
    
    def logOut(): Unit = js.native
    @JSName("logOut")
    var logOut_Original: js.Function0[Unit] = js.native
    
    def login(user: js.Any): js.Promise[Unit] = js.native
    def login(user: js.Any, options: js.Any): js.Promise[Unit] = js.native
    
    def logout(): Unit = js.native
  }
}
