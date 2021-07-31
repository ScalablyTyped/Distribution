package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rubyMod {
  
  object Math {
    
    @JSImport("locutus/ruby", "Math")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def acos(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")().asInstanceOf[js.Any]
    @scala.inline
    def acos(arg: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
