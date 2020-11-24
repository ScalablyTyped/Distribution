package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Chips, 'addChip'> */
@js.native
trait PickChipsaddChip extends js.Object {
  
  var addChip: js.UndefOr[js.Any] = js.native
}
object PickChipsaddChip {
  
  @scala.inline
  def apply(): PickChipsaddChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChipsaddChip]
  }
  
  @scala.inline
  implicit class PickChipsaddChipOps[Self <: PickChipsaddChip] (val x: Self) extends AnyVal {
    
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
    def setAddChip(value: js.Any): Self = this.set("addChip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddChip: Self = this.set("addChip", js.undefined)
  }
}
