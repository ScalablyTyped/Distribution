package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsStatisticsMod.Statistics
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupColumnIndexMod {
  
  @JSImport("hyperformula/typings/Lookup/ColumnIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/Lookup/ColumnIndex", "ColumnIndex")
  @js.native
  open class ColumnIndex protected ()
    extends StObject
       with ColumnSearchStrategy {
    def this(dependencyGraph: DependencyGraph, config: Config, stats: Statistics) = this()
    
    /* private */ var addRows: Any = js.native
    
    /* private */ var addSingleCellValue: Any = js.native
    
    /* private */ var addValue: Any = js.native
    
    /* CompleteClass */
    override def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], range: SimpleRangeValue): Double = js.native
    
    /* private */ val binarySearchStrategy: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    def ensureRecentData(sheet: Double, col: Double, value: RawInterpreterValue): Unit = js.native
    
    /* CompleteClass */
    override def find(key: RawNoErrorScalarValue, range: SimpleRangeValue, sorted: Boolean): Double = js.native
    
    def getColumnMap(sheet: Double, col: Double): ColumnMap = js.native
    
    def getValueIndex(sheet: Double, col: Double, value: RawInterpreterValue): ValueIndex = js.native
    
    /* private */ val index: Any = js.native
    
    /* private */ var removeRows: Any = js.native
    
    /* private */ var removeRowsFromValues: Any = js.native
    
    /* private */ var removeSingleValue: Any = js.native
    
    /* private */ var shiftRows: Any = js.native
    
    /* private */ val stats: Any = js.native
    
    /* private */ val transformingService: Any = js.native
  }
  
  inline def lowerBound(values: js.Array[Double], key: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(values.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def upperBound(values: js.Array[Double], key: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(values.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type ColumnMap = Map[RawInterpreterValue, ValueIndex]
  
  trait ValueIndex extends StObject {
    
    var index: js.Array[Double]
    
    var version: Double
  }
  object ValueIndex {
    
    inline def apply(index: js.Array[Double], version: Double): ValueIndex = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueIndex] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: js.Array[Double]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexVarargs(value: Double*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
