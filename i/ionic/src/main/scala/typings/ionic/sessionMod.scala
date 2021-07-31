package typings.ionic

import typings.ionic.anon.IdNumber
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IonicEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("ionic/lib/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/session", "BaseSession")
  @js.native
  class BaseSession protected () extends StObject {
    def this(e: SessionDeps) = this()
    
    val e: SessionDeps = js.native
    
    def getUser(): IdNumber = js.native
    
    def getUserToken(): String = js.native
    
    def isLoggedIn(): Boolean = js.native
    
    def logout(): js.Promise[Unit] = js.native
  }
  
  @JSImport("ionic/lib/session", "ProSession")
  @js.native
  class ProSession protected ()
    extends BaseSession
       with ISession {
    def this(e: SessionDeps) = this()
    
    /* InferMemberOverrides */
    override def getUser(): IdNumber = js.native
    
    /* InferMemberOverrides */
    override def getUserToken(): String = js.native
    
    /* InferMemberOverrides */
    override def isLoggedIn(): Boolean = js.native
    
    /* CompleteClass */
    override def login(email: String, password: String): js.Promise[Unit] = js.native
    
    /* InferMemberOverrides */
    override def logout(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def ssoLogin(email: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def tokenLogin(token: String): js.Promise[Unit] = js.native
  }
  
  @scala.inline
  def promptToLogin(env: IonicEnvironment): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptToLogin")(env.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait SessionDeps extends StObject {
    
    val client: IClient
    
    val config: IConfig
  }
  object SessionDeps {
    
    @scala.inline
    def apply(client: IClient, config: IConfig): SessionDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionDeps]
    }
    
    @scala.inline
    implicit class SessionDepsMutableBuilder[Self <: SessionDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
