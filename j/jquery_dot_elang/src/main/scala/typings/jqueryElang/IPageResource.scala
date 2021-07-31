package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPageResource extends StObject {
  
  var lang: js.UndefOr[IPageLangItems] = js.undefined
  
  var selectedLang: js.UndefOr[String] = js.undefined
}
object IPageResource {
  
  @scala.inline
  def apply(): IPageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageResource]
  }
  
  @scala.inline
  implicit class IPageResourceMutableBuilder[Self <: IPageResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: IPageLangItems): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setSelectedLang(value: String): Self = StObject.set(x, "selectedLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedLangUndefined: Self = StObject.set(x, "selectedLang", js.undefined)
  }
}
