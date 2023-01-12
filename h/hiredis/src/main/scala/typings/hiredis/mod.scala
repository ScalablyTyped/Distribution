package typings.hiredis

import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hiredis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hiredis", "Reader")
  @js.native
  open class Reader () extends StObject {
    def this(config: Config) = this()
    
    def feed(reply: String): Unit = js.native
    def feed(reply: Buffer): Unit = js.native
    
    def get(): String | Buffer = js.native
  }
  
  inline def createConnection(port: Double, host: String): Socket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Socket]
  
  trait Config extends StObject {
    
    var return_buffers: Boolean
  }
  object Config {
    
    inline def apply(return_buffers: Boolean): Config = {
      val __obj = js.Dynamic.literal(return_buffers = return_buffers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setReturn_buffers(value: Boolean): Self = StObject.set(x, "return_buffers", value.asInstanceOf[js.Any])
    }
  }
}
