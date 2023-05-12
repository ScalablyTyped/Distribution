package typings.hyperformula

import typings.hyperformula.hyperformulaStrings.asc
import typings.hyperformula.hyperformulaStrings.desc
import typings.hyperformula.hyperformulaStrings.none
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsContentChangesMod.CellValueChange
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawScalarValue
import typings.hyperformula.typingsSimpleRangeValueMod.SimpleRangeValue
import typings.hyperformula.typingsSpanMod.ColumnsSpan
import typings.hyperformula.typingsStatisticsMod.Statistics
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupSearchStrategyMod {
  
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
  
  trait SearchOptions extends StObject {
    
    var matchExactly: js.UndefOr[Boolean] = js.undefined
    
    var ordering: asc | desc | none
  }
  object SearchOptions {
    
    inline def apply(ordering: asc | desc | none): SearchOptions = {
      val __obj = js.Dynamic.literal(ordering = ordering.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setMatchExactly(value: Boolean): Self = StObject.set(x, "matchExactly", value.asInstanceOf[js.Any])
      
      inline def setMatchExactlyUndefined: Self = StObject.set(x, "matchExactly", js.undefined)
      
      inline def setOrdering(value: asc | desc | none): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchStrategy extends StObject {
    
    def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], range: SimpleRangeValue): Double
    
    def find(searchKey: RawNoErrorScalarValue, range: SimpleRangeValue, options: SearchOptions): Double
  }
  object SearchStrategy {
    
    inline def apply(
      advancedFind: (js.Function1[/* arg */ RawInterpreterValue, Boolean], SimpleRangeValue) => Double,
      find: (RawNoErrorScalarValue, SimpleRangeValue, SearchOptions) => Double
    ): SearchStrategy = {
      val __obj = js.Dynamic.literal(advancedFind = js.Any.fromFunction2(advancedFind), find = js.Any.fromFunction3(find))
      __obj.asInstanceOf[SearchStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchStrategy] (val x: Self) extends AnyVal {
      
      inline def setAdvancedFind(value: (js.Function1[/* arg */ RawInterpreterValue, Boolean], SimpleRangeValue) => Double): Self = StObject.set(x, "advancedFind", js.Any.fromFunction2(value))
      
      inline def setFind(value: (RawNoErrorScalarValue, SimpleRangeValue, SearchOptions) => Double): Self = StObject.set(x, "find", js.Any.fromFunction3(value))
    }
  }
}
