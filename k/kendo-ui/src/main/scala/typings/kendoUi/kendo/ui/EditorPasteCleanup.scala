package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPasteCleanup extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var css: js.UndefOr[Boolean] = js.undefined
  
  var custom: js.UndefOr[js.Function] = js.undefined
  
  var keepNewLines: js.UndefOr[Boolean] = js.undefined
  
  var msAllFormatting: js.UndefOr[Boolean] = js.undefined
  
  var msConvertLists: js.UndefOr[Boolean] = js.undefined
  
  var msTags: js.UndefOr[Boolean] = js.undefined
  
  var none: js.UndefOr[Boolean] = js.undefined
  
  var span: js.UndefOr[Boolean] = js.undefined
}
object EditorPasteCleanup {
  
  inline def apply(): EditorPasteCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteCleanup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorPasteCleanup] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setCss(value: Boolean): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setCustom(value: js.Function): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setKeepNewLines(value: Boolean): Self = StObject.set(x, "keepNewLines", value.asInstanceOf[js.Any])
    
    inline def setKeepNewLinesUndefined: Self = StObject.set(x, "keepNewLines", js.undefined)
    
    inline def setMsAllFormatting(value: Boolean): Self = StObject.set(x, "msAllFormatting", value.asInstanceOf[js.Any])
    
    inline def setMsAllFormattingUndefined: Self = StObject.set(x, "msAllFormatting", js.undefined)
    
    inline def setMsConvertLists(value: Boolean): Self = StObject.set(x, "msConvertLists", value.asInstanceOf[js.Any])
    
    inline def setMsConvertListsUndefined: Self = StObject.set(x, "msConvertLists", js.undefined)
    
    inline def setMsTags(value: Boolean): Self = StObject.set(x, "msTags", value.asInstanceOf[js.Any])
    
    inline def setMsTagsUndefined: Self = StObject.set(x, "msTags", js.undefined)
    
    inline def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setSpan(value: Boolean): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
