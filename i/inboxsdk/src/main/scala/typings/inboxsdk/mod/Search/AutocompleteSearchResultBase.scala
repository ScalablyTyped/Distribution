package typings.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteSearchResultBase extends js.Object {
  
  var externalURL: js.UndefOr[String] = js.native
  
  var iconHTML: js.UndefOr[String] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var routeName: js.UndefOr[String] = js.native
  
  var routeParams: js.UndefOr[js.Array[String]] = js.native
}
object AutocompleteSearchResultBase {
  
  @scala.inline
  def apply(): AutocompleteSearchResultBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteSearchResultBase]
  }
  
  @scala.inline
  implicit class AutocompleteSearchResultBaseOps[Self <: AutocompleteSearchResultBase] (val x: Self) extends AnyVal {
    
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
    def setExternalURL(value: String): Self = this.set("externalURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalURL: Self = this.set("externalURL", js.undefined)
    
    @scala.inline
    def setIconHTML(value: String): Self = this.set("iconHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconHTML: Self = this.set("iconHTML", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteName: Self = this.set("routeName", js.undefined)
    
    @scala.inline
    def setRouteParamsVarargs(value: String*): Self = this.set("routeParams", js.Array(value :_*))
    
    @scala.inline
    def setRouteParams(value: js.Array[String]): Self = this.set("routeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteParams: Self = this.set("routeParams", js.undefined)
  }
}
