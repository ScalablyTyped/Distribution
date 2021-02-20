package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.httpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("ionic/lib/auth", "AuthClient")
  @js.native
  class AuthClient protected () extends ResourceClient {
    def this(e: AuthClientDeps) = this()
    
    val connections: AuthConnectionClient = js.native
    
    val e: AuthClientDeps = js.native
  }
  
  @JSImport("ionic/lib/auth", "AuthConnectionClient")
  @js.native
  class AuthConnectionClient protected ()
    extends ResourceClient
       with ResourceClientLoad[AuthConnection] {
    def this(e: AuthClientDeps) = this()
    
    val e: AuthClientDeps = js.native
    
    def load(email: String): js.Promise[AuthConnection] = js.native
  }
  
  @js.native
  trait AuthClientDeps extends StObject {
    
    val client: IClient = js.native
  }
  object AuthClientDeps {
    
    @scala.inline
    def apply(client: IClient): AuthClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthClientDeps]
    }
    
    @scala.inline
    implicit class AuthClientDepsMutableBuilder[Self <: AuthClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthConnection extends StObject {
    
    val uuid: String = js.native
  }
  object AuthConnection {
    
    @scala.inline
    def apply(uuid: String): AuthConnection = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthConnection]
    }
    
    @scala.inline
    implicit class AuthConnectionMutableBuilder[Self <: AuthConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
