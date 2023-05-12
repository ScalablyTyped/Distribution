package typings.hyperformula

import typings.hyperformula.anon.MatchExactly
import typings.hyperformula.hyperformulaStrings.asc
import typings.hyperformula.hyperformulaStrings.desc
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
  
  inline def findLastMatchingIndex(predicate: js.Function1[/* index */ Double, Boolean], startRange: Double, endRange: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastMatchingIndex")(predicate.asInstanceOf[js.Any], startRange.asInstanceOf[js.Any], endRange.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findLastOccurrenceInOrderedArray(searchKey: RawNoErrorScalarValue, array: js.Array[RawInterpreterValue]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastOccurrenceInOrderedArray")(searchKey.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findLastOccurrenceInOrderedArray(
    searchKey: RawNoErrorScalarValue,
    array: js.Array[RawInterpreterValue],
    orderingDirection: asc | desc
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastOccurrenceInOrderedArray")(searchKey.asInstanceOf[js.Any], array.asInstanceOf[js.Any], orderingDirection.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findLastOccurrenceInOrderedRange(
    searchKey: RawNoErrorScalarValue,
    range: AbsoluteCellRange,
    param2: MatchExactly,
    dependencyGraph: DependencyGraph
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastOccurrenceInOrderedRange")(searchKey.asInstanceOf[js.Any], range.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[Double]
}
