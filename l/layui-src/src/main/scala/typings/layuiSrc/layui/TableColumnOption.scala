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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnOption extends StObject {
  
  var LAY_CHECKED: js.UndefOr[Boolean] = js.native
  
  var align: js.UndefOr[left | center | right] = js.native
  
  var checkbox: js.UndefOr[Boolean] = js.native
  
  var colspan: js.UndefOr[Double] = js.native
  
  var edit: js.UndefOr[text | String] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var fixed: js.UndefOr[left | right] = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var rowspan: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var templet: js.UndefOr[String | (js.Function1[/* d */ js.Any, String])] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolbar: js.UndefOr[String] = js.native
  
  var totalRow: js.UndefOr[Boolean | Experience] = js.native
  
  var totalRowText: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[normal | checkbox | radio | space | numbers] = js.native
  
  var unresize: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object TableColumnOption {
  
  @scala.inline
  def apply(): TableColumnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnOption]
  }
  
  @scala.inline
  implicit class TableColumnOptionMutableBuilder[Self <: TableColumnOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    @scala.inline
    def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    @scala.inline
    def setEdit(value: text | String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFixed(value: left | right): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setLAY_CHECKED(value: Boolean): Self = StObject.set(x, "LAY_CHECKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAY_CHECKEDUndefined: Self = StObject.set(x, "LAY_CHECKED", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTemplet(value: String | (js.Function1[/* d */ js.Any, String])): Self = StObject.set(x, "templet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempletFunction1(value: /* d */ js.Any => String): Self = StObject.set(x, "templet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTempletUndefined: Self = StObject.set(x, "templet", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbar(value: String): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setTotalRow(value: Boolean | Experience): Self = StObject.set(x, "totalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowText(value: String): Self = StObject.set(x, "totalRowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowTextUndefined: Self = StObject.set(x, "totalRowText", js.undefined)
    
    @scala.inline
    def setTotalRowUndefined: Self = StObject.set(x, "totalRow", js.undefined)
    
    @scala.inline
    def setType(value: normal | checkbox | radio | space | numbers): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnresize(value: Boolean): Self = StObject.set(x, "unresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnresizeUndefined: Self = StObject.set(x, "unresize", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
