package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Chips, 'selectChip'> */
@js.native
trait PickChipsselectChip extends js.Object {
  
  var selectChip: js.UndefOr[js.Any] = js.native
}
object PickChipsselectChip {
  
  @scala.inline
  def apply(): PickChipsselectChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChipsselectChip]
  }
  
  @scala.inline
  implicit class PickChipsselectChipOps[Self <: PickChipsselectChip] (val x: Self) extends AnyVal {
    
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
    def setSelectChip(value: js.Any): Self = this.set("selectChip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectChip: Self = this.set("selectChip", js.undefined)
  }
}
