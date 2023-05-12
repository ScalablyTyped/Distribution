package typings.greenlockExpress

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("greenlock-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(o: js.Function0[Options]): Serve = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(o.asInstanceOf[js.Any]).asInstanceOf[Serve]
  inline def init(o: Options): Serve = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(o.asInstanceOf[js.Any]).asInstanceOf[Serve]
  
  trait Options extends StObject {
    
    var cluster: Boolean
    
    var configDir: String
    
    var maintainerEmail: String
    
    var packageRoot: String
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(cluster: Boolean, configDir: String, maintainerEmail: String, packageRoot: String): Options = {
      val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], maintainerEmail = maintainerEmail.asInstanceOf[js.Any], packageRoot = packageRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCluster(value: Boolean): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
      
      inline def setMaintainerEmail(value: String): Self = StObject.set(x, "maintainerEmail", value.asInstanceOf[js.Any])
      
      inline def setPackageRoot(value: String): Self = StObject.set(x, "packageRoot", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  @js.native
  trait Serve extends StObject {
    
    def master(): Serve = js.native
    def master(
      app: RequestListener[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Serve = js.native
    
    def ready(): Serve = js.native
    def ready(
      app: RequestListener[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Serve = js.native
    
    def serve(
      app: RequestListener[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Unit = js.native
  }
}
