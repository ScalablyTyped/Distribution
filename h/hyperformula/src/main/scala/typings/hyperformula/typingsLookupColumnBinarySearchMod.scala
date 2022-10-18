package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import typings.hyperformula.typingsLookupAdvancedFindMod.AdvancedFind
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupColumnBinarySearchMod {
  
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
