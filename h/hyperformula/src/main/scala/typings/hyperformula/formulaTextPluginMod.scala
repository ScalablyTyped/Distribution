package typings.hyperformula

import typings.hyperformula.anon.FORMULATEXT
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterMod.FunctionPlugin
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formulaTextPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/FormulaTextPlugin.FormulaTextPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/FormulaTextPlugin.FormulaTextPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/FormulaTextPlugin.FormulaTextPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/FormulaTextPlugin", "FormulaTextPlugin")
  @js.native
  open class FormulaTextPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to FORMULATEXT(value)
      *
      * Returns a formula in a given cell as a string.
      *
      * @param ast
      * @param state
      */
    def formulatext(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object FormulaTextPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/FormulaTextPlugin", "FormulaTextPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/FormulaTextPlugin", "FormulaTextPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: FORMULATEXT = js.native
    inline def implementedFunctions_=(x: FORMULATEXT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
