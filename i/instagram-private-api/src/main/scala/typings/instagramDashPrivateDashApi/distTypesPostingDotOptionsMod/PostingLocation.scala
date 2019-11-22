package typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingLocation extends js.Object {
  var address: String
  var external_id: String
  var external_id_source: String
  var lat: Double
  var lng: Double
  var name: String
}

object PostingLocation {
  @scala.inline
  def apply(
    address: String,
    external_id: String,
    external_id_source: String,
    lat: Double,
    lng: Double,
    name: String
  ): PostingLocation = {
    val __obj = js.Dynamic.literal(address = address, external_id = external_id, external_id_source = external_id_source, lat = lat, lng = lng, name = name)
  
    __obj.asInstanceOf[PostingLocation]
  }
}

