package typings.httpTerminator

import typings.node.httpMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-terminator", "createHttpTerminator")
  @js.native
  def createHttpTerminator(config: HttpTerminatorConfig): HttpTerminator = js.native
  
  @js.native
  trait HttpTerminator extends StObject {
    
    /**
      * Terminates the HTTP server.
      */
    def terminate(): js.Promise[Unit] = js.native
  }
  object HttpTerminator {
    
    @scala.inline
    def apply(terminate: () => js.Promise[Unit]): HttpTerminator = {
      val __obj = js.Dynamic.literal(terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[HttpTerminator]
    }
    
    @scala.inline
    implicit class HttpTerminatorMutableBuilder[Self <: HttpTerminator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait HttpTerminatorConfig extends StObject {
    
    /**
      * Number of milliseconds to allow for the active sockets to complete
      * serving the response (default: 5000).
      */
    var gracefulTerminationTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Intsance of http.Server or https.Server.
      */
    var server: Server | typings.node.httpsMod.Server = js.native
  }
  object HttpTerminatorConfig {
    
    @scala.inline
    def apply(server: Server | typings.node.httpsMod.Server): HttpTerminatorConfig = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpTerminatorConfig]
    }
    
    @scala.inline
    implicit class HttpTerminatorConfigMutableBuilder[Self <: HttpTerminatorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGracefulTerminationTimeout(value: Double): Self = StObject.set(x, "gracefulTerminationTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGracefulTerminationTimeoutUndefined: Self = StObject.set(x, "gracefulTerminationTimeout", js.undefined)
      
      @scala.inline
      def setServer(value: Server | typings.node.httpsMod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
