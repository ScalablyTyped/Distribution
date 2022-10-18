package typings.hyperformula

import typings.hyperformula.hyperformulaStrings.col
import typings.hyperformula.hyperformulaStrings.row
import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterBinarySearchMod {
  
  @JSImport("hyperformula/typings/interpreter/binarySearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(left: RawNoErrorScalarValue, right: RawInterpreterValue): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lowerBound(
    value: js.Function1[/* index */ Double, RawInterpreterValue],
    key: RawNoErrorScalarValue,
    start: Double,
    end: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rangeLowerBound(
    range: AbsoluteCellRange,
    key: RawNoErrorScalarValue,
    dependencyGraph: DependencyGraph,
    coordinate: row | col
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeLowerBound")(range.asInstanceOf[js.Any], key.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[Double]
}
