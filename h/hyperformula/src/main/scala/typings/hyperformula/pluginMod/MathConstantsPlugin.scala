package typings.hyperformula.pluginMod

import typings.hyperformula.anon.PI
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "MathConstantsPlugin")
@js.native
open class MathConstantsPlugin protected ()
  extends typings.hyperformula.mathConstantsPluginMod.MathConstantsPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object MathConstantsPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MathConstantsPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MathConstantsPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: PI = js.native
  inline def implementedFunctions_=(x: PI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
