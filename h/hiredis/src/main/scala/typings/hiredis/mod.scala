package typings.hiredis

import typings.node.Buffer
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hiredis", "Reader")
  @js.native
  class Reader () extends StObject {
    def this(config: Config) = this()
    
    def feed(reply: String): Unit = js.native
    def feed(reply: Buffer): Unit = js.native
    
    def get(): String | Buffer = js.native
  }
  
  @JSImport("hiredis", "createConnection")
  @js.native
  def createConnection(port: Double, host: String): Socket = js.native
  
  @js.native
  trait Config extends StObject {
    
    var return_buffers: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(return_buffers: Boolean): Config = {
      val __obj = js.Dynamic.literal(return_buffers = return_buffers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReturn_buffers(value: Boolean): Self = StObject.set(x, "return_buffers", value.asInstanceOf[js.Any])
    }
  }
}
