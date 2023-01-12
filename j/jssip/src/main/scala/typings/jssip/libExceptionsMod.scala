package typings.jssip

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionsMod {
  
  @JSImport("jssip/lib/Exceptions", "ConfigurationError")
  @js.native
  open class ConfigurationError protected ()
    extends StObject
       with BaseError {
    def this(parameter: String) = this()
    def this(parameter: String, value: Any) = this()
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var parameter: String = js.native
    
    var value: Any = js.native
  }
  
  @JSImport("jssip/lib/Exceptions", "InvalidStateError")
  @js.native
  open class InvalidStateError protected ()
    extends StObject
       with BaseError {
    def this(status: Double) = this()
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var status: Double = js.native
  }
  
  @JSImport("jssip/lib/Exceptions", "NotReadyError")
  @js.native
  open class NotReadyError protected ()
    extends StObject
       with BaseError {
    def this(message: String) = this()
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("jssip/lib/Exceptions", "NotSupportedError")
  @js.native
  open class NotSupportedError protected ()
    extends StObject
       with BaseError {
    def this(message: String) = this()
    
    /* CompleteClass */
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait BaseError
    extends StObject
       with Error {
    
    var code: Double
  }
  object BaseError {
    
    inline def apply(code: Double, message: String, name: String): BaseError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
