package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownTreeCheckboxes extends StObject {
  
  var checkChildren: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object DropDownTreeCheckboxes {
  
  @scala.inline
  def apply(): DropDownTreeCheckboxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeCheckboxes]
  }
  
  @scala.inline
  implicit class DropDownTreeCheckboxesMutableBuilder[Self <: DropDownTreeCheckboxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckChildren(value: Boolean): Self = StObject.set(x, "checkChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckChildrenUndefined: Self = StObject.set(x, "checkChildren", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
