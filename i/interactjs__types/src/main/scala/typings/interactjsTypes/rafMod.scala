package typings.interactjsTypes

import typings.std.FrameRequestCallback
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rafMod {
  
  object default {
    
    @JSImport("@interactjs/utils/raf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def cancel(token: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@interactjs/utils/raf", "default.init")
    @js.native
    def init: js.Function1[
        /* global */ Window | (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any), 
        Unit
      ] = js.native
    inline def init(
      global: /* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(global.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(global: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(global.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init_=(
      x: js.Function1[
          /* global */ Window | (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any), 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("init")(x.asInstanceOf[js.Any])
    
    inline def request(callback: FrameRequestCallback): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
