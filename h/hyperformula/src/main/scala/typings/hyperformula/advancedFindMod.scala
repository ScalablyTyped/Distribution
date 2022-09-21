package typings.hyperformula

import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.interpreterValueMod.RawInterpreterValue
import typings.hyperformula.simpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advancedFindMod {
  
  @JSImport("hyperformula/typings/Lookup/AdvancedFind", "AdvancedFind")
  @js.native
  abstract class AdvancedFind protected () extends StObject {
    /* protected */ def this(dependencyGraph: DependencyGraph) = this()
    
    def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], rangeValue: SimpleRangeValue): Double = js.native
    
    /* protected */ var dependencyGraph: DependencyGraph = js.native
  }
}
