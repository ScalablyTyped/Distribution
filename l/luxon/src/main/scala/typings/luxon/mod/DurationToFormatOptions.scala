package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationToFormatOptions
  extends typings.std.Intl.DateTimeFormatOptions {
  
  var floor: js.UndefOr[Boolean] = js.native
  
  var round: js.UndefOr[Boolean] = js.native
}
object DurationToFormatOptions {
  
  @scala.inline
  def apply(): DurationToFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationToFormatOptions]
  }
  
  @scala.inline
  implicit class DurationToFormatOptionsOps[Self <: DurationToFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setFloor(value: Boolean): Self = this.set("floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloor: Self = this.set("floor", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
  }
}
