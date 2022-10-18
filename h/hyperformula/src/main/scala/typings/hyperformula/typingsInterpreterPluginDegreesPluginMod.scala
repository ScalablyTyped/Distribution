package typings.hyperformula

import typings.hyperformula.anon.DEGREES
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginDegreesPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin")
  @js.native
  open class DegreesPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def degrees(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object DegreesPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: DEGREES = js.native
    inline def implementedFunctions_=(x: DEGREES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
