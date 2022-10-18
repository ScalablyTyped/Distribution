package typings.hyperformula

import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typings.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupAdvancedFindMod {
  
  /* note: abstract class */ @JSImport("hyperformula/typings/Lookup/AdvancedFind", "AdvancedFind")
  @js.native
  open class AdvancedFind protected () extends StObject {
    /* protected */ def this(dependencyGraph: DependencyGraph) = this()
    
    def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], rangeValue: SimpleRangeValue): Double = js.native
    
    /* protected */ var dependencyGraph: DependencyGraph = js.native
  }
}
