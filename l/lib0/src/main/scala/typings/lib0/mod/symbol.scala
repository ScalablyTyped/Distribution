package typings.lib0.mod

import typings.std.SymbolConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbol {
  
  @JSImport("lib0", "symbol")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0", "symbol.create")
  @js.native
  val create: SymbolConstructor = js.native
  
  inline def isSymbol(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
