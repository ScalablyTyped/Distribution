package typings.inboxsdk.mod.Router

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionDescriptor extends js.Object {
  
  var contentElement: js.UndefOr[HTMLElement] = js.native
  
  var footerLinkText: js.UndefOr[String] = js.native
  
  var hasDropdown: js.UndefOr[Boolean] = js.native
  
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.native
  
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.native
  
  var title: String = js.native
  
  var titleLinkText: js.UndefOr[String] = js.native
}
object SectionDescriptor {
  
  @scala.inline
  def apply(title: String): SectionDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDescriptor]
  }
  
  @scala.inline
  implicit class SectionDescriptorOps[Self <: SectionDescriptor] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentElement(value: HTMLElement): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentElement: Self = this.set("contentElement", js.undefined)
    
    @scala.inline
    def setFooterLinkText(value: String): Self = this.set("footerLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterLinkText: Self = this.set("footerLinkText", js.undefined)
    
    @scala.inline
    def setHasDropdown(value: Boolean): Self = this.set("hasDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDropdown: Self = this.set("hasDropdown", js.undefined)
    
    @scala.inline
    def setOnDropdownClick(value: /* event */ SectionDropdownClickEvent => Unit): Self = this.set("onDropdownClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownClick: Self = this.set("onDropdownClick", js.undefined)
    
    @scala.inline
    def setOnFooterLinkClick(value: /* event */ js.Any => Unit): Self = this.set("onFooterLinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFooterLinkClick: Self = this.set("onFooterLinkClick", js.undefined)
    
    @scala.inline
    def setOnTitleLinkClick(value: () => Unit): Self = this.set("onTitleLinkClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTitleLinkClick: Self = this.set("onTitleLinkClick", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTableRowsVarargs(value: RowDescriptor*): Self = this.set("tableRows", js.Array(value :_*))
    
    @scala.inline
    def setTableRows(value: js.Array[RowDescriptor]): Self = this.set("tableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRows: Self = this.set("tableRows", js.undefined)
    
    @scala.inline
    def setTitleLinkText(value: String): Self = this.set("titleLinkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLinkText: Self = this.set("titleLinkText", js.undefined)
  }
}
