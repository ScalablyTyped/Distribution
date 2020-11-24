package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewOptions extends js.Object {
  
  var autodividers: js.UndefOr[Boolean] = js.native
  
  var autodividersSelector: js.UndefOr[js.Function1[/* jq */ js.UndefOr[JQuery], String]] = js.native
  
  var countTheme: js.UndefOr[String] = js.native
  
  var defaults: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dividerTheme: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[Boolean] = js.native
  
  var filterCallback: js.UndefOr[js.Function] = js.native
  
  var filterPlaceholder: js.UndefOr[String] = js.native
  
  var filterTheme: js.UndefOr[String] = js.native
  
  var headerTheme: js.UndefOr[String] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Boolean] = js.native
  
  var splitIcon: js.UndefOr[String] = js.native
  
  var splitTheme: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object ListViewOptions {
  
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  
  @scala.inline
  implicit class ListViewOptionsOps[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    
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
    def setAutodividers(value: Boolean): Self = this.set("autodividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutodividers: Self = this.set("autodividers", js.undefined)
    
    @scala.inline
    def setAutodividersSelector(value: /* jq */ js.UndefOr[JQuery] => String): Self = this.set("autodividersSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutodividersSelector: Self = this.set("autodividersSelector", js.undefined)
    
    @scala.inline
    def setCountTheme(value: String): Self = this.set("countTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountTheme: Self = this.set("countTheme", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDividerTheme(value: String): Self = this.set("dividerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividerTheme: Self = this.set("dividerTheme", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterCallback(value: js.Function): Self = this.set("filterCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterCallback: Self = this.set("filterCallback", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    
    @scala.inline
    def setFilterTheme(value: String): Self = this.set("filterTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterTheme: Self = this.set("filterTheme", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: String): Self = this.set("headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTheme: Self = this.set("headerTheme", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setSplitIcon(value: String): Self = this.set("splitIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitIcon: Self = this.set("splitIcon", js.undefined)
    
    @scala.inline
    def setSplitTheme(value: String): Self = this.set("splitTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitTheme: Self = this.set("splitTheme", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
