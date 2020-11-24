package typings.jqueryContextmenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hide extends js.Object {
  
  var hide: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
  
  var show: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.native
}
object Hide {
  
  @scala.inline
  def apply(): Hide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit class HideOps[Self <: Hide] (val x: Self) extends AnyVal {
    
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
    def setHide(value: /* options */ js.Any => Boolean): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setShow(value: /* options */ js.Any => Boolean): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
