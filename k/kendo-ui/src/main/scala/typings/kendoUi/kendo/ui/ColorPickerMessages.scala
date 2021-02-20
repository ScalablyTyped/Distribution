package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPickerMessages extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[String] = js.native
  
  var previewInput: js.UndefOr[String] = js.native
}
object ColorPickerMessages {
  
  @scala.inline
  def apply(): ColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPickerMessages]
  }
  
  @scala.inline
  implicit class ColorPickerMessagesMutableBuilder[Self <: ColorPickerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setPreviewInput(value: String): Self = StObject.set(x, "previewInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewInputUndefined: Self = StObject.set(x, "previewInput", js.undefined)
  }
}
