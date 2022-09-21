package typings.hyperformula

import typings.hyperformula.anon.MOD
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduloPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin")
  @js.native
  open class ModuloPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def mod(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object ModuloPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: MOD = js.native
    inline def implementedFunctions_=(x: MOD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
