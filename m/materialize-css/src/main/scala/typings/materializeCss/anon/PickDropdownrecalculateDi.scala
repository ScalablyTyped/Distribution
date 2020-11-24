package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Dropdown, 'recalculateDimensions' | 'open' | 'close' | 'destroy'> */
@js.native
trait PickDropdownrecalculateDi extends js.Object {
  
  var close: js.UndefOr[js.Any] = js.native
  
  var destroy: js.UndefOr[js.Any] = js.native
  
  var open: js.UndefOr[js.Any] = js.native
  
  var recalculateDimensions: js.UndefOr[js.Any] = js.native
}
object PickDropdownrecalculateDi {
  
  @scala.inline
  def apply(): PickDropdownrecalculateDi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDropdownrecalculateDi]
  }
  
  @scala.inline
  implicit class PickDropdownrecalculateDiOps[Self <: PickDropdownrecalculateDi] (val x: Self) extends AnyVal {
    
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
    def setClose(value: js.Any): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Any): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setRecalculateDimensions(value: js.Any): Self = this.set("recalculateDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecalculateDimensions: Self = this.set("recalculateDimensions", js.undefined)
  }
}
