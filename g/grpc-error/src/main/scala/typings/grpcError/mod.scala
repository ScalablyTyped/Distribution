package typings.grpcError

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grpc-error", JSImport.Namespace)
  @js.native
  class ^ protected () extends GRPCError {
    def this(value: String) = this()
    def this(value: js.Object) = this()
    def this(message: String, value: js.Object) = this()
    def this(message: String, value: Double) = this()
    def this(message: String, code: Double, metadata: js.Object) = this()
  }
  
  @js.native
  trait GRPCError extends Error {
    
    var code: Double = js.native
    
    var metadata: js.Object = js.native
  }
  object GRPCError {
    
    @scala.inline
    def apply(code: Double, message: String, metadata: js.Object, name: String): GRPCError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GRPCError]
    }
    
    @scala.inline
    implicit class GRPCErrorMutableBuilder[Self <: GRPCError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
}
