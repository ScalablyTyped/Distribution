package typings.hyperformula.pluginMod

import typings.hyperformula.anon.CEILING
import typings.hyperformula.anon.ISOCEILING
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "RoundingPlugin")
@js.native
open class RoundingPlugin protected ()
  extends typings.hyperformula.roundingPluginMod.RoundingPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object RoundingPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RoundingPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RoundingPlugin.aliases")
  @js.native
  def aliases: ISOCEILING = js.native
  inline def aliases_=(x: ISOCEILING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RoundingPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: CEILING = js.native
  inline def implementedFunctions_=(x: CEILING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
