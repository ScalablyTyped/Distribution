package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveIndices extends js.Object {
  
  var removeIndices: js.UndefOr[Boolean] = js.native
}
object RemoveIndices {
  
  @scala.inline
  def apply(): RemoveIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveIndices]
  }
  
  @scala.inline
  implicit class RemoveIndicesOps[Self <: RemoveIndices] (val x: Self) extends AnyVal {
    
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
    def setRemoveIndices(value: Boolean): Self = this.set("removeIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIndices: Self = this.set("removeIndices", js.undefined)
  }
}
