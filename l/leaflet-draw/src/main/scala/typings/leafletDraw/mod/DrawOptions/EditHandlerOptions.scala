package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditHandlerOptions extends js.Object {
  
  /**
    * The path options for how the layers will look while in edit mode.
    * If this is set to null the editable path options will not be set.
    *
    * @default { dashArray: '10, 10', fill: true, fillColor: '#fe57a1', fillOpacity: 0.1, maintainColor: false }
    */
  var selectedPathOptions: js.UndefOr[PathOptions] = js.native
}
object EditHandlerOptions {
  
  @scala.inline
  def apply(): EditHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditHandlerOptions]
  }
  
  @scala.inline
  implicit class EditHandlerOptionsOps[Self <: EditHandlerOptions] (val x: Self) extends AnyVal {
    
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
    def setSelectedPathOptions(value: PathOptions): Self = this.set("selectedPathOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedPathOptions: Self = this.set("selectedPathOptions", js.undefined)
  }
}
