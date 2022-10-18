package typings.hyperformula

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsInterpreterCriterionMod.CriterionLambda
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphRangeVertexMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/RangeVertex", "RangeVertex")
  @js.native
  open class RangeVertex protected () extends StObject {
    def this(range: AbsoluteCellRange) = this()
    
    def addDependentCacheRange(dependentRange: RangeVertex): Unit = js.native
    
    var bruteForce: Boolean = js.native
    
    /**
      * Clears function cache
      */
    def clearCache(): Unit = js.native
    
    /** Cache for criterion-based functions. */
    /* private */ var criterionFunctionCache: Any = js.native
    
    /* private */ var dependentCacheRanges: Any = js.native
    
    def end: SimpleCellAddress_ = js.native
    
    /** Cache for associative aggregate functions. */
    /* private */ var functionCache: Any = js.native
    
    /**
      * Returns cached value for given cache key and criterion text representation
      *
      * @param cacheKey - key to retrieve from the cache
      * @param criterionString - criterion text (ex. '<=5')
      */
    def getCriterionFunctionValue(cacheKey: String, criterionString: String): Any = js.native
    
    /**
      * Returns all cached values stored for given criterion function
      *
      * @param cacheKey - key to retrieve from the cache
      */
    def getCriterionFunctionValues(cacheKey: String): Map[String, js.Tuple2[Any, js.Array[CriterionLambda]]] = js.native
    
    /**
      * Returns end of the range (it's bottom-right corner)
      */
    def getEnd(): SimpleCellAddress_ = js.native
    
    /**
      * Returns cached value stored for given function
      *
      * @param functionName - name of the function
      */
    def getFunctionValue(functionName: String): Any = js.native
    
    /**
      * Returns start of the range (it's top-left corner)
      */
    def getStart(): SimpleCellAddress_ = js.native
    
    var range: AbsoluteCellRange = js.native
    
    /**
      * Stores all values for given criterion function
      *
      * @param cacheKey - key to store in the cache
      * @param values - map with values
      */
    def setCriterionFunctionValues(cacheKey: String, values: CriterionCache): Unit = js.native
    
    /**
      * Stores cached value for given function
      *
      * @param functionName - name of the function
      * @param value - cached value
      */
    def setFunctionValue(functionName: String, value: Any): Unit = js.native
    
    def sheet: Double = js.native
    
    def start: SimpleCellAddress_ = js.native
  }
  
  type CriterionCache = Map[String, js.Tuple2[Any, js.Array[CriterionLambda]]]
}
