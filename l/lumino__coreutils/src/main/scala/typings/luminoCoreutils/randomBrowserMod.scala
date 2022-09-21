package typings.luminoCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomBrowserMod {
  
  object Random {
    
    @JSImport("@lumino/coreutils/types/random.browser", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof fallbackRandomValues` */
    inline def getRandomValues(buffer: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
