package typings.materialTooltip.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowTooltipOptions extends js.Object {
  
  val hideFromScreenreader: Boolean = js.native
}
object ShowTooltipOptions {
  
  @scala.inline
  def apply(hideFromScreenreader: Boolean): ShowTooltipOptions = {
    val __obj = js.Dynamic.literal(hideFromScreenreader = hideFromScreenreader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTooltipOptions]
  }
  
  @scala.inline
  implicit class ShowTooltipOptionsOps[Self <: ShowTooltipOptions] (val x: Self) extends AnyVal {
    
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
    def setHideFromScreenreader(value: Boolean): Self = this.set("hideFromScreenreader", value.asInstanceOf[js.Any])
  }
}
