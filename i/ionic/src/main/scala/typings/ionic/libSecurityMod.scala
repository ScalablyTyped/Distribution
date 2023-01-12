package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.SecurityProfile
import typings.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityMod {
  
  @JSImport("ionic/lib/security", "SecurityClient")
  @js.native
  open class SecurityClient protected ()
    extends ResourceClient
       with ResourceClientLoad[SecurityProfile] {
    def this(param0: SecurityClientDeps) = this()
    
    /* protected */ val client: IClient = js.native
    
    def load(tag: String): js.Promise[SecurityProfile] = js.native
    
    /* protected */ val token: String = js.native
  }
  
  trait SecurityClientDeps extends StObject {
    
    val client: IClient
    
    val token: String
  }
  object SecurityClientDeps {
    
    inline def apply(client: IClient, token: String): SecurityClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityClientDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecurityClientDeps] (val x: Self) extends AnyVal {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
