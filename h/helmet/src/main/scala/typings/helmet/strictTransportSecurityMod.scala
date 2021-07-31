package typings.helmet

import typings.helmet.anon.ReadonlyStrictTransportSe
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictTransportSecurityMod {
  
  @JSImport("helmet/dist/middlewares/strict-transport-security", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  @scala.inline
  def default(options: ReadonlyStrictTransportSe): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait StrictTransportSecurityOptions extends StObject {
    
    var includeSubDomains: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var preload: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTransportSecurityOptions {
    
    @scala.inline
    def apply(): StrictTransportSecurityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransportSecurityOptions]
    }
    
    @scala.inline
    implicit class StrictTransportSecurityOptionsMutableBuilder[Self <: StrictTransportSecurityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeSubDomains(value: Boolean): Self = StObject.set(x, "includeSubDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSubDomainsUndefined: Self = StObject.set(x, "includeSubDomains", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    }
  }
}
