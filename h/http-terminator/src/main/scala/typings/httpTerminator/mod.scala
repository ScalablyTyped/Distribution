package typings.httpTerminator

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-terminator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHttpTerminator(config: HttpTerminatorConfig): HttpTerminator = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpTerminator")(config.asInstanceOf[js.Any]).asInstanceOf[HttpTerminator]
  
  trait HttpTerminator extends StObject {
    
    /**
      * Terminates the HTTP server.
      */
    def terminate(): js.Promise[Unit]
  }
  object HttpTerminator {
    
    inline def apply(terminate: () => js.Promise[Unit]): HttpTerminator = {
      val __obj = js.Dynamic.literal(terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[HttpTerminator]
    }
    
    extension [Self <: HttpTerminator](x: Self) {
      
      inline def setTerminate(value: () => js.Promise[Unit]): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    }
  }
  
  trait HttpTerminatorConfig extends StObject {
    
    /**
      * Number of milliseconds to allow for the active sockets to complete
      * serving the response (default: 5000).
      */
    var gracefulTerminationTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Intsance of http.Server or https.Server.
      */
    var server: (Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]) | (typings.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
        ]
      ])
  }
  object HttpTerminatorConfig {
    
    inline def apply(
      server: (Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) | (typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ])
    ): HttpTerminatorConfig = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpTerminatorConfig]
    }
    
    extension [Self <: HttpTerminatorConfig](x: Self) {
      
      inline def setGracefulTerminationTimeout(value: Double): Self = StObject.set(x, "gracefulTerminationTimeout", value.asInstanceOf[js.Any])
      
      inline def setGracefulTerminationTimeoutUndefined: Self = StObject.set(x, "gracefulTerminationTimeout", js.undefined)
      
      inline def setServer(
        value: (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
