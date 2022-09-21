package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInput extends StObject {
  
  var fileInput: js.UndefOr[DropPrompt] = js.undefined
  
  var form: js.UndefOr[Invalid] = js.undefined
  
  var menu: js.UndefOr[CloseMenu] = js.undefined
  
  var rangeSelector: js.UndefOr[Lower] = js.undefined
  
  var select: js.UndefOr[Multiple] = js.undefined
  
  var skipLinks: js.UndefOr[SkipTo] = js.undefined
  
  var tabs: js.UndefOr[TabContents] = js.undefined
  
  var textInput: js.UndefOr[EnterSelect] = js.undefined
  
  var video: js.UndefOr[FullScreen] = js.undefined
}
object FileInput {
  
  inline def apply(): FileInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInput]
  }
  
  extension [Self <: FileInput](x: Self) {
    
    inline def setFileInput(value: DropPrompt): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
    
    inline def setForm(value: Invalid): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMenu(value: CloseMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setRangeSelector(value: Lower): Self = StObject.set(x, "rangeSelector", value.asInstanceOf[js.Any])
    
    inline def setRangeSelectorUndefined: Self = StObject.set(x, "rangeSelector", js.undefined)
    
    inline def setSelect(value: Multiple): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSkipLinks(value: SkipTo): Self = StObject.set(x, "skipLinks", value.asInstanceOf[js.Any])
    
    inline def setSkipLinksUndefined: Self = StObject.set(x, "skipLinks", js.undefined)
    
    inline def setTabs(value: TabContents): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTextInput(value: EnterSelect): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
    
    inline def setVideo(value: FullScreen): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
