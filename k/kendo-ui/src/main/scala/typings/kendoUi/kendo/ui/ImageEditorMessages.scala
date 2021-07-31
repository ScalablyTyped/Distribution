package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessages extends StObject {
  
  var common: js.UndefOr[ImageEditorMessagesCommon] = js.undefined
  
  var panes: js.UndefOr[ImageEditorMessagesPanes] = js.undefined
  
  var toolbar: js.UndefOr[ImageEditorMessagesToolbar] = js.undefined
}
object ImageEditorMessages {
  
  @scala.inline
  def apply(): ImageEditorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessages]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesMutableBuilder[Self <: ImageEditorMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: ImageEditorMessagesCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setPanes(value: ImageEditorMessagesPanes): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    @scala.inline
    def setToolbar(value: ImageEditorMessagesToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
