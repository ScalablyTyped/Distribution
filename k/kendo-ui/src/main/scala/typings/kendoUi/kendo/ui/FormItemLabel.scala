package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormItemLabel extends StObject {
  
  var encoded: js.UndefOr[Boolean] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object FormItemLabel {
  
  @scala.inline
  def apply(): FormItemLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLabel]
  }
  
  @scala.inline
  implicit class FormItemLabelMutableBuilder[Self <: FormItemLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
