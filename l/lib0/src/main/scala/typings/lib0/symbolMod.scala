package typings.lib0

import typings.std.SymbolConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("lib0/symbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/symbol", "create")
  @js.native
  val create: SymbolConstructor = js.native
  
  inline def isSymbol(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
