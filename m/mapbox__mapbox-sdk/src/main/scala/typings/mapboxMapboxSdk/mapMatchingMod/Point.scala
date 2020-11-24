package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.native
  
  var coordinates: LngLatLike = js.native
}
object Point {
  
  @scala.inline
  def apply(coordinates: LngLatLike): Point = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
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
    def setCoordinates(value: LngLatLike): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproach(value: DirectionsApproach): Self = this.set("approach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproach: Self = this.set("approach", js.undefined)
  }
}
