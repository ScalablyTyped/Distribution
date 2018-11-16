package typings
package heredatalensLib.HNs.datalensNs.RawDataProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A helper class used in the worker thread
         * This helper class provides convenience functions you can use in the worker thread
         */

trait Helpers extends js.Object {
  /** Translates geographical coordinates (latitude, longitude) to world pixel coordinates. */
  var latLngToPixel: js.UndefOr[
    js.Function4[
      /* latitude */ Latitude, 
      /* longitude */ Longitude, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* tileSize */ TileSize, 
      PixelCoordinates
    ]
  ] = js.undefined
  /** Takes CSV data as input, parses it, and return the parsed result. */
  var parseCSV: js.UndefOr[js.Function1[/* obj */ js.Any, js.Array[_]]] = js.undefined
  /** Translates world pixel coordinates to geographical coordinates (latitude, longitude). */
  var pixelToLatLng: js.UndefOr[
    js.Function4[
      /* x */ PX, 
      /* y */ PY, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* tileSize */ TileSize, 
      GeoCoordinates
    ]
  ] = js.undefined
}

