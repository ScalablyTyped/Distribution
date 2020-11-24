package typings.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffOptionsNormalized extends js.Object {
  
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
  implicit class DiffOptionsNormalizedOps[Self <: DiffOptionsNormalized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAAnnotation(value: String): Self = this.set("aAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAColor(value: /* arg */ String => String): Self = this.set("aColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAIndicator(value: String): Self = this.set("aIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBAnnotation(value: String): Self = this.set("bAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBColor(value: /* arg */ String => String): Self = this.set("bColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBIndicator(value: String): Self = this.set("bIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeColor(value: /* arg */ String => String): Self = this.set("changeColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeLineTrailingSpaceColor(value: /* arg */ String => String): Self = this.set("changeLineTrailingSpaceColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommonColor(value: /* arg */ String => String): Self = this.set("commonColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommonIndicator(value: String): Self = this.set("commonIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonLineTrailingSpaceColor(value: /* arg */ String => String): Self = this.set("commonLineTrailingSpaceColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContextLines(value: Double): Self = this.set("contextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyFirstOrLastLinePlaceholder(value: String): Self = this.set("emptyFirstOrLastLinePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeChangeCounts(value: Boolean): Self = this.set("includeChangeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitAnnotationLines(value: Boolean): Self = this.set("omitAnnotationLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchColor(value: /* arg */ String => String): Self = this.set("patchColor", js.Any.fromFunction1(value))
  }
}
