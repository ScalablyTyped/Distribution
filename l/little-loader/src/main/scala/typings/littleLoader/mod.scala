package typings.littleLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(module: String): Unit = ^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(module: String, callback: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    module: String,
    callback: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit],
    context: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(module: String, callback: Unit, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(module: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var setup: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setSetup(value: js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    }
  }
}
