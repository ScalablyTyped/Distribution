package typings.helmet

import typings.helmet.anon.ReadonlyXFrameOptionsOpti
import typings.helmet.helmetStrings.deny
import typings.helmet.helmetStrings.sameorigin
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xFrameOptionsMod {
  
  @JSImport("helmet/dist/types/middlewares/x-frame-options", JSImport.Namespace)
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
  inline def default(options: ReadonlyXFrameOptionsOpti): js.Function3[
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
  
  trait XFrameOptionsOptions extends StObject {
    
    var action: js.UndefOr[deny | sameorigin] = js.undefined
  }
  object XFrameOptionsOptions {
    
    inline def apply(): XFrameOptionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XFrameOptionsOptions]
    }
    
    extension [Self <: XFrameOptionsOptions](x: Self) {
      
      inline def setAction(value: deny | sameorigin): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    }
  }
}
