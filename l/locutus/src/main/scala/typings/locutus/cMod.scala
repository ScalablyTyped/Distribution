package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cMod {
  
  object math {
    
    @JSImport("locutus/c", "math")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def abs(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")().asInstanceOf[js.Any]
    @scala.inline
    def abs(mixedNumber: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(mixedNumber.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
