package typings.maquette

import typings.maquette.interfacesMod.CalculationCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("maquette/dist/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/cache", "createCache")
  @js.native
  def createCache: js.Function0[CalculationCache[js.Any]] = js.native
  @scala.inline
  def createCache_=(x: js.Function0[CalculationCache[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCache")(x.asInstanceOf[js.Any])
}
