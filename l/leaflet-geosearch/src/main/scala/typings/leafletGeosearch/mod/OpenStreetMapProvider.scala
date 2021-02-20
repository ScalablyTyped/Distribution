package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet-geosearch", "OpenStreetMapProvider")
@js.native
class OpenStreetMapProvider () extends BaseProvider[
      OpenStreetMapProviderOptions, 
      OpenStreetMapProviderResultRaw | OpenStreetMapProviderReverseResult
    ] {
  def this(options: OpenStreetMapProviderOptions) = this()
  
  /** https://nominatim.org/release-docs/develop/api/Reverse/ */
  def search(options: OpenStreetMapProviderReverseSearch): js.Promise[js.Array[OpenStreetMapProviderReverseResult]] = js.native
}
