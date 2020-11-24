package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseAymf extends js.Object {
  
  var items: js.Array[NewsRepositoryInboxResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
}
object NewsRepositoryInboxResponseAymf {
  
  @scala.inline
  def apply(items: js.Array[NewsRepositoryInboxResponseItemsItem], more_available: Boolean): NewsRepositoryInboxResponseAymf = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAymf]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseAymfOps[Self <: NewsRepositoryInboxResponseAymf] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: NewsRepositoryInboxResponseItemsItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[NewsRepositoryInboxResponseItemsItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
  }
}
