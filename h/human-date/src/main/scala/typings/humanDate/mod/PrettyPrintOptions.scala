package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrettyPrintOptions extends js.Object {
  
  var showTime: js.UndefOr[Boolean] = js.native
}
object PrettyPrintOptions {
  
  @scala.inline
  def apply(): PrettyPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyPrintOptions]
  }
  
  @scala.inline
  implicit class PrettyPrintOptionsOps[Self <: PrettyPrintOptions] (val x: Self) extends AnyVal {
    
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
    def setShowTime(value: Boolean): Self = this.set("showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
  }
}
