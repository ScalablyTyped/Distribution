package typings.helmet

import typings.helmet.anon.ReadonlyStrictTransportSe
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresStrictTransportSecurityMod {
  
  @JSImport("helmet/dist/types/middlewares/strict-transport-security", JSImport.Namespace)
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
  inline def default(options: ReadonlyStrictTransportSe): js.Function3[
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
  
  trait StrictTransportSecurityOptions extends StObject {
    
    var includeSubDomains: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTransportSecurityOptions {
    
    inline def apply(): StrictTransportSecurityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransportSecurityOptions]
    }
    
    extension [Self <: StrictTransportSecurityOptions](x: Self) {
      
      inline def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
}
