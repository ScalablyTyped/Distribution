package typings.ionic

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.SecurityProfile
import typings.ionic.httpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityMod {
  
  @JSImport("ionic/lib/security", "SecurityClient")
  @js.native
  class SecurityClient protected ()
    extends ResourceClient
       with ResourceClientLoad[SecurityProfile] {
    def this(hasClientToken: SecurityClientDeps) = this()
    
    val client: IClient = js.native
    
    def load(tag: String): js.Promise[SecurityProfile] = js.native
    
    val token: String = js.native
  }
  
  trait SecurityClientDeps extends StObject {
    
    val client: IClient
    
    val token: String
  }
  object SecurityClientDeps {
    
    @scala.inline
    def apply(client: IClient, token: String): SecurityClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityClientDeps]
    }
    
    @scala.inline
    implicit class SecurityClientDepsMutableBuilder[Self <: SecurityClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
