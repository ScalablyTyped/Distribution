package typings.inboxsdk.mod.Router

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionDescriptor extends StObject {
  
  var contentElement: js.UndefOr[HTMLElement] = js.undefined
  
  var footerLinkText: js.UndefOr[String] = js.undefined
  
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  
  var onDropdownClick: js.UndefOr[js.Function1[/* event */ SectionDropdownClickEvent, Unit]] = js.undefined
  
  var onFooterLinkClick: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onTitleLinkClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var tableRows: js.UndefOr[js.Array[RowDescriptor]] = js.undefined
  
  var title: String
  
  var titleLinkText: js.UndefOr[String] = js.undefined
}
object SectionDescriptor {
  
  inline def apply(title: String): SectionDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionDescriptor] (val x: Self) extends AnyVal {
    
    inline def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setContentElementUndefined: Self = StObject.set(x, "contentElement", js.undefined)
    
    inline def setFooterLinkText(value: String): Self = StObject.set(x, "footerLinkText", value.asInstanceOf[js.Any])
    
    inline def setFooterLinkTextUndefined: Self = StObject.set(x, "footerLinkText", js.undefined)
    
    inline def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
    
    inline def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
    
    inline def setOnDropdownClick(value: /* event */ SectionDropdownClickEvent => Unit): Self = StObject.set(x, "onDropdownClick", js.Any.fromFunction1(value))
    
    inline def setOnDropdownClickUndefined: Self = StObject.set(x, "onDropdownClick", js.undefined)
    
    inline def setOnFooterLinkClick(value: /* event */ Any => Unit): Self = StObject.set(x, "onFooterLinkClick", js.Any.fromFunction1(value))
    
    inline def setOnFooterLinkClickUndefined: Self = StObject.set(x, "onFooterLinkClick", js.undefined)
    
    inline def setOnTitleLinkClick(value: () => Unit): Self = StObject.set(x, "onTitleLinkClick", js.Any.fromFunction0(value))
    
    inline def setOnTitleLinkClickUndefined: Self = StObject.set(x, "onTitleLinkClick", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTableRows(value: js.Array[RowDescriptor]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
    
    inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
    
    inline def setTableRowsVarargs(value: RowDescriptor*): Self = StObject.set(x, "tableRows", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLinkText(value: String): Self = StObject.set(x, "titleLinkText", value.asInstanceOf[js.Any])
    
    inline def setTitleLinkTextUndefined: Self = StObject.set(x, "titleLinkText", js.undefined)
  }
}
