package typings.jpm.anon

import typings.jpm.toolbarMod.Toolbar
import typings.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hidden extends js.Object {
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[ToolbarItem] = js.native
  
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var title: String = js.native
}
object Hidden {
  
  @scala.inline
  def apply(items: js.Array[ToolbarItem], title: String): Hidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  @scala.inline
  implicit class HiddenOps[Self <: Hidden] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ToolbarItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ToolbarItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setOnAttach(value: /* toolbar */ Toolbar => _): Self = this.set("onAttach", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAttach: Self = this.set("onAttach", js.undefined)
    
    @scala.inline
    def setOnDetach(value: /* toolbar */ Toolbar => _): Self = this.set("onDetach", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDetach: Self = this.set("onDetach", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* toolbar */ Toolbar => _): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* toolbar */ Toolbar => _): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
}
