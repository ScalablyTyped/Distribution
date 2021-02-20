package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 参数不用加'?'
@js.native
trait LayFormData extends StObject {
  
  var elem: js.Any = js.native
  
  // 被执行提交的form对象，一般在存在form标签时才会返回
  var field: js.Any = js.native
  
  var form: HTMLFormElement = js.native
  
  // 被执行事件的元素DOM对象，一般为button对象  ,可能是input select button等不能用HTMLElement
  var othis: JQuery[HTMLElement] = js.native
  
  // 得到美化后的DOM对象=$(selector)
  var value: String = js.native
}
object LayFormData {
  
  @scala.inline
  def apply(elem: js.Any, field: js.Any, form: HTMLFormElement, othis: JQuery[HTMLElement], value: String): LayFormData = {
    val __obj = js.Dynamic.literal(elem = elem.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], othis = othis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayFormData]
  }
  
  @scala.inline
  implicit class LayFormDataMutableBuilder[Self <: LayFormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElem(value: js.Any): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: js.Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: HTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthis(value: JQuery[HTMLElement]): Self = StObject.set(x, "othis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
