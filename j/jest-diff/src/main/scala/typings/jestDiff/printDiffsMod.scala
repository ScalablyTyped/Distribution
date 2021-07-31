package typings.jestDiff

import typings.jestDiff.cleanupSemanticMod.Diff
import typings.jestDiff.typesMod.DiffOptions
import typings.jestDiff.typesMod.DiffOptionsNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printDiffsMod {
  
  @JSImport("jest-diff/build/printDiffs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def countChanges(diffs: js.Array[Diff]): ChangeCounts = ^.asInstanceOf[js.Dynamic].applyDynamic("countChanges")(diffs.asInstanceOf[js.Any]).asInstanceOf[ChangeCounts]
  
  @scala.inline
  def createPatchMark(aStart: Double, aEnd: Double, bStart: Double, bEnd: Double, hasPatchColor: DiffOptionsNormalized): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatchMark")(aStart.asInstanceOf[js.Any], aEnd.asInstanceOf[js.Any], bStart.asInstanceOf[js.Any], bEnd.asInstanceOf[js.Any], hasPatchColor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsRaw")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff]]
  
  @scala.inline
  def diffStringsUnified(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def diffStringsUnified(a: String, b: String, options: DiffOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hasCommonDiff(diffs: js.Array[Diff], isMultiline: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCommonDiff")(diffs.asInstanceOf[js.Any], isMultiline.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def printAnnotation(
    hasAAnnotationAColorAIndicatorBAnnotationBColorBIndicatorIncludeChangeCountsOmitAnnotationLines: DiffOptionsNormalized,
    changeCounts: ChangeCounts
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printAnnotation")(hasAAnnotationAColorAIndicatorBAnnotationBColorBIndicatorIncludeChangeCountsOmitAnnotationLines.asInstanceOf[js.Any], changeCounts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printCommonLine(
    line: String,
    isFirstOrLast: Boolean,
    hasCommonColorCommonIndicatorCommonLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printCommonLine")(line.asInstanceOf[js.Any], isFirstOrLast.asInstanceOf[js.Any], hasCommonColorCommonIndicatorCommonLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printDeleteLine(
    line: String,
    isFirstOrLast: Boolean,
    hasAColorAIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printDeleteLine")(line.asInstanceOf[js.Any], isFirstOrLast.asInstanceOf[js.Any], hasAColorAIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printDiffLines(diffs: js.Array[Diff], options: DiffOptionsNormalized): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiffLines")(diffs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printInsertLine(
    line: String,
    isFirstOrLast: Boolean,
    hasBColorBIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder: DiffOptionsNormalized
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printInsertLine")(line.asInstanceOf[js.Any], isFirstOrLast.asInstanceOf[js.Any], hasBColorBIndicatorChangeLineTrailingSpaceColorEmptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ChangeCounts extends StObject {
    
    var a: Double
    
    var b: Double
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
