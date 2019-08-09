package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet-geosearch", "OpenStreetMapProvider")
@js.native
class OpenStreetMapProvider () extends BaseProvider[
      OpenStreetMapProviderOptions, 
      OpenStreetMapProviderResultRaw | OpenStreetMapProviderReverseResult
    ] {
  /** https://nominatim.org/release-docs/develop/api/Reverse/ */
  def search(options: OpenStreetMapProviderReverseSearch): js.Promise[js.Array[OpenStreetMapProviderReverseResult]] = js.native
}

