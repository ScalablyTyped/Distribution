package typings.makeupKeyboardTrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-keyboard-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refresh(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[js.Any]
  
  inline def trap(el: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trap")(el.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def untrap(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("untrap")().asInstanceOf[js.Any]
}
