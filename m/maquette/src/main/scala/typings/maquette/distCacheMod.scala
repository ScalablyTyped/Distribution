package typings.maquette

import typings.maquette.distInterfacesMod.CalculationCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheMod {
  
  @JSImport("maquette/dist/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/cache", "createCache")
  @js.native
  def createCache: js.Function0[CalculationCache[Any]] = js.native
  inline def createCache_=(x: js.Function0[CalculationCache[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCache")(x.asInstanceOf[js.Any])
}
