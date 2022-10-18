package typings.hyperformula.typingsInterpreterPluginMod

import typings.hyperformula.anon.FORMULATEXT
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula/typings/interpreter/plugin", "FormulaTextPlugin")
@js.native
open class FormulaTextPlugin protected ()
  extends typings.hyperformula.typingsInterpreterPluginFormulaTextPluginMod.FormulaTextPlugin {
  def this(interpreter: Interpreter) = this()
}
/* static members */
object FormulaTextPlugin {
  
  @JSImport("hyperformula/typings/interpreter/plugin", "FormulaTextPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/plugin", "FormulaTextPlugin.implementedFunctions")
  @js.native
  def implementedFunctions: FORMULATEXT = js.native
  inline def implementedFunctions_=(x: FORMULATEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
}
