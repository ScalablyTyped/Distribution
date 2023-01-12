package typings.jestDiff

import typings.prettyFormat.mod.CompareKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-diff", "DIFF_DELETE")
  @js.native
  def DIFF_DELETE: Double = js.native
  inline def DIFF_DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_EQUAL")
  @js.native
  def DIFF_EQUAL: Double = js.native
  inline def DIFF_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_EQUAL")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "DIFF_INSERT")
  @js.native
  def DIFF_INSERT: Double = js.native
  inline def DIFF_INSERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIFF_INSERT")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-diff", "Diff")
  @js.native
  open class Diff_ protected () extends StObject {
    def this(op: Double, text: String) = this()
    
    var `0`: Double = js.native
    
    var `1`: String = js.native
  }
  
  inline def diff(a: Any, b: Any): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def diff(a: Any, b: Any, options: DiffOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def diffLinesRaw(aLines: js.Array[String], bLines: js.Array[String]): js.Array[Diff_] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesRaw")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_]]
  
  inline def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffLinesUnified(aLines: js.Array[String], bLines: js.Array[String], options: DiffOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified")(aLines.asInstanceOf[js.Any], bLines.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified2")(aLinesDisplay.asInstanceOf[js.Any], bLinesDisplay.asInstanceOf[js.Any], aLinesCompare.asInstanceOf[js.Any], bLinesCompare.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffLinesUnified2(
    aLinesDisplay: js.Array[String],
    bLinesDisplay: js.Array[String],
    aLinesCompare: js.Array[String],
    bLinesCompare: js.Array[String],
    options: DiffOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLinesUnified2")(aLinesDisplay.asInstanceOf[js.Any], bLinesDisplay.asInstanceOf[js.Any], aLinesCompare.asInstanceOf[js.Any], bLinesCompare.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def diffStringsRaw(a: String, b: String, cleanup: Boolean): js.Array[Diff_] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsRaw")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cleanup.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diff_]]
  
  inline def diffStringsUnified(a: String, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffStringsUnified(a: String, b: String, options: DiffOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStringsUnified")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DiffOptions extends StObject {
    
    var aAnnotation: js.UndefOr[String] = js.undefined
    
    var aColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var aIndicator: js.UndefOr[String] = js.undefined
    
    var bAnnotation: js.UndefOr[String] = js.undefined
    
    var bColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var bIndicator: js.UndefOr[String] = js.undefined
    
    var changeColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var changeLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var commonColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var commonIndicator: js.UndefOr[String] = js.undefined
    
    var commonLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.undefined
    
    var compareKeys: js.UndefOr[CompareKeys] = js.undefined
    
    var contextLines: js.UndefOr[Double] = js.undefined
    
    var emptyFirstOrLastLinePlaceholder: js.UndefOr[String] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var includeChangeCounts: js.UndefOr[Boolean] = js.undefined
    
    var omitAnnotationLines: js.UndefOr[Boolean] = js.undefined
    
    var patchColor: js.UndefOr[DiffOptionsColor] = js.undefined
  }
  object DiffOptions {
    
    inline def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiffOptions] (val x: Self) extends AnyVal {
      
      inline def setAAnnotation(value: String): Self = StObject.set(x, "aAnnotation", value.asInstanceOf[js.Any])
      
      inline def setAAnnotationUndefined: Self = StObject.set(x, "aAnnotation", js.undefined)
      
      inline def setAColor(value: /* arg */ String => String): Self = StObject.set(x, "aColor", js.Any.fromFunction1(value))
      
      inline def setAColorUndefined: Self = StObject.set(x, "aColor", js.undefined)
      
      inline def setAIndicator(value: String): Self = StObject.set(x, "aIndicator", value.asInstanceOf[js.Any])
      
      inline def setAIndicatorUndefined: Self = StObject.set(x, "aIndicator", js.undefined)
      
      inline def setBAnnotation(value: String): Self = StObject.set(x, "bAnnotation", value.asInstanceOf[js.Any])
      
      inline def setBAnnotationUndefined: Self = StObject.set(x, "bAnnotation", js.undefined)
      
      inline def setBColor(value: /* arg */ String => String): Self = StObject.set(x, "bColor", js.Any.fromFunction1(value))
      
      inline def setBColorUndefined: Self = StObject.set(x, "bColor", js.undefined)
      
      inline def setBIndicator(value: String): Self = StObject.set(x, "bIndicator", value.asInstanceOf[js.Any])
      
      inline def setBIndicatorUndefined: Self = StObject.set(x, "bIndicator", js.undefined)
      
      inline def setChangeColor(value: /* arg */ String => String): Self = StObject.set(x, "changeColor", js.Any.fromFunction1(value))
      
      inline def setChangeColorUndefined: Self = StObject.set(x, "changeColor", js.undefined)
      
      inline def setChangeLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "changeLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      inline def setChangeLineTrailingSpaceColorUndefined: Self = StObject.set(x, "changeLineTrailingSpaceColor", js.undefined)
      
      inline def setCommonColor(value: /* arg */ String => String): Self = StObject.set(x, "commonColor", js.Any.fromFunction1(value))
      
      inline def setCommonColorUndefined: Self = StObject.set(x, "commonColor", js.undefined)
      
      inline def setCommonIndicator(value: String): Self = StObject.set(x, "commonIndicator", value.asInstanceOf[js.Any])
      
      inline def setCommonIndicatorUndefined: Self = StObject.set(x, "commonIndicator", js.undefined)
      
      inline def setCommonLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "commonLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      inline def setCommonLineTrailingSpaceColorUndefined: Self = StObject.set(x, "commonLineTrailingSpaceColor", js.undefined)
      
      inline def setCompareKeys(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "compareKeys", js.Any.fromFunction2(value))
      
      inline def setCompareKeysNull: Self = StObject.set(x, "compareKeys", null)
      
      inline def setCompareKeysUndefined: Self = StObject.set(x, "compareKeys", js.undefined)
      
      inline def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      inline def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
      
      inline def setEmptyFirstOrLastLinePlaceholder(value: String): Self = StObject.set(x, "emptyFirstOrLastLinePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEmptyFirstOrLastLinePlaceholderUndefined: Self = StObject.set(x, "emptyFirstOrLastLinePlaceholder", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setIncludeChangeCounts(value: Boolean): Self = StObject.set(x, "includeChangeCounts", value.asInstanceOf[js.Any])
      
      inline def setIncludeChangeCountsUndefined: Self = StObject.set(x, "includeChangeCounts", js.undefined)
      
      inline def setOmitAnnotationLines(value: Boolean): Self = StObject.set(x, "omitAnnotationLines", value.asInstanceOf[js.Any])
      
      inline def setOmitAnnotationLinesUndefined: Self = StObject.set(x, "omitAnnotationLines", js.undefined)
      
      inline def setPatchColor(value: /* arg */ String => String): Self = StObject.set(x, "patchColor", js.Any.fromFunction1(value))
      
      inline def setPatchColorUndefined: Self = StObject.set(x, "patchColor", js.undefined)
    }
  }
  
  type DiffOptionsColor = js.Function1[/* arg */ String, String]
}
