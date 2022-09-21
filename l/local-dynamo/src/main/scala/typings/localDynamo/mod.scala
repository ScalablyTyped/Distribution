package typings.localDynamo

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("local-dynamo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def launch(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[ChildProcess]
  inline def launch(options: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def launch(options: String, port: Double): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def launch(options: Unit, port: Double): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def launch(options: Options): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def launch(options: Options, port: Double): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  trait Options extends StObject {
    
    var cors: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var detached: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var heap: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var sharedDb: js.UndefOr[Boolean] = js.undefined
    
    var stdio: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(port: Double): Options = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCors(value: String | js.Array[String]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setCorsVarargs(value: String*): Self = StObject.set(x, "cors", js.Array(value*))
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setHeap(value: String): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setHeapUndefined: Self = StObject.set(x, "heap", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSharedDb(value: Boolean): Self = StObject.set(x, "sharedDb", value.asInstanceOf[js.Any])
      
      inline def setSharedDbUndefined: Self = StObject.set(x, "sharedDb", js.undefined)
      
      inline def setStdio(value: String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    }
  }
}
