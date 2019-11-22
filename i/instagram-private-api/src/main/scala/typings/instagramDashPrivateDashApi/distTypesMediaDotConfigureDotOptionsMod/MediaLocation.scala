package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaLocation extends js.Object {
  var address: String
  var external_id: String
  var external_source: String
  var lat: Double
  var lng: Double
  var name: String
}

object MediaLocation {
  @scala.inline
  def apply(
    address: String,
    external_id: String,
    external_source: String,
    lat: Double,
    lng: Double,
    name: String
  ): MediaLocation = {
    val __obj = js.Dynamic.literal(address = address, external_id = external_id, external_source = external_source, lat = lat, lng = lng, name = name)
  
    __obj.asInstanceOf[MediaLocation]
  }
}

