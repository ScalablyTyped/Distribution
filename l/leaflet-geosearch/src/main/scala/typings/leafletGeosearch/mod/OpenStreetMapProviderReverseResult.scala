package typings.leafletGeosearch.mod

import typings.leafletGeosearch.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet-geosearch.leaflet-geosearch.Omit<leaflet-geosearch.leaflet-geosearch.SearchResult<leaflet-geosearch.leaflet-geosearch.OpenStreetMapProviderResultRaw>, 'raw'> & {  raw  :{  address  :{  house_number  :string,   road  :string,   town  :string,   city  :string,   county  :string,   state_district  :string,   state  :string,   postcode  :string,   country  :string,   country_code  :string}}} */
trait OpenStreetMapProviderReverseResult extends js.Object {
  var bounds: BoundsTuple
  var label: String
  var raw: AnonAddress
  var x: String
  var y: String
}

object OpenStreetMapProviderReverseResult {
  @scala.inline
  def apply(bounds: BoundsTuple, label: String, raw: AnonAddress, x: String, y: String): OpenStreetMapProviderReverseResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseResult]
  }
}

