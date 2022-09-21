package typings.hyperformula

import typings.hyperformula.cellMod.CellError
import typings.hyperformula.criterionMod.CriterionPackage
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterValueMod.InternalScalarValue
import typings.hyperformula.simpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object criterionFunctionComputeMod {
  
  @JSImport("hyperformula/typings/interpreter/CriterionFunctionCompute", "Condition")
  @js.native
  open class Condition protected () extends StObject {
    def this(conditionRange: SimpleRangeValue, criterionPackage: CriterionPackage) = this()
    
    val conditionRange: SimpleRangeValue = js.native
    
    val criterionPackage: CriterionPackage = js.native
  }
  
  @JSImport("hyperformula/typings/interpreter/CriterionFunctionCompute", "CriterionFunctionCompute")
  @js.native
  open class CriterionFunctionCompute[T] protected () extends StObject {
    def this(
      interpreter: Interpreter,
      cacheKey: js.Function1[/* conditions */ js.Array[Condition], String],
      reduceInitialValue: T,
      composeFunction: js.Function2[/* left */ T, /* right */ T, T],
      mapFunction: js.Function1[/* arg */ InternalScalarValue, T]
    ) = this()
    
    /* private */ var buildNewCriterionCache: Any = js.native
    
    /* private */ val cacheKey: Any = js.native
    
    /* private */ val composeFunction: Any = js.native
    
    def compute(simpleValuesRange: SimpleRangeValue, conditions: js.Array[Condition]): T | CellError = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ var evaluateRangeValue: Any = js.native
    
    /* private */ var findAlreadyComputedValueInCache: Any = js.native
    
    /* private */ val interpreter: Any = js.native
    
    /* private */ val mapFunction: Any = js.native
    
    /* private */ var reduceFunction: Any = js.native
    
    /* private */ val reduceInitialValue: Any = js.native
    
    /* private */ var tryToGetRangeVertexForRangeValue: Any = js.native
  }
}
