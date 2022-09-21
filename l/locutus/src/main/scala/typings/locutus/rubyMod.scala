package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rubyMod {
  
  object Math {
    
    @JSImport("locutus/ruby", "Math")
    @js.native
    val ^ : js.Any = js.native
    
    inline def acos(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")().asInstanceOf[Any]
    inline def acos(arg: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
