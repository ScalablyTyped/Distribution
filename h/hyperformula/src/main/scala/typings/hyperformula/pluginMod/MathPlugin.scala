package typings.hyperformula.pluginMod

import typings.hyperformula.anon.COMBIN
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "MathPlugin")
@js.native
open class MathPlugin protected ()
  extends typings.hyperformula.mathPluginMod.MathPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object MathPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MathPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "MathPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: COMBIN = js.native
  inline def implementedFunctions_=(x: COMBIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
