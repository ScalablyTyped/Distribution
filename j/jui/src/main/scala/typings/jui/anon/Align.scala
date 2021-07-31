package typings.jui.anon

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.left
import typings.jui.juiStrings.right
import typings.jui.juiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[left | right] = js.undefined
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  var valign: js.UndefOr[top | bottom] = js.undefined
}
object Align {
  
  @scala.inline
  def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    @scala.inline
    def setValign(value: top | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
  }
}
