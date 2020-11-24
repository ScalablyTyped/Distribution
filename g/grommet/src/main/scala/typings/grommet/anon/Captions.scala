package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captions extends js.Object {
  
  var captions: js.UndefOr[`5`] = js.native
  
  var controls: js.UndefOr[`5`] = js.native
  
  var icons: js.UndefOr[ClosedCaption] = js.native
  
  var scrubber: js.UndefOr[`3`] = js.native
}
object Captions {
  
  @scala.inline
  def apply(): Captions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Captions]
  }
  
  @scala.inline
  implicit class CaptionsOps[Self <: Captions] (val x: Self) extends AnyVal {
    
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
    def setCaptions(value: `5`): Self = this.set("captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptions: Self = this.set("captions", js.undefined)
    
    @scala.inline
    def setControls(value: `5`): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setIcons(value: ClosedCaption): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setScrubber(value: `3`): Self = this.set("scrubber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrubber: Self = this.set("scrubber", js.undefined)
  }
}
