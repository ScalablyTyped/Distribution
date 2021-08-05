package typings.grpcError

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grpc-error", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with GRPCError {
    def this(value: String) = this()
    def this(value: js.Object) = this()
    def this(message: String, value: js.Object) = this()
    def this(message: String, value: Double) = this()
    def this(message: String, code: Double, metadata: js.Object) = this()
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: js.Object = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait GRPCError
    extends StObject
       with Error {
    
    var code: Double
    
    var metadata: js.Object
  }
  object GRPCError {
    
    inline def apply(code: Double, message: String, metadata: js.Object, name: String): GRPCError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRPCError]
    }
    
    extension [Self <: GRPCError](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
}
