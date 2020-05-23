package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStreetMapProviderReverseSearch extends js.Object {
  var data: Raw
}

object OpenStreetMapProviderReverseSearch {
  @scala.inline
  def apply(data: Raw): OpenStreetMapProviderReverseSearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseSearch]
  }
}

