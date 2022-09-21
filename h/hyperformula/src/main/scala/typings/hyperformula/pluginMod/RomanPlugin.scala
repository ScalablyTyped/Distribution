package typings.hyperformula.pluginMod

import typings.hyperformula.anon.ARABIC
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "RomanPlugin")
@js.native
open class RomanPlugin protected ()
  extends typings.hyperformula.romanPluginMod.RomanPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object RomanPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RomanPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "RomanPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: ARABIC = js.native
  inline def implementedFunctions_=(x: ARABIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
