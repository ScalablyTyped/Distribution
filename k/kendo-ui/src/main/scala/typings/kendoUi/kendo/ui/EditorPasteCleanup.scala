package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorPasteCleanup extends StObject {
  
  var all: js.UndefOr[Boolean] = js.native
  
  var css: js.UndefOr[Boolean] = js.native
  
  var custom: js.UndefOr[js.Function] = js.native
  
  var keepNewLines: js.UndefOr[Boolean] = js.native
  
  var msAllFormatting: js.UndefOr[Boolean] = js.native
  
  var msConvertLists: js.UndefOr[Boolean] = js.native
  
  var msTags: js.UndefOr[Boolean] = js.native
  
  var none: js.UndefOr[Boolean] = js.native
  
  var span: js.UndefOr[Boolean] = js.native
}
object EditorPasteCleanup {
  
  @scala.inline
  def apply(): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteCleanup]
  }
  
  @scala.inline
  implicit class EditorPasteCleanupMutableBuilder[Self <: EditorPasteCleanup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Function): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setKeepNewLines(value: Boolean): Self = StObject.set(x, "keepNewLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepNewLinesUndefined: Self = StObject.set(x, "keepNewLines", js.undefined)
    
    @scala.inline
    def setMsAllFormatting(value: Boolean): Self = StObject.set(x, "msAllFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsAllFormattingUndefined: Self = StObject.set(x, "msAllFormatting", js.undefined)
    
    @scala.inline
    def setMsConvertLists(value: Boolean): Self = StObject.set(x, "msConvertLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsConvertListsUndefined: Self = StObject.set(x, "msConvertLists", js.undefined)
    
    @scala.inline
    def setMsTags(value: Boolean): Self = StObject.set(x, "msTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTagsUndefined: Self = StObject.set(x, "msTags", js.undefined)
    
    @scala.inline
    def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    @scala.inline
    def setSpan(value: Boolean): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
