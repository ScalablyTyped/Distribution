package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsParserAstMod.Ast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsArraySizeMod {
  
  @JSImport("hyperformula/typings/ArraySize", "ArraySize")
  @js.native
  open class ArraySize protected () extends StObject {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, isRef: Boolean) = this()
    
    var height: Double = js.native
    
    var isRef: Boolean = js.native
    
    def isScalar(): Boolean = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object ArraySize {
    
    @JSImport("hyperformula/typings/ArraySize", "ArraySize")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[ArraySize]
    
    inline def fromArray[T](array: js.Array[js.Array[T]]): ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[ArraySize]
    
    inline def scalar(): ArraySize = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")().asInstanceOf[ArraySize]
  }
  
  @JSImport("hyperformula/typings/ArraySize", "ArraySizePredictor")
  @js.native
  open class ArraySizePredictor protected () extends StObject {
    def this(config: Config, functionRegistry: FunctionRegistry) = this()
    
    def checkArraySize(ast: Ast, formulaAddress: SimpleCellAddress_): ArraySize = js.native
    
    def checkArraySizeForAst(ast: Ast, state: InterpreterState): ArraySize = js.native
    
    /* private */ var checkArraySizeForFunction: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var functionRegistry: Any = js.native
  }
}
