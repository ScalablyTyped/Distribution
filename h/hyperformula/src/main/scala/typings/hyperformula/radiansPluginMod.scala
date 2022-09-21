package typings.hyperformula

import typings.hyperformula.anon.RADIANS
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radiansPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/RadiansPlugin.RadiansPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/RadiansPlugin.RadiansPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/RadiansPlugin.RadiansPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/RadiansPlugin", "RadiansPlugin")
  @js.native
  open class RadiansPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def radians(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object RadiansPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/RadiansPlugin", "RadiansPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/RadiansPlugin", "RadiansPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: RADIANS = js.native
    inline def implementedFunctions_=(x: RADIANS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
