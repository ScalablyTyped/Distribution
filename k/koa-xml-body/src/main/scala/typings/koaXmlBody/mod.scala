package typings.koaXmlBody

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaXmlBody.anon.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def apply(opts: Encoding): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-xml-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Request extends StObject {
      
      var body: js.Any
    }
    object Request {
      
      @scala.inline
      def apply(body: js.Any): Request = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      @scala.inline
      implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      }
    }
  }
}
