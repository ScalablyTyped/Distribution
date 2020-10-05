package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveLayerOptions extends LayerOptions {
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.native
  var interactive: js.UndefOr[Boolean] = js.native
}

object InteractiveLayerOptions {
  @scala.inline
  def apply(): InteractiveLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLayerOptions]
  }
  @scala.inline
  implicit class InteractiveLayerOptionsOps[Self <: InteractiveLayerOptions] (val x: Self) extends AnyVal {
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
    def setBubblingMouseEvents(value: Boolean): Self = this.set("bubblingMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubblingMouseEvents: Self = this.set("bubblingMouseEvents", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
  }
  
}

