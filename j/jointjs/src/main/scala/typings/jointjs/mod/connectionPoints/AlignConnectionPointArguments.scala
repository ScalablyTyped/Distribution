package typings.jointjs.mod.connectionPoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignConnectionPointArguments extends DefaultConnectionPointArguments {
  
  var align: js.UndefOr[ConnectionPointAlignment | Null] = js.native
  
  var alignOffset: js.UndefOr[Double] = js.native
}
object AlignConnectionPointArguments {
  
  @scala.inline
  def apply(): AlignConnectionPointArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignConnectionPointArguments]
  }
  
  @scala.inline
  implicit class AlignConnectionPointArgumentsOps[Self <: AlignConnectionPointArguments] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: ConnectionPointAlignment): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlignNull: Self = this.set("align", null)
    
    @scala.inline
    def setAlignOffset(value: Double): Self = this.set("alignOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignOffset: Self = this.set("alignOffset", js.undefined)
  }
}
