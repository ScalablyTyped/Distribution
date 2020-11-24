package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLink extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var heading: js.UndefOr[Double] = js.native
  
  var pano: js.UndefOr[String] = js.native
}
object StreetViewLink {
  
  @scala.inline
  def apply(): StreetViewLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLink]
  }
  
  @scala.inline
  implicit class StreetViewLinkOps[Self <: StreetViewLink] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setPano(value: String): Self = this.set("pano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePano: Self = this.set("pano", js.undefined)
  }
}
