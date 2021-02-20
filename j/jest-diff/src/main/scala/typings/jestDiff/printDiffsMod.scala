package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printDiffsMod {
  
  @JSImport("jest-diff/build/printDiffs", "countChanges")
  @js.native
  def countChanges(diffs: js.Array[Diff]): ChangeCounts = js.native
  
  @JSImport("jest-diff/build/printDiffs", "createPatchMark")
  @js.native
  def createPatchMark(aStart: Double, aEnd: Double, bStart: Double, bEnd: Double, hasPatchColor: DiffOptionsNormalized): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "diffStringsRaw")
  @js.native
  def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[Diff] = js.native
  
  @JSImport("jest-diff/build/printDiffs", "diffStringsUnified")
  @js.native
  def diffStringsUnified(a: String, b: String): String = js.native
  @JSImport("jest-diff/build/printDiffs", "diffStringsUnified")
  @js.native
  def diffStringsUnified(a: String, b: String, options: DiffOptions): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "hasCommonDiff")
  @js.native
  def hasCommonDiff(diffs: js.Array[Diff], isMultiline: Boolean): Boolean = js.native
  
  @JSImport("jest-diff/build/printDiffs", "printAnnotation")
  @js.native
  def printAnnotation(
    hasAAnnotationAColorAIndicatorBAnnotationBColorBIndicatorIncludeChangeCountsOmitAnnotationLines: DiffOptionsNormalized,
    changeCounts: ChangeCounts
  ): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "printCommonLine")
  @js.native
  def printCommonLine(
    line: String,
    isFirstOrLast: Boolean,
    hasCommonColorCommonIndicatorCommonLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "printDeleteLine")
  @js.native
  def printDeleteLine(
    line: String,
    isFirstOrLast: Boolean,
    hasAColorAIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "printDiffLines")
  @js.native
  def printDiffLines(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = js.native
  
  @JSImport("jest-diff/build/printDiffs", "printInsertLine")
  @js.native
  def printInsertLine(
    line: String,
    isFirstOrLast: Boolean,
    hasBColorBIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = js.native
  
  @js.native
  trait ChangeCounts extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
  }
  object ChangeCounts {
    
    @scala.inline
    def apply(a: Double, b: Double): ChangeCounts = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeCounts]
    }
    
    @scala.inline
    implicit class ChangeCountsMutableBuilder[Self <: ChangeCounts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    }
  }
}
