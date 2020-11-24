package typings.heremaps.H.map.layer.IMarkerLayer

import typings.heremaps.H.map.AbstractMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
  * @property number {number} - of returned tiles
  * @property requested {number} - number of requested tiles
  * @property objects {Array<H.map.AbstractMarker>} - the marker objects within requested tiled area
  */
@js.native
trait TiledResponse extends js.Object {
  
  var number: Double = js.native
  
  var objects: js.Array[AbstractMarker] = js.native
  
  var requested: Double = js.native
}
object TiledResponse {
  
  @scala.inline
  def apply(number: Double, objects: js.Array[AbstractMarker], requested: Double): TiledResponse = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], requested = requested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledResponse]
  }
  
  @scala.inline
  implicit class TiledResponseOps[Self <: TiledResponse] (val x: Self) extends AnyVal {
    
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: AbstractMarker*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[AbstractMarker]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested(value: Double): Self = this.set("requested", value.asInstanceOf[js.Any])
  }
}
