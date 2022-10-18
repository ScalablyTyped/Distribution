package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.POWER
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "PowerPlugin")
@js.native
open class PowerPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginPowerPluginMod.PowerPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object PowerPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "PowerPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "PowerPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: POWER = js.native
  inline def implementedFunctions_=(x: POWER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
