package typings.haversine.mod

import typings.haversine.anon.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ @js.native
trait GeoJSON extends _Coordinate {
  
  var geometry: Coordinates = js.native
}
object GeoJSON {
  
  @scala.inline
  def apply(geometry: Coordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
  
  @scala.inline
  implicit class GeoJSONOps[Self <: GeoJSON] (val x: Self) extends AnyVal {
    
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
    def setGeometry(value: Coordinates): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
}
