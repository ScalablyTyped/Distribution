package typings.matrixAppserviceBridge

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.matrixAppserviceBridge.anon.Host
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.delete_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.get_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.post_
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.put_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDebugApiMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/debug-api", "DebugAPI")
  @js.native
  open class DebugAPI protected () extends StObject {
    def this(opts: DebugApiOpts) = this()
    
    def addRoute(
      method: get_ | post_ | put_ | delete_,
      path: String,
      callback: js.Function2[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Unit
        ]
    ): Unit = js.native
    
    /* private */ var app: Any = js.native
    
    /* private */ var onInspectorStart: Any = js.native
    
    /* private */ var onInspectorStop: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    def start(): js.Promise[Any] = js.native
  }
  
  trait DebugApiOpts extends StObject {
    
    var host: String
    
    var inspector: js.UndefOr[Host] = js.undefined
    
    var port: Double
  }
  object DebugApiOpts {
    
    inline def apply(host: String, port: Double): DebugApiOpts = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugApiOpts]
    }
    
    extension [Self <: DebugApiOpts](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setInspector(value: Host): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
      
      inline def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
