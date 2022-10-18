package typings.hyperformula

import typings.hyperformula.anon.MAXPOOL
import typings.hyperformula.anon.X
import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginMatrixPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/MatrixPlugin.MatrixPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/MatrixPlugin.MatrixPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/MatrixPlugin.MatrixPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/MatrixPlugin", "MatrixPlugin")
  @js.native
  open class MatrixPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /* private */ var createKernel: Any = js.native
    
    def maxpool(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def maxpoolArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
    
    def medianpool(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def medianpoolArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
    
    def mmult(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def mmultArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
    
    def transpose(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def transposeArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
  }
  /* static members */
  object MatrixPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/MatrixPlugin", "MatrixPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/MatrixPlugin", "MatrixPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: MAXPOOL = js.native
    inline def implementedFunctions_=(x: MAXPOOL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait KernelFunction extends StObject {
    
    def apply(args: Any*): Double = js.native
  }
  
  trait KernelFunctionThis extends StObject {
    
    var thread: X
  }
  object KernelFunctionThis {
    
    inline def apply(thread: X): KernelFunctionThis = {
      val __obj = js.Dynamic.literal(thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelFunctionThis]
    }
    
    extension [Self <: KernelFunctionThis](x: Self) {
      
      inline def setThread(value: X): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KernelRunShortcut extends StObject {
    
    def apply(args: Any*): js.Array[js.Array[Double]] = js.native
  }
}
