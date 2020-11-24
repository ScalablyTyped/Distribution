package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageLangItems extends js.Object {
  
  var en: js.UndefOr[IPageLabels] = js.native
  
  var hu: js.UndefOr[IPageLabels] = js.native
}
object IPageLangItems {
  
  @scala.inline
  def apply(): IPageLangItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageLangItems]
  }
  
  @scala.inline
  implicit class IPageLangItemsOps[Self <: IPageLangItems] (val x: Self) extends AnyVal {
    
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
    def setEn(value: IPageLabels): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEn: Self = this.set("en", js.undefined)
    
    @scala.inline
    def setHu(value: IPageLabels): Self = this.set("hu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHu: Self = this.set("hu", js.undefined)
  }
}
