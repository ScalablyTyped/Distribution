package typings.helmet

import typings.helmet.anon.ReadonlyXFrameOptionsOpti
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xFrameOptionsMod {
  
  @JSImport("helmet/dist/middlewares/x-frame-options", JSImport.Namespace)
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
  def default(options: ReadonlyXFrameOptionsOpti): js.Function3[
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
  
  trait XFrameOptionsOptions extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
  }
  object XFrameOptionsOptions {
    
    @scala.inline
    def apply(): XFrameOptionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XFrameOptionsOptions]
    }
    
    @scala.inline
    implicit class XFrameOptionsOptionsMutableBuilder[Self <: XFrameOptionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
