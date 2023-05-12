package typings.hyperformula

import typings.hyperformula.anon.ISOCEILING
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginRoundingPluginMod {
  
  @JSImport("hyperformula/typings/interpreter/plugin/RoundingPlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/RoundingPlugin.RoundingPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/RoundingPlugin.RoundingPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/RoundingPlugin.RoundingPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/RoundingPlugin", "RoundingPlugin")
  @js.native
  open class RoundingPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def ceiling(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ceilingmath(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ceilingprecise(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def even(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def floor(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def floormath(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def floorprecise(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def intFunc(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def odd(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def round(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def rounddown(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def roundup(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object RoundingPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/RoundingPlugin", "RoundingPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/RoundingPlugin", "RoundingPlugin.aliases")
    @js.native
    def aliases: ISOCEILING = js.native
    inline def aliases_=(x: ISOCEILING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/plugin/RoundingPlugin", "RoundingPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  inline def findNextEvenNumber(arg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextEvenNumber")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def findNextOddNumber(arg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextOddNumber")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]
}
