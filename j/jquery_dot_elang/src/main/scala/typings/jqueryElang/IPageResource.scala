package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageResource extends js.Object {
  
  var lang: js.UndefOr[IPageLangItems] = js.native
  
  var selectedLang: js.UndefOr[String] = js.native
}
object IPageResource {
  
  @scala.inline
  def apply(): IPageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageResource]
  }
  
  @scala.inline
  implicit class IPageResourceOps[Self <: IPageResource] (val x: Self) extends AnyVal {
    
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
    def setLang(value: IPageLangItems): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setSelectedLang(value: String): Self = this.set("selectedLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedLang: Self = this.set("selectedLang", js.undefined)
  }
}
