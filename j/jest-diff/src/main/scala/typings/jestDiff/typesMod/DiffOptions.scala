package typings.jestDiff.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffOptions extends js.Object {
  
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
  implicit class DiffOptionsOps[Self <: DiffOptions] (val x: Self) extends AnyVal {
    
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
    def deleteAAnnotation: Self = this.set("aAnnotation", js.undefined)
    
    @scala.inline
    def setAColor(value: /* arg */ String => String): Self = this.set("aColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAColor: Self = this.set("aColor", js.undefined)
    
    @scala.inline
    def setAIndicator(value: String): Self = this.set("aIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAIndicator: Self = this.set("aIndicator", js.undefined)
    
    @scala.inline
    def setBAnnotation(value: String): Self = this.set("bAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBAnnotation: Self = this.set("bAnnotation", js.undefined)
    
    @scala.inline
    def setBColor(value: /* arg */ String => String): Self = this.set("bColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBColor: Self = this.set("bColor", js.undefined)
    
    @scala.inline
    def setBIndicator(value: String): Self = this.set("bIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBIndicator: Self = this.set("bIndicator", js.undefined)
    
    @scala.inline
    def setChangeColor(value: /* arg */ String => String): Self = this.set("changeColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChangeColor: Self = this.set("changeColor", js.undefined)
    
    @scala.inline
    def setChangeLineTrailingSpaceColor(value: /* arg */ String => String): Self = this.set("changeLineTrailingSpaceColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChangeLineTrailingSpaceColor: Self = this.set("changeLineTrailingSpaceColor", js.undefined)
    
    @scala.inline
    def setCommonColor(value: /* arg */ String => String): Self = this.set("commonColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCommonColor: Self = this.set("commonColor", js.undefined)
    
    @scala.inline
    def setCommonIndicator(value: String): Self = this.set("commonIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonIndicator: Self = this.set("commonIndicator", js.undefined)
    
    @scala.inline
    def setCommonLineTrailingSpaceColor(value: /* arg */ String => String): Self = this.set("commonLineTrailingSpaceColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCommonLineTrailingSpaceColor: Self = this.set("commonLineTrailingSpaceColor", js.undefined)
    
    @scala.inline
    def setContextLines(value: Double): Self = this.set("contextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextLines: Self = this.set("contextLines", js.undefined)
    
    @scala.inline
    def setEmptyFirstOrLastLinePlaceholder(value: String): Self = this.set("emptyFirstOrLastLinePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyFirstOrLastLinePlaceholder: Self = this.set("emptyFirstOrLastLinePlaceholder", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setIncludeChangeCounts(value: Boolean): Self = this.set("includeChangeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeChangeCounts: Self = this.set("includeChangeCounts", js.undefined)
    
    @scala.inline
    def setOmitAnnotationLines(value: Boolean): Self = this.set("omitAnnotationLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitAnnotationLines: Self = this.set("omitAnnotationLines", js.undefined)
    
    @scala.inline
    def setPatchColor(value: /* arg */ String => String): Self = this.set("patchColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePatchColor: Self = this.set("patchColor", js.undefined)
  }
}
