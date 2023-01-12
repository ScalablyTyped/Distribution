package typings.helmet

import typings.helmet.anon.ReadonlyCrossOriginResour
import typings.helmet.helmetStrings.`cross-origin`
import typings.helmet.helmetStrings.`same-origin`
import typings.helmet.helmetStrings.`same-site`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresCrossOriginResourcePolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/cross-origin-resource-policy", JSImport.Namespace)
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
  inline def default(options: ReadonlyCrossOriginResour): js.Function3[
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
  
  trait CrossOriginResourcePolicyOptions extends StObject {
    
    var policy: js.UndefOr[`same-origin` | `same-site` | `cross-origin`] = js.undefined
  }
  object CrossOriginResourcePolicyOptions {
    
    inline def apply(): CrossOriginResourcePolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOriginResourcePolicyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrossOriginResourcePolicyOptions] (val x: Self) extends AnyVal {
      
      inline def setPolicy(value: `same-origin` | `same-site` | `cross-origin`): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
