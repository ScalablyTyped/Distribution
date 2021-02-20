package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewCheckboxes extends StObject {
  
  var checkChildren: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
}
object TreeViewCheckboxes {
  
  @scala.inline
  def apply(): TreeViewCheckboxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewCheckboxes]
  }
  
  @scala.inline
  implicit class TreeViewCheckboxesMutableBuilder[Self <: TreeViewCheckboxes] (val x: Self) extends AnyVal {
    
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
