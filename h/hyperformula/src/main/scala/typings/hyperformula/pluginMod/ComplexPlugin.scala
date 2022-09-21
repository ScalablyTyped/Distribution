package typings.hyperformula.pluginMod

import typings.hyperformula.anon.COMPLEX
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin")
@js.native
open class ComplexPlugin protected ()
  extends typings.hyperformula.complexPluginMod.ComplexPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object ComplexPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "ComplexPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: COMPLEX = js.native
  inline def implementedFunctions_=(x: COMPLEX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
