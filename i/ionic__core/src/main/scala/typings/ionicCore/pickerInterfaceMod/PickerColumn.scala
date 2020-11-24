package typings.ionicCore.pickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerColumn extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var columnWidth: js.UndefOr[String] = js.native
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: String = js.native
  
  var options: js.Array[PickerColumnOption] = js.native
  
  var optionsWidth: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var prefixWidth: js.UndefOr[String] = js.native
  
  var prevSelected: js.UndefOr[Double] = js.native
  
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var suffixWidth: js.UndefOr[String] = js.native
}
object PickerColumn {
  
  @scala.inline
  def apply(name: String, options: js.Array[PickerColumnOption]): PickerColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerColumn]
  }
  
  @scala.inline
  implicit class PickerColumnOps[Self <: PickerColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PickerColumnOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[PickerColumnOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setOptionsWidth(value: String): Self = this.set("optionsWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsWidth: Self = this.set("optionsWidth", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixWidth(value: String): Self = this.set("prefixWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixWidth: Self = this.set("prefixWidth", js.undefined)
    
    @scala.inline
    def setPrevSelected(value: Double): Self = this.set("prevSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevSelected: Self = this.set("prevSelected", js.undefined)
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSuffixWidth(value: String): Self = this.set("suffixWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixWidth: Self = this.set("suffixWidth", js.undefined)
  }
}
