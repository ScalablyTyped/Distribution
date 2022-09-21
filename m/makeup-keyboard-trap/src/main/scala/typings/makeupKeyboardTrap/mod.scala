package typings.makeupKeyboardTrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-keyboard-trap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def refresh(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("refresh")().asInstanceOf[Any]
  
  inline def trap(el: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trap")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def untrap(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("untrap")().asInstanceOf[Any]
}
