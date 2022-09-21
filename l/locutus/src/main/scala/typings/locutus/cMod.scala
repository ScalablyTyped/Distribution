package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cMod {
  
  object math {
    
    @JSImport("locutus/c", "math")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")().asInstanceOf[Any]
    inline def abs(mixedNumber: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(mixedNumber.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
