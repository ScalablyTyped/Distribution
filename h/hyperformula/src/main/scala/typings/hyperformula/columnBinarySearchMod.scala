package typings.hyperformula

import typings.hyperformula.advancedFindMod.AdvancedFind
import typings.hyperformula.configMod.Config
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.interpreterValueMod.RawInterpreterValue
import typings.hyperformula.interpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.searchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.simpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnBinarySearchMod {
  
  @JSImport("hyperformula/typings/Lookup/ColumnBinarySearch", "ColumnBinarySearch")
  @js.native
  open class ColumnBinarySearch protected ()
    extends AdvancedFind
       with ColumnSearchStrategy {
    def this(dependencyGraph: DependencyGraph, config: Config) = this()
    
    /* InferMemberOverrides */
    override def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], rangeValue: SimpleRangeValue): Double = js.native
    
    /* private */ var config: Any = js.native
    
    /* CompleteClass */
    override def find(key: RawNoErrorScalarValue, range: SimpleRangeValue, sorted: Boolean): Double = js.native
  }
}
