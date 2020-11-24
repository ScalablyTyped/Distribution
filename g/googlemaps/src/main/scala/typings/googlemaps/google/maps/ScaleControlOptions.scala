package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the scale control. */
@js.native
trait ScaleControlOptions extends js.Object {
  
  /** Style id. Used to select what style of scale control to display. */
  var style: js.UndefOr[ScaleControlStyle] = js.native
}
object ScaleControlOptions {
  
  @scala.inline
  def apply(): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlOptions]
  }
  
  @scala.inline
  implicit class ScaleControlOptionsOps[Self <: ScaleControlOptions] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: ScaleControlStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
