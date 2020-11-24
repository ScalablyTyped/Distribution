package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsibleOptions extends js.Object {
  
  var collapseCueText: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var collapsedIcon: js.UndefOr[String] = js.native
  
  var contentTheme: js.UndefOr[String] = js.native
  
  var expandCueText: js.UndefOr[String] = js.native
  
  var expandedIcon: js.UndefOr[String] = js.native
  
  var heading: js.UndefOr[String] = js.native
  
  var iconpos: js.UndefOr[String] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[Boolean] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object CollapsibleOptions {
  
  @scala.inline
  def apply(): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleOptions]
  }
  
  @scala.inline
  implicit class CollapsibleOptionsOps[Self <: CollapsibleOptions] (val x: Self) extends AnyVal {
    
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
    def setCollapseCueText(value: String): Self = this.set("collapseCueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseCueText: Self = this.set("collapseCueText", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsedIcon(value: String): Self = this.set("collapsedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedIcon: Self = this.set("collapsedIcon", js.undefined)
    
    @scala.inline
    def setContentTheme(value: String): Self = this.set("contentTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTheme: Self = this.set("contentTheme", js.undefined)
    
    @scala.inline
    def setExpandCueText(value: String): Self = this.set("expandCueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandCueText: Self = this.set("expandCueText", js.undefined)
    
    @scala.inline
    def setExpandedIcon(value: String): Self = this.set("expandedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedIcon: Self = this.set("expandedIcon", js.undefined)
    
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setIconpos(value: String): Self = this.set("iconpos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconpos: Self = this.set("iconpos", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    
    @scala.inline
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
