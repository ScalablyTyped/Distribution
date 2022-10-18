package typings.helmet

import typings.helmet.anon.ReadonlyCrossOriginOpener
import typings.helmet.helmetStrings.`same-origin-allow-popups`
import typings.helmet.helmetStrings.`same-origin`
import typings.helmet.helmetStrings.`unsafe-none`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresCrossOriginOpenerPolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/cross-origin-opener-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def default(options: ReadonlyCrossOriginOpener): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait CrossOriginOpenerPolicyOptions extends StObject {
    
    var policy: js.UndefOr[`same-origin` | `same-origin-allow-popups` | `unsafe-none`] = js.undefined
  }
  object CrossOriginOpenerPolicyOptions {
    
    inline def apply(): CrossOriginOpenerPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOriginOpenerPolicyOptions]
    }
    
    extension [Self <: CrossOriginOpenerPolicyOptions](x: Self) {
      
      inline def setPolicy(value: `same-origin` | `same-origin-allow-popups` | `unsafe-none`): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
