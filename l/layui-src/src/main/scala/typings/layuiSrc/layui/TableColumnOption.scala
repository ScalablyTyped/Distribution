package typings.layuiSrc.layui

import typings.layuiSrc.anon.Experience
import typings.layuiSrc.layuiSrcStrings.center
import typings.layuiSrc.layuiSrcStrings.checkbox
import typings.layuiSrc.layuiSrcStrings.left
import typings.layuiSrc.layuiSrcStrings.normal
import typings.layuiSrc.layuiSrcStrings.numbers
import typings.layuiSrc.layuiSrcStrings.radio
import typings.layuiSrc.layuiSrcStrings.right
import typings.layuiSrc.layuiSrcStrings.space
import typings.layuiSrc.layuiSrcStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumnOption extends StObject {
  
  var LAY_CHECKED: js.UndefOr[Boolean] = js.undefined
  
  var align: js.UndefOr[left | center | right] = js.undefined
  
  var checkbox: js.UndefOr[Boolean] = js.undefined
  
  var colspan: js.UndefOr[Double] = js.undefined
  
  var edit: js.UndefOr[text | String] = js.undefined
  
  var event: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var fixed: js.UndefOr[left | right] = js.undefined
  
  var hide: js.UndefOr[Boolean] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var rowspan: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var templet: js.UndefOr[String | (js.Function1[/* d */ js.Any, String])] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toolbar: js.UndefOr[String] = js.undefined
  
  var totalRow: js.UndefOr[Boolean | Experience] = js.undefined
  
  var totalRowText: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[normal | checkbox | radio | space | numbers] = js.undefined
  
  var unresize: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TableColumnOption {
  
  inline def apply(): TableColumnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnOption]
  }
  
  extension [Self <: TableColumnOption](x: Self) {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setEdit(value: text | String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFixed(value: left | right): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLAY_CHECKED(value: Boolean): Self = StObject.set(x, "LAY_CHECKED", value.asInstanceOf[js.Any])
    
    inline def setLAY_CHECKEDUndefined: Self = StObject.set(x, "LAY_CHECKED", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTemplet(value: String | (js.Function1[/* d */ js.Any, String])): Self = StObject.set(x, "templet", value.asInstanceOf[js.Any])
    
    inline def setTempletFunction1(value: /* d */ js.Any => String): Self = StObject.set(x, "templet", js.Any.fromFunction1(value))
    
    inline def setTempletUndefined: Self = StObject.set(x, "templet", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbar(value: String): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setTotalRow(value: Boolean | Experience): Self = StObject.set(x, "totalRow", value.asInstanceOf[js.Any])
    
    inline def setTotalRowText(value: String): Self = StObject.set(x, "totalRowText", value.asInstanceOf[js.Any])
    
    inline def setTotalRowTextUndefined: Self = StObject.set(x, "totalRowText", js.undefined)
    
    inline def setTotalRowUndefined: Self = StObject.set(x, "totalRow", js.undefined)
    
    inline def setType(value: normal | checkbox | radio | space | numbers): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnresize(value: Boolean): Self = StObject.set(x, "unresize", value.asInstanceOf[js.Any])
    
    inline def setUnresizeUndefined: Self = StObject.set(x, "unresize", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
