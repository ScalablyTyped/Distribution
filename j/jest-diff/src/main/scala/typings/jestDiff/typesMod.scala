package typings.jestDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait DiffOptions extends StObject {
    
    var aAnnotation: js.UndefOr[String] = js.native
    
    var aColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var aIndicator: js.UndefOr[String] = js.native
    
    var bAnnotation: js.UndefOr[String] = js.native
    
    var bColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var bIndicator: js.UndefOr[String] = js.native
    
    var changeColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var changeLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var commonColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var commonIndicator: js.UndefOr[String] = js.native
    
    var commonLineTrailingSpaceColor: js.UndefOr[DiffOptionsColor] = js.native
    
    var contextLines: js.UndefOr[Double] = js.native
    
    var emptyFirstOrLastLinePlaceholder: js.UndefOr[String] = js.native
    
    var expand: js.UndefOr[Boolean] = js.native
    
    var includeChangeCounts: js.UndefOr[Boolean] = js.native
    
    var omitAnnotationLines: js.UndefOr[Boolean] = js.native
    
    var patchColor: js.UndefOr[DiffOptionsColor] = js.native
  }
  object DiffOptions {
    
    @scala.inline
    def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    @scala.inline
    implicit class DiffOptionsMutableBuilder[Self <: DiffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAAnnotation(value: String): Self = StObject.set(x, "aAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAAnnotationUndefined: Self = StObject.set(x, "aAnnotation", js.undefined)
      
      @scala.inline
      def setAColor(value: /* arg */ String => String): Self = StObject.set(x, "aColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAColorUndefined: Self = StObject.set(x, "aColor", js.undefined)
      
      @scala.inline
      def setAIndicator(value: String): Self = StObject.set(x, "aIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAIndicatorUndefined: Self = StObject.set(x, "aIndicator", js.undefined)
      
      @scala.inline
      def setBAnnotation(value: String): Self = StObject.set(x, "bAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAnnotationUndefined: Self = StObject.set(x, "bAnnotation", js.undefined)
      
      @scala.inline
      def setBColor(value: /* arg */ String => String): Self = StObject.set(x, "bColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBColorUndefined: Self = StObject.set(x, "bColor", js.undefined)
      
      @scala.inline
      def setBIndicator(value: String): Self = StObject.set(x, "bIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBIndicatorUndefined: Self = StObject.set(x, "bIndicator", js.undefined)
      
      @scala.inline
      def setChangeColor(value: /* arg */ String => String): Self = StObject.set(x, "changeColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeColorUndefined: Self = StObject.set(x, "changeColor", js.undefined)
      
      @scala.inline
      def setChangeLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "changeLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeLineTrailingSpaceColorUndefined: Self = StObject.set(x, "changeLineTrailingSpaceColor", js.undefined)
      
      @scala.inline
      def setCommonColor(value: /* arg */ String => String): Self = StObject.set(x, "commonColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommonColorUndefined: Self = StObject.set(x, "commonColor", js.undefined)
      
      @scala.inline
      def setCommonIndicator(value: String): Self = StObject.set(x, "commonIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonIndicatorUndefined: Self = StObject.set(x, "commonIndicator", js.undefined)
      
      @scala.inline
      def setCommonLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "commonLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommonLineTrailingSpaceColorUndefined: Self = StObject.set(x, "commonLineTrailingSpaceColor", js.undefined)
      
      @scala.inline
      def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
      
      @scala.inline
      def setEmptyFirstOrLastLinePlaceholder(value: String): Self = StObject.set(x, "emptyFirstOrLastLinePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFirstOrLastLinePlaceholderUndefined: Self = StObject.set(x, "emptyFirstOrLastLinePlaceholder", js.undefined)
      
      @scala.inline
      def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setIncludeChangeCounts(value: Boolean): Self = StObject.set(x, "includeChangeCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeChangeCountsUndefined: Self = StObject.set(x, "includeChangeCounts", js.undefined)
      
      @scala.inline
      def setOmitAnnotationLines(value: Boolean): Self = StObject.set(x, "omitAnnotationLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitAnnotationLinesUndefined: Self = StObject.set(x, "omitAnnotationLines", js.undefined)
      
      @scala.inline
      def setPatchColor(value: /* arg */ String => String): Self = StObject.set(x, "patchColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPatchColorUndefined: Self = StObject.set(x, "patchColor", js.undefined)
    }
  }
  
  type DiffOptionsColor = js.Function1[/* arg */ String, String]
  
  @js.native
  trait DiffOptionsNormalized extends StObject {
    
    var aAnnotation: String = js.native
    
    var aColor: DiffOptionsColor = js.native
    
    var aIndicator: String = js.native
    
    var bAnnotation: String = js.native
    
    var bColor: DiffOptionsColor = js.native
    
    var bIndicator: String = js.native
    
    var changeColor: DiffOptionsColor = js.native
    
    var changeLineTrailingSpaceColor: DiffOptionsColor = js.native
    
    var commonColor: DiffOptionsColor = js.native
    
    var commonIndicator: String = js.native
    
    var commonLineTrailingSpaceColor: DiffOptionsColor = js.native
    
    var contextLines: Double = js.native
    
    var emptyFirstOrLastLinePlaceholder: String = js.native
    
    var expand: Boolean = js.native
    
    var includeChangeCounts: Boolean = js.native
    
    var omitAnnotationLines: Boolean = js.native
    
    var patchColor: DiffOptionsColor = js.native
  }
  object DiffOptionsNormalized {
    
    @scala.inline
    def apply(
      aAnnotation: String,
      aColor: /* arg */ String => String,
      aIndicator: String,
      bAnnotation: String,
      bColor: /* arg */ String => String,
      bIndicator: String,
      changeColor: /* arg */ String => String,
      changeLineTrailingSpaceColor: /* arg */ String => String,
      commonColor: /* arg */ String => String,
      commonIndicator: String,
      commonLineTrailingSpaceColor: /* arg */ String => String,
      contextLines: Double,
      emptyFirstOrLastLinePlaceholder: String,
      expand: Boolean,
      includeChangeCounts: Boolean,
      omitAnnotationLines: Boolean,
      patchColor: /* arg */ String => String
    ): DiffOptionsNormalized = {
      val __obj = js.Dynamic.literal(aAnnotation = aAnnotation.asInstanceOf[js.Any], aColor = js.Any.fromFunction1(aColor), aIndicator = aIndicator.asInstanceOf[js.Any], bAnnotation = bAnnotation.asInstanceOf[js.Any], bColor = js.Any.fromFunction1(bColor), bIndicator = bIndicator.asInstanceOf[js.Any], changeColor = js.Any.fromFunction1(changeColor), changeLineTrailingSpaceColor = js.Any.fromFunction1(changeLineTrailingSpaceColor), commonColor = js.Any.fromFunction1(commonColor), commonIndicator = commonIndicator.asInstanceOf[js.Any], commonLineTrailingSpaceColor = js.Any.fromFunction1(commonLineTrailingSpaceColor), contextLines = contextLines.asInstanceOf[js.Any], emptyFirstOrLastLinePlaceholder = emptyFirstOrLastLinePlaceholder.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], includeChangeCounts = includeChangeCounts.asInstanceOf[js.Any], omitAnnotationLines = omitAnnotationLines.asInstanceOf[js.Any], patchColor = js.Any.fromFunction1(patchColor))
      __obj.asInstanceOf[DiffOptionsNormalized]
    }
    
    @scala.inline
    implicit class DiffOptionsNormalizedMutableBuilder[Self <: DiffOptionsNormalized] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAAnnotation(value: String): Self = StObject.set(x, "aAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAColor(value: /* arg */ String => String): Self = StObject.set(x, "aColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAIndicator(value: String): Self = StObject.set(x, "aIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAnnotation(value: String): Self = StObject.set(x, "bAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBColor(value: /* arg */ String => String): Self = StObject.set(x, "bColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBIndicator(value: String): Self = StObject.set(x, "bIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeColor(value: /* arg */ String => String): Self = StObject.set(x, "changeColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "changeLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommonColor(value: /* arg */ String => String): Self = StObject.set(x, "commonColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommonIndicator(value: String): Self = StObject.set(x, "commonIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonLineTrailingSpaceColor(value: /* arg */ String => String): Self = StObject.set(x, "commonLineTrailingSpaceColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFirstOrLastLinePlaceholder(value: String): Self = StObject.set(x, "emptyFirstOrLastLinePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeChangeCounts(value: Boolean): Self = StObject.set(x, "includeChangeCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitAnnotationLines(value: Boolean): Self = StObject.set(x, "omitAnnotationLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchColor(value: /* arg */ String => String): Self = StObject.set(x, "patchColor", js.Any.fromFunction1(value))
    }
  }
}
