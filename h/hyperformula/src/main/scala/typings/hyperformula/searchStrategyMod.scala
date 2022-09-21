package typings.hyperformula

import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.configMod.Config
import typings.hyperformula.contentChangesMod.CellValueChange
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.interpreterValueMod.RawInterpreterValue
import typings.hyperformula.interpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.interpreterValueMod.RawScalarValue
import typings.hyperformula.simpleRangeValueMod.SimpleRangeValue
import typings.hyperformula.spanMod.ColumnsSpan
import typings.hyperformula.statisticsStatisticsMod.Statistics
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchStrategyMod {
  
  @JSImport("hyperformula/typings/Lookup/SearchStrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildColumnSearchStrategy(dependencyGraph: DependencyGraph, config: Config, statistics: Statistics): ColumnSearchStrategy = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumnSearchStrategy")(dependencyGraph.asInstanceOf[js.Any], config.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any])).asInstanceOf[ColumnSearchStrategy]
  
  @js.native
  trait ColumnSearchStrategy
    extends StObject
       with SearchStrategy {
    
    def add(value: RawInterpreterValue, address: SimpleCellAddress_): Unit = js.native
    
    def addColumns(columnsSpan: ColumnsSpan): Unit = js.native
    
    def applyChanges(contentChanges: js.Array[CellValueChange]): Unit = js.native
    
    def change(oldValue: Unit, newValue: RawInterpreterValue, address: SimpleCellAddress_): Unit = js.native
    def change(oldValue: RawInterpreterValue, newValue: RawInterpreterValue, address: SimpleCellAddress_): Unit = js.native
    
    def moveValues(
      range: IterableIterator[js.Tuple2[RawScalarValue, SimpleCellAddress_]],
      toRight: Double,
      toBottom: Double,
      toSheet: Double
    ): Unit = js.native
    
    def remove(value: Unit, address: SimpleCellAddress_): Unit = js.native
    def remove(value: RawInterpreterValue, address: SimpleCellAddress_): Unit = js.native
    
    def removeColumns(columnsSpan: ColumnsSpan): Unit = js.native
    
    def removeSheet(sheetId: Double): Unit = js.native
    
    def removeValues(range: IterableIterator[js.Tuple2[RawScalarValue, SimpleCellAddress_]]): Unit = js.native
  }
  
  trait SearchStrategy extends StObject {
    
    def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], range: SimpleRangeValue): Double
    
    def find(key: RawNoErrorScalarValue, range: SimpleRangeValue, sorted: Boolean): Double
  }
  object SearchStrategy {
    
    inline def apply(
      advancedFind: (js.Function1[/* arg */ RawInterpreterValue, Boolean], SimpleRangeValue) => Double,
      find: (RawNoErrorScalarValue, SimpleRangeValue, Boolean) => Double
    ): SearchStrategy = {
      val __obj = js.Dynamic.literal(advancedFind = js.Any.fromFunction2(advancedFind), find = js.Any.fromFunction3(find))
      __obj.asInstanceOf[SearchStrategy]
    }
    
    extension [Self <: SearchStrategy](x: Self) {
      
      inline def setAdvancedFind(value: (js.Function1[/* arg */ RawInterpreterValue, Boolean], SimpleRangeValue) => Double): Self = StObject.set(x, "advancedFind", js.Any.fromFunction2(value))
      
      inline def setFind(value: (RawNoErrorScalarValue, SimpleRangeValue, Boolean) => Double): Self = StObject.set(x, "find", js.Any.fromFunction3(value))
    }
  }
}
