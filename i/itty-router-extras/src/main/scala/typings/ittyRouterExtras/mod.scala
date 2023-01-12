package typings.ittyRouterExtras

import typings.std.Error
import typings.std.Response
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("itty-router-extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("itty-router-extras", "StatusError")
  @js.native
  open class StatusError protected ()
    extends StObject
       with Error {
    def this(status: Double, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def error(status: Double): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(status.asInstanceOf[js.Any]).asInstanceOf[Response]
  inline def error(status: Double, payload: String): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(status.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def error(status: Double, payload: js.Object): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(status.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  inline def json(content: js.Object): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(content.asInstanceOf[js.Any]).asInstanceOf[Response]
  inline def json(content: js.Object, options: ResponseInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  inline def missing(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("missing")().asInstanceOf[Response]
  inline def missing(payload: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("missing")(payload.asInstanceOf[js.Any]).asInstanceOf[Response]
  inline def missing(payload: js.Object): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("missing")(payload.asInstanceOf[js.Any]).asInstanceOf[Response]
  
  inline def status(status: Double): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("status")(status.asInstanceOf[js.Any]).asInstanceOf[Response]
  inline def status(status: Double, payload: String): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(status.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def status(status: Double, payload: js.Object): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("status")(status.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  inline def text(content: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any]).asInstanceOf[Response]
  inline def text(content: String, options: ResponseInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  inline def withContent(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IttyRequest */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withContent")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withCookies(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IttyRequest */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withCookies")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withParams(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IttyRequest */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withParams")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ErrorBody extends StObject {
    
    var error: String
    
    var status: Double
  }
  object ErrorBody {
    
    inline def apply(error: String, status: Double): ErrorBody = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBody] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusBody extends StObject {
    
    var message: String
    
    var status: Double
  }
  object StatusBody {
    
    inline def apply(message: String, status: Double): StatusBody = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatusBody] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
