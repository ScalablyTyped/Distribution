package typings.lesgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsLesgoExceptionMod {
  
  @JSImport("lesgo/exceptions/LesgoException", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LesgoException {
    def this(message: String) = this()
    def this(message: String, errorCode: String) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double) = this()
    def this(message: String, errorCode: String, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: String, httpStatusCode: Unit, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Double, extra: Any) = this()
    def this(message: String, errorCode: Unit, httpStatusCode: Unit, extra: Any) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    var extra: Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait LesgoException extends StObject {
    
    var code: String
    
    var extra: Any
    
    var message: String
    
    var name: String
    
    var statusCode: Double
  }
  object LesgoException {
    
    inline def apply(code: String, extra: Any, message: String, name: String, statusCode: Double): LesgoException = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LesgoException]
    }
    
    extension [Self <: LesgoException](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
