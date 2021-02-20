package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedTextBoxLabel extends StObject {
  
  var content: js.UndefOr[String | js.Function] = js.native
  
  var floating: js.UndefOr[Boolean] = js.native
}
object MaskedTextBoxLabel {
  
  @scala.inline
  def apply(): MaskedTextBoxLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedTextBoxLabel]
  }
  
  @scala.inline
  implicit class MaskedTextBoxLabelMutableBuilder[Self <: MaskedTextBoxLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String | js.Function): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
  }
}
