package typings.jestDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
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
    
    var contextLines: js.UndefOr[Double] = js.undefined
    
    var emptyFirstOrLastLinePlaceholder: js.UndefOr[String] = js.undefined
    
    var expand: js.UndefOr[Boolean] = js.undefined
    
    var includeChangeCounts: js.UndefOr[Boolean] = js.undefined
    
    var omitAnnotationLines: js.UndefOr[Boolean] = js.undefined
    
    var patchColor: js.UndefOr[DiffOptionsColor] = js.undefined
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
  
  trait DiffOptionsNormalized extends StObject {
    
    var aAnnotation: String
    
    var aColor: DiffOptionsColor
    
    var aIndicator: String
    
    var bAnnotation: String
    
    var bColor: DiffOptionsColor
    
    var bIndicator: String
    
    var changeColor: DiffOptionsColor
    
    var changeLineTrailingSpaceColor: DiffOptionsColor
    
    var commonColor: DiffOptionsColor
    
    var commonIndicator: String
    
    var commonLineTrailingSpaceColor: DiffOptionsColor
    
    var contextLines: Double
    
    var emptyFirstOrLastLinePlaceholder: String
    
    var expand: Boolean
    
    var includeChangeCounts: Boolean
    
    var omitAnnotationLines: Boolean
    
    var patchColor: DiffOptionsColor
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
