package typings.helmet

import typings.helmet.anon.ReadonlyXDnsPrefetchContr
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xDnsPrefetchControlMod {
  
  @JSImport("helmet/dist/middlewares/x-dns-prefetch-control", JSImport.Namespace)
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
  def default(options: ReadonlyXDnsPrefetchContr): js.Function3[
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
  
  trait XDnsPrefetchControlOptions extends StObject {
    
    var allow: js.UndefOr[Boolean] = js.undefined
  }
  object XDnsPrefetchControlOptions {
    
    @scala.inline
    def apply(): XDnsPrefetchControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XDnsPrefetchControlOptions]
    }
    
    @scala.inline
    implicit class XDnsPrefetchControlOptionsMutableBuilder[Self <: XDnsPrefetchControlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: Boolean): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    }
  }
}
