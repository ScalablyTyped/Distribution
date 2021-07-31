package typings.ionicCore.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: Element | Null
  
  var labelId: String
  
  var labelText: js.UndefOr[String | Null] = js.undefined
}
object Label {
  
  @scala.inline
  def apply(labelId: String): Label = {
    val __obj = js.Dynamic.literal(labelId = labelId.asInstanceOf[js.Any], label = null)
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTextNull: Self = StObject.set(x, "labelText", null)
    
    @scala.inline
    def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
  }
}
