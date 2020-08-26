package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoFenceID extends js.Object {
  var geoFenceID: String = js.native
}

object GeoFenceID {
  @scala.inline
  def apply(geoFenceID: String): GeoFenceID = {
    val __obj = js.Dynamic.literal(geoFenceID = geoFenceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoFenceID]
  }
  @scala.inline
  implicit class GeoFenceIDOps[Self <: GeoFenceID] (val x: Self) extends AnyVal {
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
    def setGeoFenceID(value: String): Self = this.set("geoFenceID", value.asInstanceOf[js.Any])
  }
  
}

