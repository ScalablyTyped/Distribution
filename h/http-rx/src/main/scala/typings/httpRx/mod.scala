package typings.httpRx

import org.scalablytyped.runtime.Shortcut
import typings.request.mod.CoreOptions
import typings.request.mod.Response
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("http-rx", JSImport.Namespace)
  @js.native
  val ^ : HttpRx = js.native
  
  @js.native
  trait HttpRx extends StObject {
    
    def delete(url: String): Observable_[ResponseWrapper] = js.native
    def delete(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
    
    def get(url: String): Observable_[ResponseWrapper] = js.native
    def get(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
    
    def head(url: String): Observable_[ResponseWrapper] = js.native
    def head(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
    
    def patch(url: String): Observable_[ResponseWrapper] = js.native
    def patch(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
    
    def post(url: String): Observable_[ResponseWrapper] = js.native
    def post(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
    
    def put(url: String): Observable_[ResponseWrapper] = js.native
    def put(url: String, options: CoreOptions): Observable_[ResponseWrapper] = js.native
  }
  
  trait ResponseWrapper extends StObject {
    
    var body: js.Any
    
    var response: Response
  }
  object ResponseWrapper {
    
    inline def apply(body: js.Any, response: Response): ResponseWrapper = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseWrapper]
    }
    
    extension [Self <: ResponseWrapper](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = HttpRx
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HttpRx = ^
}
