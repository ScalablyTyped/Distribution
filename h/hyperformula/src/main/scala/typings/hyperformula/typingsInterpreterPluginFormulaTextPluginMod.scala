package typings.hyperformula

import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterMod.FunctionPlugin
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginFormulaTextPluginMod {
  
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
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
